/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OutlierCorrectionDialog.java
 *
 * Created on Nov 1, 2010, 8:56:44 PM
 */

package org.glotaran.core.main.common;

import java.awt.Component;
import java.awt.Container;
import org.glotaran.core.messages.CoreErrorMessages;

/**
 *
 * @author Sergey
 */
public class OutlierCorrectionDialog extends javax.swing.JPanel {

    private final OutlierCorrectionParameters outlierParameters;
    /** Creates new form OutlierCorrectionDialog */
    public OutlierCorrectionDialog() {
        initComponents();
        outlierParameters = new OutlierCorrectionParameters();
        dimPanel1.setPanName("Dimension 1(Times)");
        dimPanel2.setPanName("Dimension 2(Waves)");
        enableDisableControls();
    }

    public OutlierCorrectionDialog(int maxWindowSize) {
        initComponents();
        outlierParameters = new OutlierCorrectionParameters();
        jSWindSize.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(4), Integer.valueOf(3), Integer.valueOf(maxWindowSize), Integer.valueOf(1)));
        dimPanel1.setPanName("Dimension 1(Times)");
        dimPanel2.setPanName("Dimension 2(Waves)");
        enableDisableControls();
    }

    /**
     * This method is called from within the constructor to     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPReplaceIndividualOutliers = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSWindSize = new javax.swing.JSpinner();
        jTFFence = new javax.swing.JTextField();
        jPSetRegionToConstantValue = new javax.swing.JPanel();
        dimPanel1 = new org.glotaran.core.main.common.DimensionPanel();
        dimPanel2 = new org.glotaran.core.main.common.DimensionPanel();
        jLConstValue = new javax.swing.JLabel();
        jTFconstRepVal = new javax.swing.JTextField();
        jRBReplaceIndividualOutliers = new javax.swing.JRadioButton();
        jRBSetRegionToConstantValue = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(540, 130));
        setPreferredSize(new java.awt.Dimension(540, 130));
        setLayout(new java.awt.GridBagLayout());

        jPReplaceIndividualOutliers.setMinimumSize(new java.awt.Dimension(200, 100));
        jPReplaceIndividualOutliers.setPreferredSize(new java.awt.Dimension(200, 100));
        jPReplaceIndividualOutliers.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(org.openide.util.NbBundle.getMessage(OutlierCorrectionDialog.class, "OutlierCorrectionDialog.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPReplaceIndividualOutliers.add(jLabel1, gridBagConstraints);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(OutlierCorrectionDialog.class, "OutlierCorrectionDialog.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPReplaceIndividualOutliers.add(jLabel2, gridBagConstraints);

        jSWindSize.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(4), Integer.valueOf(3), null, Integer.valueOf(1)));
        jSWindSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSWindSizeStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        jPReplaceIndividualOutliers.add(jSWindSize, gridBagConstraints);

        jTFFence.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTFFence.setText(org.openide.util.NbBundle.getMessage(OutlierCorrectionDialog.class, "OutlierCorrectionDialog.jTFFence.text")); // NOI18N
        jTFFence.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFFenceKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 0, 0);
        jPReplaceIndividualOutliers.add(jTFFence, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jPReplaceIndividualOutliers, gridBagConstraints);

        jPSetRegionToConstantValue.setMinimumSize(new java.awt.Dimension(310, 100));
        jPSetRegionToConstantValue.setPreferredSize(new java.awt.Dimension(310, 100));
        jPSetRegionToConstantValue.setLayout(new java.awt.GridBagLayout());

        dimPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dimPanel1PropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPSetRegionToConstantValue.add(dimPanel1, gridBagConstraints);

        dimPanel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dimPanel2PropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPSetRegionToConstantValue.add(dimPanel2, gridBagConstraints);

        jLConstValue.setText(org.openide.util.NbBundle.getMessage(OutlierCorrectionDialog.class, "OutlierCorrectionDialog.jLConstValue.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPSetRegionToConstantValue.add(jLConstValue, gridBagConstraints);

        jTFconstRepVal.setText(org.openide.util.NbBundle.getMessage(OutlierCorrectionDialog.class, "OutlierCorrectionDialog.jTFconstRepVal.text")); // NOI18N
        jTFconstRepVal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFconstRepValKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPSetRegionToConstantValue.add(jTFconstRepVal, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jPSetRegionToConstantValue, gridBagConstraints);

        buttonGroup1.add(jRBReplaceIndividualOutliers);
        jRBReplaceIndividualOutliers.setSelected(true);
        jRBReplaceIndividualOutliers.setText(org.openide.util.NbBundle.getMessage(OutlierCorrectionDialog.class, "OutlierCorrectionDialog.jRBReplaceIndividualOutliers.text")); // NOI18N
        jRBReplaceIndividualOutliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBReplaceIndividualOutliersActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jRBReplaceIndividualOutliers, gridBagConstraints);

        buttonGroup1.add(jRBSetRegionToConstantValue);
        jRBSetRegionToConstantValue.setText(org.openide.util.NbBundle.getMessage(OutlierCorrectionDialog.class, "OutlierCorrectionDialog.jRBSetRegionToConstantValue.text")); // NOI18N
        jRBSetRegionToConstantValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSetRegionToConstantValueActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jRBSetRegionToConstantValue, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFFenceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFenceKeyReleased
       try {
            outlierParameters.setFence(Integer.parseInt(jTFFence.getText()));
        } catch (Exception e) {
            CoreErrorMessages.numberFormatException();
        }
    }//GEN-LAST:event_jTFFenceKeyReleased

    public OutlierCorrectionParameters getOutlierParameters() {
        return outlierParameters;
    }

    private void jRBReplaceIndividualOutliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBReplaceIndividualOutliersActionPerformed
        enableDisableControls();
    }//GEN-LAST:event_jRBReplaceIndividualOutliersActionPerformed

    private void jRBSetRegionToConstantValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSetRegionToConstantValueActionPerformed
        enableDisableControls();
    }//GEN-LAST:event_jRBSetRegionToConstantValueActionPerformed

    private void jTFconstRepValKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFconstRepValKeyReleased
        if (checkDouble(jTFconstRepVal.getText())){
            outlierParameters.setOcConstValue(Double.parseDouble(jTFconstRepVal.getText()));
        }
    }//GEN-LAST:event_jTFconstRepValKeyReleased

    private void jSWindSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSWindSizeStateChanged
        outlierParameters.setWindowSize((Integer)jSWindSize.getValue());
    }//GEN-LAST:event_jSWindSizeStateChanged

    private void dimPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dimPanel1PropertyChange
        if (evt.getPropertyName().equalsIgnoreCase("from")){
            outlierParameters.setOcRegConstD1(0,(double)evt.getNewValue());
        }
        if (evt.getPropertyName().equalsIgnoreCase("to")){
            outlierParameters.setOcRegConstD1(1,(double)evt.getNewValue());
        }
        
    }//GEN-LAST:event_dimPanel1PropertyChange

    private void dimPanel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dimPanel2PropertyChange
        if (evt.getPropertyName().equalsIgnoreCase("from")){
            outlierParameters.setOcRegConstD2(0,(double)evt.getNewValue());
        }
        if (evt.getPropertyName().equalsIgnoreCase("to")){
            outlierParameters.setOcRegConstD2(1,(double)evt.getNewValue());
        }
    }//GEN-LAST:event_dimPanel2PropertyChange
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.glotaran.core.main.common.DimensionPanel dimPanel1;
    private org.glotaran.core.main.common.DimensionPanel dimPanel2;
    private javax.swing.JLabel jLConstValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPReplaceIndividualOutliers;
    private javax.swing.JPanel jPSetRegionToConstantValue;
    private javax.swing.JRadioButton jRBReplaceIndividualOutliers;
    private javax.swing.JRadioButton jRBSetRegionToConstantValue;
    private javax.swing.JSpinner jSWindSize;
    private javax.swing.JTextField jTFFence;
    private javax.swing.JTextField jTFconstRepVal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setEnabled(boolean enabled) {
        if (enabled) {
            jRBReplaceIndividualOutliers.setEnabled(enabled);
            jRBSetRegionToConstantValue.setEnabled(enabled);
            enableDisableControls();
        } else {
         for (int i = 0; i < getComponentCount(); i++) {
             setEnabledRecursively(getComponent(i), enabled);
            }
        }
    }

    private void enableDisableControls() {
        setEnabledRecursively(jPReplaceIndividualOutliers, jRBReplaceIndividualOutliers.isSelected());
        setEnabledRecursively(jPSetRegionToConstantValue, jRBSetRegionToConstantValue.isSelected());
        
        outlierParameters.setIndividualOutlierC(jRBReplaceIndividualOutliers.isSelected());
        outlierParameters.setRegionValueC(jRBSetRegionToConstantValue.isSelected());
    }

    void setEnabledRecursively(Component component, boolean enabled) {
        component.setEnabled(enabled);
        if (component instanceof Container) {
            for (Component child : ((Container) component).getComponents()) {
                setEnabledRecursively(child, enabled);
            }
        }
    }

    private boolean checkDouble(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (Exception e) {
            CoreErrorMessages.numberFormatException();
            return false;
        }
    }
}
