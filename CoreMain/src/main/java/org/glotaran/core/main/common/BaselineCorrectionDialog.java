/*
 * selectDataDialog.java
 *
 * Created on May 18, 2010, 3:44:50 PM
 */

package org.glotaran.core.main.common;

import org.glotaran.core.messages.CoreErrorMessages;

/**
 * Dialog to select parameters for BG correction 
 * @author sergey
 */
public class BaselineCorrectionDialog extends javax.swing.JPanel {
    
    private BaseLineCorrectionParameters corrParameters;
    
    /** Creates new form selectDataDialog */
    public BaselineCorrectionDialog() {
        initComponents();
        corrParameters = new BaseLineCorrectionParameters();
        dimensionPanel1.setPanName("Dimension 1(Time)");
        dimensionPanel2.setPanName("Dimension 2(Waves)");
        dimensionPanel1.setEnabled(false);
        dimensionPanel2.setEnabled(false);
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRBSubSpec = new javax.swing.JRadioButton();
        jRBSubConstCalc = new javax.swing.JRadioButton();
        jTFNumSelSpec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRBSubConst = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTFConstToSubtract = new javax.swing.JTextField();
        jRBSubFile = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTFFileName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jRBSubTimeTr = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPDimLine = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTFTimeTrBGFrom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFTimeTrBGTo = new javax.swing.JTextField();
        dimensionPanel1 = new org.glotaran.core.main.common.DimensionPanel();
        dimensionPanel2 = new org.glotaran.core.main.common.DimensionPanel();

        setMinimumSize(new java.awt.Dimension(460, 290));
        setPreferredSize(new java.awt.Dimension(460, 290));
        setLayout(new java.awt.GridBagLayout());

        buttonGroup1.add(jRBSubSpec);
        jRBSubSpec.setSelected(true);
        jRBSubSpec.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jRBSubSpec.text")); // NOI18N
        jRBSubSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSubSpecActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jRBSubSpec, gridBagConstraints);

        buttonGroup1.add(jRBSubConstCalc);
        jRBSubConstCalc.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jRBSubConstCalc.text")); // NOI18N
        jRBSubConstCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSubConstCalcActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jRBSubConstCalc, gridBagConstraints);

        jTFNumSelSpec.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTFNumSelSpec.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFNumSelSpec.text")); // NOI18N
        jTFNumSelSpec.setToolTipText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFNumSelSpec.toolTipText")); // NOI18N
        jTFNumSelSpec.setPreferredSize(new java.awt.Dimension(20, 19));
        jTFNumSelSpec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNumSelSpecKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(jTFNumSelSpec, gridBagConstraints);

        jLabel5.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jLabel5.text")); // NOI18N
        jLabel5.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jLabel5, gridBagConstraints);

        buttonGroup1.add(jRBSubConst);
        jRBSubConst.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jRBSubConst.text")); // NOI18N
        jRBSubConst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSubConstActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jRBSubConst, gridBagConstraints);

        jLabel6.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jLabel6.text")); // NOI18N
        jLabel6.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jLabel6, gridBagConstraints);

        jTFConstToSubtract.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTFConstToSubtract.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFConstToSubtract.text")); // NOI18N
        jTFConstToSubtract.setToolTipText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFConstToSubtract.toolTipText")); // NOI18N
        jTFConstToSubtract.setEnabled(false);
        jTFConstToSubtract.setPreferredSize(new java.awt.Dimension(20, 19));
        jTFConstToSubtract.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFConstToSubtractKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(jTFConstToSubtract, gridBagConstraints);
        jTFConstToSubtract.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFNumSelSpec1.AccessibleContext.accessibleDescription")); // NOI18N

        buttonGroup1.add(jRBSubFile);
        jRBSubFile.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jRBSubFile.text")); // NOI18N
        jRBSubFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSubFileActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jRBSubFile, gridBagConstraints);

        jLabel7.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jLabel7.text")); // NOI18N
        jLabel7.setToolTipText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jLabel7.toolTipText")); // NOI18N
        jLabel7.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jLabel7, gridBagConstraints);

        jTFFileName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTFFileName.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFFileName.text")); // NOI18N
        jTFFileName.setToolTipText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFFileName.toolTipText")); // NOI18N
        jTFFileName.setEnabled(false);
        jTFFileName.setPreferredSize(new java.awt.Dimension(20, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        add(jTFFileName, gridBagConstraints);
        jTFFileName.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFNumSelSpec2.AccessibleContext.accessibleDescription")); // NOI18N

        jButton2.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jButton2.text")); // NOI18N
        jButton2.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jButton2, gridBagConstraints);

        buttonGroup1.add(jRBSubTimeTr);
        jRBSubTimeTr.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jRBSubTimeTr.text")); // NOI18N
        jRBSubTimeTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSubTimeTrActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jRBSubTimeTr, gridBagConstraints);

        jLabel8.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jLabel8.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jLabel8, gridBagConstraints);

        jPDimLine.setEnabled(false);
        jPDimLine.setMinimumSize(new java.awt.Dimension(150, 20));
        jPDimLine.setPreferredSize(new java.awt.Dimension(200, 20));
        jPDimLine.setLayout(new java.awt.GridBagLayout());

        jLabel9.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jLabel9.text")); // NOI18N
        jLabel9.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPDimLine.add(jLabel9, gridBagConstraints);

        jTFTimeTrBGFrom.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFTimeTrBGFrom.text")); // NOI18N
        jTFTimeTrBGFrom.setEnabled(false);
        jTFTimeTrBGFrom.setPreferredSize(new java.awt.Dimension(20, 19));
        jTFTimeTrBGFrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFTimeTrBGFromKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPDimLine.add(jTFTimeTrBGFrom, gridBagConstraints);

        jLabel10.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jLabel10.text")); // NOI18N
        jLabel10.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPDimLine.add(jLabel10, gridBagConstraints);

        jTFTimeTrBGTo.setText(org.openide.util.NbBundle.getMessage(BaselineCorrectionDialog.class, "BaselineCorrectionDialog.jTFTimeTrBGTo.text")); // NOI18N
        jTFTimeTrBGTo.setEnabled(false);
        jTFTimeTrBGTo.setPreferredSize(new java.awt.Dimension(20, 19));
        jTFTimeTrBGTo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFTimeTrBGToKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPDimLine.add(jTFTimeTrBGTo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jPDimLine, gridBagConstraints);

        dimensionPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dimensionPanel1PropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(dimensionPanel1, gridBagConstraints);

        dimensionPanel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dimensionPanel2PropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(dimensionPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNumSelSpecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNumSelSpecKeyReleased
        try {
            corrParameters.setSelSpecNumber(Integer.parseInt(jTFNumSelSpec.getText()));
        } catch (Exception e) {
            CoreErrorMessages.numberFormatException();
        }
    }//GEN-LAST:event_jTFNumSelSpecKeyReleased

    private void jRBSubSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSubSpecActionPerformed
        enableDisableControls();
    }//GEN-LAST:event_jRBSubSpecActionPerformed

    private void jRBSubConstCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSubConstCalcActionPerformed
        enableDisableControls();
    }//GEN-LAST:event_jRBSubConstCalcActionPerformed

    private void jRBSubConstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSubConstActionPerformed
        enableDisableControls();
    }//GEN-LAST:event_jRBSubConstActionPerformed

    private void jTFConstToSubtractKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFConstToSubtractKeyReleased
        if (checkDouble(jTFConstToSubtract.getText())){
            corrParameters.setBgConst(Double.parseDouble(jTFConstToSubtract.getText()));
        }
    }//GEN-LAST:event_jTFConstToSubtractKeyReleased

    private void jRBSubFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSubFileActionPerformed
         enableDisableControls();
    }//GEN-LAST:event_jRBSubFileActionPerformed

    private void jRBSubTimeTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSubTimeTrActionPerformed
        enableDisableControls();
    }//GEN-LAST:event_jRBSubTimeTrActionPerformed

    private void jTFTimeTrBGFromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTimeTrBGFromKeyReleased
        if (checkDouble(jTFTimeTrBGFrom.getText())){
            corrParameters.setTimeTrBg(0, Double.parseDouble(jTFTimeTrBGFrom.getText()));
        }
    }//GEN-LAST:event_jTFTimeTrBGFromKeyReleased

    private void jTFTimeTrBGToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTimeTrBGToKeyReleased
        if (checkDouble(jTFTimeTrBGTo.getText())){
            corrParameters.setTimeTrBg(1, Double.parseDouble(jTFTimeTrBGTo.getText()));
        }
    }//GEN-LAST:event_jTFTimeTrBGToKeyReleased

    private void dimensionPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dimensionPanel1PropertyChange
        if (evt.getPropertyName().equalsIgnoreCase("from")){
            corrParameters.setBgRegConstD1(0,(double)evt.getNewValue());
        }
        if (evt.getPropertyName().equalsIgnoreCase("to")){
            corrParameters.setBgRegConstD1(1,(double)evt.getNewValue());
        }
    }//GEN-LAST:event_dimensionPanel1PropertyChange

    private void dimensionPanel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dimensionPanel2PropertyChange
        if (evt.getPropertyName().equalsIgnoreCase("from")){
            corrParameters.setBgRegConstD2(0,(double)evt.getNewValue());
        }
        if (evt.getPropertyName().equalsIgnoreCase("to")){
            corrParameters.setBgRegConstD2(1,(double)evt.getNewValue());
        }
    }//GEN-LAST:event_dimensionPanel2PropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.glotaran.core.main.common.DimensionPanel dimensionPanel1;
    private org.glotaran.core.main.common.DimensionPanel dimensionPanel2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDimLine;
    private javax.swing.JRadioButton jRBSubConst;
    private javax.swing.JRadioButton jRBSubConstCalc;
    private javax.swing.JRadioButton jRBSubFile;
    private javax.swing.JRadioButton jRBSubSpec;
    private javax.swing.JRadioButton jRBSubTimeTr;
    private javax.swing.JTextField jTFConstToSubtract;
    private javax.swing.JTextField jTFFileName;
    private javax.swing.JTextField jTFNumSelSpec;
    private javax.swing.JTextField jTFTimeTrBGFrom;
    private javax.swing.JTextField jTFTimeTrBGTo;
    // End of variables declaration//GEN-END:variables

    private boolean checkDouble(String number){
        try {
            Double.parseDouble(number);
            return true;
        } catch (Exception e) {
            CoreErrorMessages.numberFormatException();
            return false;
        }
    }
            
    private void enableDisableControls(){
        jTFNumSelSpec.setEnabled(jRBSubSpec.isSelected());
        jTFConstToSubtract.setEnabled(jRBSubConst.isSelected());
        jTFFileName.setEnabled(jRBSubFile.isSelected());
        jButton2.setEnabled(jRBSubFile.isSelected());
        jLabel5.setEnabled(jRBSubTimeTr.isSelected());
        jLabel8.setEnabled(jRBSubSpec.isSelected());
        jLabel6.setEnabled(jRBSubConst.isSelected());
        jLabel7.setEnabled(jRBSubFile.isSelected());
        jPDimLine.setEnabled(jRBSubTimeTr.isSelected());
        for (int i = 0; i < jPDimLine.getComponentCount(); i++){
            jPDimLine.getComponent(i).setEnabled(jRBSubTimeTr.isSelected());
        }
        dimensionPanel1.setEnabled(jRBSubConstCalc.isSelected());
        dimensionPanel2.setEnabled(jRBSubConstCalc.isSelected());
        corrParameters.setMeasuredBG(jRBSubFile.isSelected());
        corrParameters.setConstBG(jRBSubConst.isSelected());
        corrParameters.setTimetraceBG(jRBSubTimeTr.isSelected());
        corrParameters.setRegionConstBG(jRBSubConstCalc.isSelected());
        corrParameters.setSpectralBG(jRBSubSpec.isSelected());
    }

    /**
     * True if region for calculation BG was selected
     * @return boolean
     */
    public boolean getSubtractConstCalcState() {
        return jRBSubConstCalc.isSelected();
    }

    /**
     * True if number of spectra for calculation BG was selected
     * @return boolean
     */
    public boolean getSubtractSpecState() {
        return jRBSubSpec.isSelected();
    }

    /**
     * True if constant BG was selected
     * @return
     */
    public boolean getSubtractConstState() {
        return jRBSubConst.isSelected();
    }

    /**
     * True file with saved BG was selected 
     * @return boolean
     */
    public boolean getSubtractFileState() {
        return jRBSubFile.isSelected();
    }
    
    /**
     * True if time traces for calculation BG was selected
     * @return boolean
     */
    public boolean getSubtractTimeTraceState(){
        return jRBSubTimeTr.isSelected();
    }

    /**
     * Number of spectra from the beginning of image for calculation BG
     * @return int
     */
    public int getNumSpec(){
        return corrParameters.getSelSpecNumber();
    }

    /**
     * Constant to subtract as BG 
     * @return double
     */
    public double getBGConstant(){
        return corrParameters.getBgConst();
    }
    
    /**
     * Region to calculate time trace to be used as BG 
     * @return double[2]
     */
    public double[] getTimeTrBg() {
        return corrParameters.getTimeTrBg();
    }

    /**
     * Region dimension 1 (time) to calculate constant to be used as BG 
     * @return double[2]
     */
    public double[] getBgRegionDim1() {
        return corrParameters.getBgRegConstD1();
    }

    /**
     * Region dimension 2 (waves) to calculate constant to be used as BG 
     * @return double[2]
     */
    public double[] getBgRegionDim2() {
        return corrParameters.getBgRegConstD2();
    }

    /**
     * Parameters of from Baseline correction dialog
     * @return
     */
    public BaseLineCorrectionParameters getCorrParameters() {
        return corrParameters;
    }
//
//    /**
//     *
//     * @param corrParameters
//     */
//    public void setCorrParameters(BaseLineCorrectionParameters corrParameters) {
//        this.corrParameters = corrParameters;
//    }
//    
    @Override
    public void setEnabled(boolean enabled) {
        if (enabled) {
            jRBSubConst.setEnabled(enabled);
            jRBSubConstCalc.setEnabled(enabled);
            jRBSubFile.setEnabled(enabled);
            jRBSubSpec.setEnabled(enabled);
            jRBSubTimeTr.setEnabled(enabled);
            enableDisableControls();
        } else {
            for (int i = 0; i < getComponentCount(); i++) {
                getComponent(i).setEnabled(false);
            }
            for (int i = 0; i < jPDimLine.getComponentCount(); i++) {
                jPDimLine.getComponent(i).setEnabled(false);
            }
        }
    }


}