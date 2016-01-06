/*
 *  @author     Jeremy Williamson
 */
package hopfieldhexpattern.controller;

import hopfieldhexpattern.model.Parameters;
import javax.swing.SwingUtilities;

public class MainThread implements Runnable {

    //associated window
    private final MainInterface mainWindow;

    //is thread running
    private boolean isRunning;

    //constructor
    public MainThread(MainInterface window) {
        mainWindow = window;
    }

    @Override
    public void run() {

        do {
            int populationThisTimeStep = 0;
            System.out.println("Running now!");
            //handle grid iteration updates here
            repaintGridPanel();

            if (populationThisTimeStep == 0) {
                mainWindow.populationDeadMessage();
                break;
            }

            if (!isRunning()) {
                mainWindow.getGameGraphics().drawGridPanel();
                break;
            }

            try {
                Thread.sleep(Parameters.getThreadDelay());
            } catch (InterruptedException ex) {
                //handle interruption here
            }

        } while (isRunning());

        mainWindow.getGameGraphics().drawGridPanel();
        repaintGridPanel();

        // Stop this thread if population dies.
        isRunning = false;
    }
    
    public boolean isRunning() {
        return isRunning;
    }

    private void repaintGridPanel() {
        SwingUtilities.invokeLater(() -> {
            // Repaint CA panels
            mainWindow.gridPanel.repaint();
        });
    }

}
