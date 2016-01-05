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
 * MainInterface.java
 *
 * <p>This class creates the main user interface for the Game of Life.
 *
 *  @author     Philip J. Underwood
 *  @email      philjunderwood@gmail.com
 */
package hopfieldhexpattern.controller;

import hopfieldhexpattern.model.*;
import hopfieldhexpattern.auxViews.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class MainInterface extends JFrame {

    private final AboutDialog mAboutDialog;
    private final OptionsDialog mOptionsDialog;

    private final GameGraphics graphics;
    private final Thread thread;
    
    private HexNode hexNode;

    //MainInterface constructor
    public MainInterface() {
               
        mAboutDialog = new AboutDialog(this, true);
        mOptionsDialog = new OptionsDialog(this, true);

        graphics = new GameGraphics(this);
        thread = new Thread(new MainThread(this));
        
        hexNode = new HexNode(this);
        
        initComponents();
        
        setLocationRelativeTo(null);

        ImageIcon img = new ImageIcon("icon.png");
        setIconImage(img.getImage());

        optionsMenu.setEnabled(true);
        clearMenu.setEnabled(true);
        randomMenu.setEnabled(true);
        startMenu.setEnabled(true);
        stopMenu.setEnabled(false);

        graphics.drawGridPanel();
        gridPanel.repaint();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                optionsMenu.setEnabled(true);
                clearMenu.setEnabled(true);
                randomMenu.setEnabled(true);
                startMenu.setEnabled(true);
                stopMenu.setEnabled(false);
            }
        });
    }//end constructor

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainInterface().setVisible(true);
            
        });
    }

    public void populationDeadMessage() {
        JOptionPane.showMessageDialog(this, "No cells are alive.", "Game Over!", JOptionPane.INFORMATION_MESSAGE);
    }

    public GameGraphics getGameGraphics() {
        return graphics;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        gridPanel = new GridPanel(graphics.getOffscreenImage());
        controlPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();
        fileMenuSeparator = new javax.swing.JPopupMenu.Separator();
        exitMenu = new javax.swing.JMenuItem();
        gridMenu = new javax.swing.JMenu();
        clearMenu = new javax.swing.JMenuItem();
        randomMenu = new javax.swing.JMenuItem();
        gridMenuSeparator = new javax.swing.JPopupMenu.Separator();
        optionsMenu = new javax.swing.JMenuItem();
        runMenu = new javax.swing.JMenu();
        startMenu = new javax.swing.JMenuItem();
        stopMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hopfield Hex Pattern");

        gridPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridPanel.setMaximumSize(null);
        gridPanel.setPreferredSize(new java.awt.Dimension(705, 909));
        gridPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                gridPanelMouseDragged(evt);
            }
        });
        gridPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gridPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gridPanelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout gridPanelLayout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(gridPanelLayout);
        gridPanelLayout.setHorizontalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        gridPanelLayout.setVerticalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );

        controlPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );

        fileMenu.setText("File");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        fileMenu.add(menuAbout);
        fileMenu.add(fileMenuSeparator);

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenu);

        menuBar.add(fileMenu);

        gridMenu.setText("Grid");

        clearMenu.setText("Clear");
        clearMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuActionPerformed(evt);
            }
        });
        gridMenu.add(clearMenu);

        randomMenu.setText("Randomise");
        randomMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomMenuActionPerformed(evt);
            }
        });
        gridMenu.add(randomMenu);
        gridMenu.add(gridMenuSeparator);

        optionsMenu.setText("Options");
        optionsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsMenuActionPerformed(evt);
            }
        });
        gridMenu.add(optionsMenu);

        menuBar.add(gridMenu);

        runMenu.setText("Run");

        startMenu.setText("Start");
        startMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMenuActionPerformed(evt);
            }
        });
        runMenu.add(startMenu);

        stopMenu.setText("Stop");
        stopMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopMenuActionPerformed(evt);
            }
        });
        runMenu.add(stopMenu);

        menuBar.add(runMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void startMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMenuActionPerformed
        optionsMenu.setEnabled(false);
        clearMenu.setEnabled(false);
        randomMenu.setEnabled(false);
        startMenu.setEnabled(false);
        stopMenu.setEnabled(true);
        try {
            thread.start();
        } catch (IllegalThreadStateException e) {
            //handle error
        }
    }//GEN-LAST:event_startMenuActionPerformed

    private void stopMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopMenuActionPerformed
        optionsMenu.setEnabled(true);
        clearMenu.setEnabled(true);
        randomMenu.setEnabled(true);
        startMenu.setEnabled(true);
        stopMenu.setEnabled(false);
        thread.stop();
    }//GEN-LAST:event_stopMenuActionPerformed

    private void optionsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsMenuActionPerformed
        Parameters.centerWindow(mOptionsDialog);
        mOptionsDialog.setVisible(true);
    }//GEN-LAST:event_optionsMenuActionPerformed

    private void clearMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuActionPerformed
        graphics.drawGridPanel();
        gridPanel.repaint();
    }//GEN-LAST:event_clearMenuActionPerformed

    private void randomMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_randomMenuActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        Parameters.centerWindow(mAboutDialog);
        mAboutDialog.setVisible(true);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void gridPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridPanelMousePressed
        //graphics.drawHexagonAtMouse();
        
        hexNode.draw();
        gridPanel.repaint();
    }//GEN-LAST:event_gridPanelMousePressed

    private void gridPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridPanelMouseDragged
        hexNode.draw();
        gridPanel.repaint();
    }//GEN-LAST:event_gridPanelMouseDragged

    private void gridPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_gridPanelMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem clearMenu;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPopupMenu.Separator fileMenuSeparator;
    private javax.swing.JMenu gridMenu;
    private javax.swing.JPopupMenu.Separator gridMenuSeparator;
    public javax.swing.JPanel gridPanel;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem optionsMenu;
    private javax.swing.JMenuItem randomMenu;
    private javax.swing.JMenu runMenu;
    private javax.swing.JMenuItem startMenu;
    private javax.swing.JMenuItem stopMenu;
    // End of variables declaration//GEN-END:variables

}//end MainInterface
