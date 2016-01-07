/*
 *  @author     Jeremy Williamson
 */
package hopfieldhexpattern.model;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

public class Parameters {

    //how big each hexagon should be
    private final static int pixelSize = 10;

    //used to calculate how big the image should be
    private final static HexGridCell gridCell = new HexGridCell(pixelSize / 2);
    private final static int gridSize = 100;

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
