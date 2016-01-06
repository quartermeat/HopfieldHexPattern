/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopfieldhexpattern.model;

import java.awt.Color;
import hopfieldhexpattern.controller.*;
import java.awt.Point;
import javax.swing.JFrame;

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
    
    private boolean isDrawn;

    public HexNode(Point newLocation, MainInterface newWindow){
        
        isDrawn = false;
        
        color = Color.BLUE;
        
        cellMetrics = new HexGridCell(Parameters.getPixelSize() / 2);
        cellMetrics.setCellByPoint(newLocation.x, newLocation.y);
        
        //array of hexagon corner coordinates
        cellCornersX = new int[6];
        cellCornersY = new int[6];

        cellMetrics.computeCorners(cellCornersX, cellCornersY);

        graphics = newWindow.getGameGraphics();
    }//end constructor
    
    public HexNode(HexGridCell newCellMetrics, MainInterface newWindow) {

        isDrawn = false;
        
        color = Color.BLUE;

        cellMetrics = newCellMetrics;
        
        //array of hexagon corner coordinates
        cellCornersX = new int[6];
        cellCornersY = new int[6];

        cellMetrics.computeCorners(cellCornersX, cellCornersY);

        graphics = newWindow.getGameGraphics();

    }//end constructor
    
    public int getIndexI(){
        return cellMetrics.getIndexI();
    }//end getIndexI()
    
    public int getIndexJ(){
        return cellMetrics.getIndexJ();
    }//end getIndexJ()
    
    public boolean isDrawn(){
        return isDrawn;
    }//end isDrawn()
    
    public void erase(){
        isDrawn = false;
    }//end erase()

    public void draw() {

        if (!isDrawn) {

            graphics.getOffscreenImageGraphics().setColor(color);
            graphics.getOffscreenImageGraphics().fillPolygon(cellCornersX, cellCornersY, 6);
            graphics.getOffscreenImageGraphics().setColor(Color.DARK_GRAY);
            graphics.getOffscreenImageGraphics().drawPolygon(cellCornersX, cellCornersY, 6);

            isDrawn = true;
        }//end if

    }//end draw
}//end Organism
