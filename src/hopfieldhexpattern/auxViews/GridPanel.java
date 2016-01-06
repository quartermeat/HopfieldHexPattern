/*
 *  @author     Jeremy Williamson
 */
package hopfieldhexpattern.auxViews;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class GridPanel extends JPanel {

    private final BufferedImage mBufferedImage;

    public GridPanel(BufferedImage bufferedImage) {
        mBufferedImage = bufferedImage;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(mBufferedImage, 0, 0, null);
    }

}
