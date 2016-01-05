/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopfieldhexpattern.model;

import java.awt.Color;
import hopfieldhexpattern.controller.*;

/**
 *
 * @author Jeremy Williamson
 */
public class HexNode {
        
    //associated window and graphics for drawing
    private final MainInterface window;
    private final GameGraphics graphics;
    
    //private node color;
    private final Color color;

    public HexNode(MainInterface newWindow) {
        
        color = Color.BLUE;   

        graphics = newWindow.getGameGraphics();
        window = newWindow;  

    }//end organism

    public void draw() {
                
        graphics.drawHexagonAtMouse(window.gridPanel.getMousePosition(), color);
        
        /*//change to current location of orgnaism
        Point mousePoint = window.gridPanel.getMousePosition();

        if (mousePoint != null) {
            HexGridCell cellMetrics = new HexGridCell(Parameters.getPixelSize() / 2);

            //array of hexagon corner coordinates
            int[] mCornersX = new int[6];
            int[] mCornersY = new int[6];

            cellMetrics.setCellByPoint(mousePoint.x, mousePoint.y);

            cellMetrics.computeCorners(mCornersX, mCornersY);

            graphics.getOffscreenImageGraphics().setColor(color);
            graphics.getOffscreenImageGraphics().fillPolygon(mCornersX, mCornersY, 6);
            graphics.getOffscreenImageGraphics().setColor(Color.DARK_GRAY);
            graphics.getOffscreenImageGraphics().drawPolygon(mCornersX, mCornersY, 6);

        }//end if*/

    }//end draw
}//end Organism
