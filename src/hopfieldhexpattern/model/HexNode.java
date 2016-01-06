/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopfieldhexpattern.model;

import java.awt.Color;
import hopfieldhexpattern.controller.*;
import java.awt.Point;

/**
 *
 * @author Jeremy Williamson
 */
public class HexNode {

    //associated window and graphics for drawing
    private final GameGraphics graphics;
    private final HexGridCell cellMetrics;
    private final int[] cellCornersX;
    private final int[] cellCornersY;

    //private node color;
    private final Color color;

    //private node location;
    private final Point location;
    
    private boolean isDrawn;

    public HexNode(MainInterface newWindow, Point newLocation) {

        isDrawn = false;
        
        color = Color.BLUE;

        location = newLocation;

        cellMetrics = new HexGridCell(Parameters.getPixelSize() / 2);
        //array of hexagon corner coordinates
        cellCornersX = new int[6];
        cellCornersY = new int[6];

        cellMetrics.setCellByPoint(location.x, location.y);
        cellMetrics.computeCorners(cellCornersX, cellCornersY);

        graphics = newWindow.getGameGraphics();

    }//end organism
    
    public int getIndexI(){
        return cellMetrics.getIndexI();
    }//end getIndexI()
    
    public int getIndexJ(){
        return cellMetrics.getIndexJ();
    }//end getIndexJ()
    
    public boolean isDrawn(){
        return isDrawn;
    }

    public void draw() {

        if (location != null) {

            graphics.getOffscreenImageGraphics().setColor(color);
            graphics.getOffscreenImageGraphics().fillPolygon(cellCornersX, cellCornersY, 6);
            graphics.getOffscreenImageGraphics().setColor(Color.DARK_GRAY);
            graphics.getOffscreenImageGraphics().drawPolygon(cellCornersX, cellCornersY, 6);

            isDrawn = true;
        }//end if

    }//end draw
}//end Organism
