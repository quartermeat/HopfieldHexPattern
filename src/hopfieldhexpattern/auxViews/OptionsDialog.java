/*
 *  @author     Jeremy Williamson
 */
package hopfieldhexpattern.auxViews;

import hopfieldhexpattern.controller.MainInterface;
import hopfieldhexpattern.model.Parameters;
import java.awt.Frame;

public class OptionsDialog extends javax.swing.JDialog {

    private final MainInterface mParent;

    public OptionsDialog(Frame parent, boolean modal) {
        super(parent, modal);
        mParent = (MainInterface) parent;
        initComponents();
        cancel();
    }

    private void saveSettings() {

        Parameters.setThreadDelay(mSliderDelay.getValue());
    }

    private void ok() {
        setVisible(false);
        saveSettings();
    }

    private void cancel() {

        mSliderDelay.setValue(Parameters.getThreadDelay());
        setVisible(false);
    }

    private void apply() {
        saveSettings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mButtonOK = new javax.swing.JButton();
        mButtonCancel = new javax.swing.JButton();
        mButtonApply = new javax.swing.JButton();
        mGridPanelOptions = new javax.swing.JPanel();
        mLabelDelay = new javax.swing.JLabel();
        mSliderDelay = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        mButtonOK.setText("OK");
        mButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonOKActionPerformed(evt);
            }
        });

        mButtonCancel.setText("Cancel");
        mButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonCancelActionPerformed(evt);
            }
        });

        mButtonApply.setText("Apply");
        mButtonApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonApplyActionPerformed(evt);
            }
        });

        mGridPanelOptions.setBorder(javax.swing.BorderFactory.createTitledBorder("Grid"));

        mLabelDelay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mLabelDelay.setText("Thread Delay:");

        mSliderDelay.setMaximum(1001);
        mSliderDelay.setMinimum(1);
        mSliderDelay.setValue(1);

        javax.swing.GroupLayout mGridPanelOptionsLayout = new javax.swing.GroupLayout(mGridPanelOptions);
        mGridPanelOptions.setLayout(mGridPanelOptionsLayout);
        mGridPanelOptionsLayout.setHorizontalGroup(
            mGridPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mGridPanelOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mLabelDelay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mSliderDelay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mGridPanelOptionsLayout.setVerticalGroup(
            mGridPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mGridPanelOptionsLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(mGridPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mGridPanelOptionsLayout.createSequentialGroup()
                        .addComponent(mLabelDelay)
                        .addGap(56, 56, 56))
                    .addGroup(mGridPanelOptionsLayout.createSequentialGroup()
                        .addComponent(mSliderDelay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mGridPanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mButtonOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mButtonApply)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mGridPanelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mButtonOK)
                    .addComponent(mButtonCancel)
                    .addComponent(mButtonApply))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonOKActionPerformed
        ok();
    }//GEN-LAST:event_mButtonOKActionPerformed

    private void mButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonCancelActionPerformed
        cancel();
    }//GEN-LAST:event_mButtonCancelActionPerformed

    private void mButtonApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonApplyActionPerformed
        apply();
    }//GEN-LAST:event_mButtonApplyActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                OptionsDialog dialog = new OptionsDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mButtonApply;
    private javax.swing.JButton mButtonCancel;
    private javax.swing.JButton mButtonOK;
    private javax.swing.JPanel mGridPanelOptions;
    private javax.swing.JLabel mLabelDelay;
    private javax.swing.JSlider mSliderDelay;
    // End of variables declaration//GEN-END:variables
}
