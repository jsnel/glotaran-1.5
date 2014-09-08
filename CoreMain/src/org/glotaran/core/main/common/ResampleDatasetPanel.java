/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPResampleDatasetPanel.java
 *
 * Created on 24 févr. 2011, 15:52:20
 */

package org.glotaran.core.main.common;

/**
 *
 * @author sergey
 */
public class ResampleDatasetPanel extends javax.swing.JPanel {
     private int numXCh, numYCh;

    /** Creates new form JPResampleDatasetPanel */
    public ResampleDatasetPanel() {
        initComponents();
    }

    public ResampleDatasetPanel(boolean ave) {
        this();
        jCbAveraging.setEnabled(false);
        if (ave){
            jCbAveraging.setSelected(true);
        } else {
            jCbAveraging.setSelected(false);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jCbResampleX = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCbResampleY = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTYnum = new javax.swing.JTextField();
        jTXnum = new javax.swing.JTextField();
        jCbAveraging = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        jCbResampleX.setText(org.openide.util.NbBundle.getMessage(ResampleDatasetPanel.class, "ResampleDatasetPanel.jCbResampleX.text")); // NOI18N
        jCbResampleX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbResampleXActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(jCbResampleX, gridBagConstraints);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(ResampleDatasetPanel.class, "ResampleDatasetPanel.jLabel1.text")); // NOI18N
        jLabel1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        add(jLabel1, gridBagConstraints);

        jCbResampleY.setText(org.openide.util.NbBundle.getMessage(ResampleDatasetPanel.class, "ResampleDatasetPanel.jCbResampleY.text")); // NOI18N
        jCbResampleY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbResampleYActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(jCbResampleY, gridBagConstraints);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(ResampleDatasetPanel.class, "ResampleDatasetPanel.jLabel2.text")); // NOI18N
        jLabel2.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        add(jLabel2, gridBagConstraints);

        jTYnum.setText(org.openide.util.NbBundle.getMessage(ResampleDatasetPanel.class, "ResampleDatasetPanel.jTYnum.text")); // NOI18N
        jTYnum.setEnabled(false);
        jTYnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTYnumKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        add(jTYnum, gridBagConstraints);

        jTXnum.setText(org.openide.util.NbBundle.getMessage(ResampleDatasetPanel.class, "ResampleDatasetPanel.jTXnum.text")); // NOI18N
        jTXnum.setEnabled(false);
        jTXnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTXnumKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        add(jTXnum, gridBagConstraints);

        jCbAveraging.setText(org.openide.util.NbBundle.getMessage(ResampleDatasetPanel.class, "ResampleDatasetPanel.jCbAveraging.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(jCbAveraging, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jCbResampleXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbResampleXActionPerformed
        jTXnum.setEnabled(jCbResampleX.isSelected());
        jLabel2.setEnabled(jCbResampleX.isSelected());
}//GEN-LAST:event_jCbResampleXActionPerformed

    private void jCbResampleYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbResampleYActionPerformed
        jTYnum.setEnabled(jCbResampleY.isSelected());
        jLabel1.setEnabled(jCbResampleY.isSelected());
}//GEN-LAST:event_jCbResampleYActionPerformed

    private void jTYnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTYnumKeyReleased
//        if (Integer.parseInt(jTYnum.getText()) > numYCh) {
//            NotifyDescriptor errorMessage = new NotifyDescriptor.Exception(
//                    new Exception(NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("set_correct_chanNum")
//                    + NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("setLess") + String.valueOf(numYCh)));
//            DialogDisplayer.getDefault().notify(errorMessage);
//            jTYnum.setText(String.valueOf(numYCh));
//        }
}//GEN-LAST:event_jTYnumKeyReleased

    private void jTXnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTXnumKeyReleased
//        if (Integer.parseInt(jTXnum.getText()) > numXCh) {
//            NotifyDescriptor errorMessage = new NotifyDescriptor.Exception(
//                    new Exception(NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("set_correct_chanNum")
//                    + NbBundle.getBundle("org/glotaran/core/main/Bundle").getString("setLess") + String.valueOf(numXCh)));
//            DialogDisplayer.getDefault().notify(errorMessage);
//            jTXnum.setText(String.valueOf(numXCh));
//        }
}//GEN-LAST:event_jTXnumKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCbAveraging;
    private javax.swing.JCheckBox jCbResampleX;
    private javax.swing.JCheckBox jCbResampleY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTXnum;
    private javax.swing.JTextField jTYnum;
    // End of variables declaration//GEN-END:variables
    public void setInitialNumbers(int x, int y) {
        jTXnum.setText(Integer.toString(2));
        jTYnum.setText(Integer.toString(2));
        numXCh = x;
        numYCh = y;
    }

    public boolean getResampleXState() {
        return jCbResampleX.isSelected();
    }

    public boolean getResampleYState() {
        return jCbResampleY.isSelected();
    }

    public int getResampleXNum() {
        return Integer.parseInt(jTXnum.getText());
    }

    public int getResampleYNum() {
        return Integer.parseInt(jTYnum.getText());
    }

    public boolean getAverageState(){
        return jCbAveraging.isSelected();
    }

    @Override
    public void setEnabled(boolean enabled) {
        if (enabled) {
            jCbResampleX.setEnabled(enabled);
            jCbResampleY.setEnabled(enabled);
            jCbAveraging.setEnabled(enabled);
            jTXnum.setEnabled(jCbResampleX.isSelected());
            jLabel2.setEnabled(jCbResampleX.isSelected());
            jTYnum.setEnabled(jCbResampleY.isSelected());
            jLabel1.setEnabled(jCbResampleY.isSelected());
        } else {
            for (int i = 0; i < getComponentCount(); i++) {
                getComponent(i).setEnabled(false);
            }
        }
        
    }

}
