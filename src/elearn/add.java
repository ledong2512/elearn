/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elearn;

import datacon.addData;
import file.coppy;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 123
 */
public class add extends javax.swing.JFrame {

    /**
     * Creates new form add
     */
    public add() {
        initComponents();
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        
        Mainform a=new Mainform();
        a.setVisible(true);

      }
    });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tuNgu = new javax.swing.JTextField();
        phienAm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        nghia = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        imageBut = new javax.swing.JButton();
        loaiTu = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        hashtag = new javax.swing.JTextField();
        saveBut = new javax.swing.JButton();
        filePath = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Từ:");

        jLabel2.setText("Phiên âm:");

        jLabel3.setText("Nghĩa:");

        nghia.setColumns(20);
        nghia.setRows(5);
        nghia.setWrapStyleWord(true);
        jScrollPane1.setViewportView(nghia);

        jLabel4.setText("Ảnh:");

        imageBut.setText("Chọn ảnh");
        imageBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButActionPerformed(evt);
            }
        });

        loaiTu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "V", "Adj", "Adv", "Vp", "Np", "idioms", "Clause" }));
        loaiTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaiTuActionPerformed(evt);
            }
        });

        jLabel5.setText("Hashtag:#");

        hashtag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashtagActionPerformed(evt);
            }
        });

        saveBut.setText("Lưu");
        saveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tuNgu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(loaiTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phienAm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imageBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(saveBut, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tuNgu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loaiTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phienAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageBut)
                    .addComponent(jLabel4)
                    .addComponent(filePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(hashtag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(saveBut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loaiTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaiTuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loaiTuActionPerformed

    private void hashtagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashtagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hashtagActionPerformed
    
    private boolean checkData(){
        if ("".equals(tuNgu.getText())||"".equals(phienAm.getText())||"".equals(hashtag.getText())
                ||"".equals(nghia.getText())||"".equals(filePath.getText())) 
            return false;
        return true;
    }
    private void saveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButActionPerformed
        if(checkData()){
        // phần này là để coppy file ra img
        String from=filePath.getText();
        String to="src/img/"+tuNgu.getText()+loaiTu.getSelectedItem().toString()+".png";
        File source=new File(from);
        File dest=new File(to);
        try {
            coppy.copyFile(source, dest);
        } catch (IOException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ghi data ra database
        String hashTag="#"+hashtag.getText();
        addData add=new addData();
        String addCheck=add.addSQL(tuNgu.getText(),phienAm.getText() ,nghia.getText(),hashTag, loaiTu.getSelectedItem().toString(), to);
        if (addCheck!="ok") JOptionPane.showMessageDialog(this, "Dữ liệu trùng, kiểm tra lại kiểu, từ");
        if (addCheck=="ok") {
            this.setVisible(false);
            Mainform a=new Mainform();
            a.setVisible(true);
            
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Mời bạn kiểm tra lại có trường trống");
        }
    }//GEN-LAST:event_saveButActionPerformed

    private void imageButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButActionPerformed
            JFileChooser chooser=new JFileChooser();
            chooser.setDialogTitle("Chọn ảnh");
            chooser.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter filter=new FileNameExtensionFilter("PNG only", "png");
            chooser.addChoosableFileFilter(filter);
            chooser.showOpenDialog(null);
            String file=chooser.getSelectedFile().getPath();
            filePath.setText(file);
            
            
            
            // TODO add your handling code here:
    }//GEN-LAST:event_imageButActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel filePath;
    private javax.swing.JTextField hashtag;
    private javax.swing.JButton imageBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> loaiTu;
    private javax.swing.JTextArea nghia;
    private javax.swing.JTextField phienAm;
    private javax.swing.JButton saveBut;
    private javax.swing.JTextField tuNgu;
    // End of variables declaration//GEN-END:variables
}