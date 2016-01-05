/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopfieldhexpattern.model;

import hopfieldhexpattern.auxViews.GridPanel;
import hopfieldhexpattern.controller.MainInterface;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Jeremy
 */
public class GameGraphics {

    //graphics variables
    private final Graphics offScreenImageGraphics;
    private final BufferedImage offScreenImage;
    private final GridPanel graphicsPanel;

    //private Thread thread;
    //private boolean isRunning;
    int mCursorXCoord;
    int mCursorYCoord;

    public GameGraphics(MainInterface window) {
        offScreenImage = new BufferedImage((int) Math.floor(Parameters.getImageSizeX() + 1), (int) Math.floor(Parameters.getImageSizeY() + 1), BufferedImage.TYPE_INT_RGB);
        offScreenImageGraphics = offScreenImage.getGraphics();
        graphicsPanel = (GridPanel) window.gridPanel;
        

    }//end GameGraphics

    public Graphics getOffscreenImageGraphics() {
        return offScreenImageGraphics;
    }

    public BufferedImage getOffscreenImage() {
        return offScreenImage;
    }

    public void drawGridPanel() {

        //array of hexagon corner coordinates
        int[] mCornersX = new int[6];
        int[] mCornersY = new int[6];

        //hexagon grid cell metrics
        HexGridCell cellMetrics = new HexGridCell(Parameters.getPixelSize() / 2);

        //draw hexagon grid
        for (int i = 0; i < Parameters.getGridSize(); ++i) {
            for (int j = 0; j < Parameters.getGridSize(); ++j) {
                cellMetrics.setCellIndex(i, j);
                cellMetrics.computeCorners(mCornersX, mCornersY);

                offScreenImageGraphics.setColor(Color.GRAY);
                offScreenImageGraphics.fillPolygon(mCornersX, mCornersY, 6);
                offScreenImageGraphics.setColor(Color.DARK_GRAY);
                offScreenImageGraphics.drawPolygon(mCornersX, mCornersY, 6);
            }//end for
        }//end for

    }//end drawGridPanel()

    public void drawDickButt() throws IOException {

        //array of hexagon corner coordinates
        int[] mCornersX = new int[6];
        int[] mCornersY = new int[6];

        //hexagon grid cell metrics
        HexGridCell cellMetrics = new HexGridCell(Parameters.getPixelSize() / 2);

        //Todo: handle dickbutt array
        FileInputStream fileIn;
        fileIn = new FileInputStream("dickbutt.dat");

        char character;

        //(byteChar = fileIn.read())!= -1
        for (int i = 0; i < Parameters.getGridSize(); i++) {
            for (int j = 0; j < Parameters.getGridSize(); j++) {
                character = (char) fileIn.read();

                cellMetrics.setCellIndex(j, i);
                cellMetrics.computeCorners(mCornersX, mCornersY);

                if (character == ' ') {
                    offScreenImageGraphics.setColor(Color.GRAY);
                    offScreenImageGraphics.fillPolygon(mCornersX, mCornersY, 6);
                    offScreenImageGraphics.setColor(Color.DARK_GRAY);
                    offScreenImageGraphics.drawPolygon(mCornersX, mCornersY, 6);
                } else if (character == '\r' || character == '\n') {
                    break;
                } else {
                }
            }//end for
        }//end for        

    }//end drawDickButt()

    public void drawHexagonAtMouse() {
        
        Point mousePoint = graphicsPanel.getMousePosition();

        if (mousePoint != null) {
            HexGridCell cellMetrics = new HexGridCell(Parameters.getPixelSize() / 2);

            //array of hexagon corner coordinates
            int[] mCornersX = new int[6];
            int[] mCornersY = new int[6];

            cellMetrics.setCellByPoint(mousePoint.x, mousePoint.y);

            cellMetrics.computeCorners(mCornersX, mCornersY);

            offScreenImageGraphics.setColor(Color.RED);
            offScreenImageGraphics.fillPolygon(mCornersX, mCornersY, 6);
            offScreenImageGraphics.setColor(Color.RED);
            offScreenImageGraphics.drawPolygon(mCornersX, mCornersY, 6);
        }//end if

    }//end manualGridDrawing

}
