/*
 *   GameOfLife - An implementation of John H. Conway's cellular automaton.
 *   Copyright (C) 2015  Philip J. Underwood (philjunderwood@gmail.com)
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Parameters.java
 *
 * This class stores all of the parameters configured from the interface.
 *
 *  @author     Philip J. Underwood
 *  @email      philjunderwood@gmail.com
 */
package hopfieldhexpattern.model;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

public class Parameters {

    //how big each hexagon should be
    private static int pixelSize = 10;

    //used to calculate how big the image should be
    private static HexGridCell gridCell = new HexGridCell(pixelSize / 2);
    private static int gridSize = 100;

    //really want to make this a formula so sizes can be changed dynamically, but haven't gotten it to work quite right
    private static int mImageSizeX = 705;
    private static int mImageSizeY = (gridSize * gridCell.HEIGHT) + gridCell.HEIGHT;
    private static int threadDelay = 0;

    public static int getGridSize() {
        return gridSize;
    }

    public static int getPixelSize() {
        return pixelSize;
    }

    public static int getImageSizeX() {
        return mImageSizeX;
    }

    public static int getImageSizeY() {
        return mImageSizeY;
    }

    public static int getThreadDelay() {
        return threadDelay;
    }

    public static void setGridSize(int gridSize) {
        gridSize = gridSize;
    }

    public static void resetPixelSize() {
        //mPixelSize = Parameters.getImageSize() / Parameters.getGridSize();
    }

    public static void setImageSizeX(int imageSizeX) {
        mImageSizeX = imageSizeX;
    }

    public static void setImageSizeY(int imageSizeY) {
        mImageSizeY = imageSizeY;
    }

    public static void setThreadDelay(int threadDelay) {
        threadDelay = threadDelay;
    }

    public static void centerWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}
