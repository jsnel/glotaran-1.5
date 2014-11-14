/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJPanel.java
 *
 * Created on Feb 25, 2011, 10:54:23 PM
 */

package org.glotaran.core.main.common;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import org.glotaran.core.main.project.TGProject;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author LSP
 */
public class PreprocessingPane extends javax.swing.JPanel {
    private TGProject project;
    private File fileName;

    /** Creates new form NewJPanel */
    public PreprocessingPane() {
        initComponents();
    }

    public PreprocessingPane(TGProject project) {
        this();
        this.project = project;
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

        resampleDatasetPanel = new org.glotaran.core.main.common.ResampleDatasetPanel();
        outlierCorrectionPanel = new org.glotaran.core.main.common.OutlierCorrectionDialog();
        selectDataPanel = new org.glotaran.core.main.common.SelectDataDialog();
        baselineCorrectionPanel = new org.glotaran.core.main.common.BaselineCorrectionDialog();
        jCBResample = new javax.swing.JCheckBox();
        jCBSelect = new javax.swing.JCheckBox();
        jCBBackground = new javax.swing.JCheckBox();
        jCBOutliers = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTFFileName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jCBTotalIntensity = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        resampleDatasetPanel.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        add(resampleDatasetPanel, gridBagConstraints);

        outlierCorrectionPanel.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        add(outlierCorrectionPanel, gridBagConstraints);

        selectDataPanel.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        add(selectDataPanel, gridBagConstraints);

        baselineCorrectionPanel.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        add(baselineCorrectionPanel, gridBagConstraints);

        jCBResample.setText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jCBResample.text")); // NOI18N
        jCBResample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBResampleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jCBResample, gridBagConstraints);

        jCBSelect.setText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jCBSelect.text")); // NOI18N
        jCBSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSelectActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jCBSelect, gridBagConstraints);

        jCBBackground.setText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jCBBackground.text")); // NOI18N
        jCBBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBBackgroundActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jCBBackground, gridBagConstraints);

        jCBOutliers.setText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jCBOutliers.text")); // NOI18N
        jCBOutliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBOutliersActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jCBOutliers, gridBagConstraints);

        jLabel7.setText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jLabel7.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        add(jLabel7, gridBagConstraints);

        jTFFileName.setEditable(false);
        jTFFileName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTFFileName.setText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jTFFileName.text")); // NOI18N
        jTFFileName.setToolTipText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jTFFileName.toolTipText")); // NOI18N
        jTFFileName.setPreferredSize(new java.awt.Dimension(20, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        add(jTFFileName, gridBagConstraints);

        jButton2.setText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jButton2, gridBagConstraints);

        jCBTotalIntensity.setText(org.openide.util.NbBundle.getMessage(PreprocessingPane.class, "PreprocessingPane.jCBTotalIntensity.text")); // NOI18N
        jCBTotalIntensity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTotalIntensityActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jCBTotalIntensity, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jCBResampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBResampleActionPerformed
        resampleDatasetPanel.setEnabled(jCBResample.isSelected());
    }//GEN-LAST:event_jCBResampleActionPerformed

    private void jCBBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBBackgroundActionPerformed
        baselineCorrectionPanel.setEnabled(jCBBackground.isSelected());
    }//GEN-LAST:event_jCBBackgroundActionPerformed

    private void jCBSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSelectActionPerformed
        selectDataPanel.setEnabled(jCBSelect.isSelected());
    }//GEN-LAST:event_jCBSelectActionPerformed

    private void jCBOutliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBOutliersActionPerformed
        outlierCorrectionPanel.setEnabled(jCBOutliers.isSelected());
    }//GEN-LAST:event_jCBOutliersActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        FileSystemView fsv = new FileSystemView() {
            @Override
            public File createNewFolder(File containingDir) throws IOException {
                File folder = new File(containingDir, "New Folder");
                folder.mkdir();
                return folder;
            }
            @Override
            public File getDefaultDirectory() {
                return FileUtil.toFile(project.getDatasetsFolder(true));
            }
            @Override
            public File getHomeDirectory() {
                return FileUtil.toFile(project.getDatasetsFolder(true));
            }

            @Override
            public File[] getRoots() {
                return new File[] {FileUtil.toFile(project.getDatasetsFolder(true))};
            }
        };
        JFileChooser chooser = new JFileChooser(fsv);
        chooser.setDialogTitle("Select new dataset name ...");
        chooser.setMultiSelectionEnabled(false);
//        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            fileName = chooser.getSelectedFile();
            jTFFileName.setText(fileName.getName());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCBTotalIntensityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTotalIntensityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTotalIntensityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.glotaran.core.main.common.BaselineCorrectionDialog baselineCorrectionPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCBBackground;
    private javax.swing.JCheckBox jCBOutliers;
    private javax.swing.JCheckBox jCBResample;
    private javax.swing.JCheckBox jCBSelect;
    private javax.swing.JCheckBox jCBTotalIntensity;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTFFileName;
    private org.glotaran.core.main.common.OutlierCorrectionDialog outlierCorrectionPanel;
    private org.glotaran.core.main.common.ResampleDatasetPanel resampleDatasetPanel;
    private org.glotaran.core.main.common.SelectDataDialog selectDataPanel;
    // End of variables declaration//GEN-END:variables

    public boolean getResampleState(){
        return jCBResample.isSelected();
    }

    public boolean getOutliersState(){
        return jCBOutliers.isSelected();
    }

    public boolean getBackgroundState(){
        return jCBBackground.isSelected();
    }

    public boolean getSelectState(){
        return jCBSelect.isSelected();
    }

    public boolean getTotalIntCorState(){
        return jCBTotalIntensity.isSelected();
    }

    public BaselineCorrectionDialog getBaselineCorrectionPanel() {
        return baselineCorrectionPanel;
    }

    public OutlierCorrectionDialog getOutlierCorrectionPanel() {
        return outlierCorrectionPanel;
    }

    public ResampleDatasetPanel getResampleDatasetPanel() {
        return resampleDatasetPanel;
    }

    public SelectDataDialog getSelectDataPanel() {
        return selectDataPanel;
    }

    public File getFileName(){
        return fileName;
    }

}