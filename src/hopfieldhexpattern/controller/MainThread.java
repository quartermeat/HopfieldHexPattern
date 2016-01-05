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
 * MainThread.java
 *
 * <p>This class is the main thread that is created and run from the user
 * interface. It instantiates the Grid class and holds the data on the living
 * and dead cells.
 *
 *  @author     Philip J. Underwood
 *  @email      philjunderwood@gmail.com
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
