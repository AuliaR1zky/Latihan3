/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamba Notebook
 */
public class Lat3 extends javax.swing.JFrame {

    /**
     * Creates new form Lat3
     */
    public Lat3() {
        initComponents();
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
        Bilangan1 = new javax.swing.JTextField();
        Bilangan2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Btnkali = new javax.swing.JButton();
        Btnbagi = new javax.swing.JButton();
        Btntambah = new javax.swing.JButton();
        Btnkurang = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kalkulator Sederhana");

        jLabel2.setText("Bilangan 1");

        jLabel3.setText("Bilangan 2");

        Bilangan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilangan1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Operator");

        Btnkali.setText("x");
        Btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnkaliActionPerformed(evt);
            }
        });

        Btnbagi.setText(":");
        Btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbagiActionPerformed(evt);
            }
        });

        Btntambah.setText("+");
        Btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtntambahActionPerformed(evt);
            }
        });

        Btnkurang.setText("-");
        Btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnkurangActionPerformed(evt);
            }
        });

        jLabel5.setText("Hasil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Bilangan2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Bilangan1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Btnkali)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btnbagi)
                                .addGap(18, 18, 18)
                                .addComponent(Btntambah)
                                .addGap(18, 18, 18)
                                .addComponent(Btnkurang))
                            .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Bilangan1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Bilangan2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnkali)
                    .addComponent(Btnbagi)
                    .addComponent(Btntambah)
                    .addComponent(Btnkurang))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bilangan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bilangan1ActionPerformed

    }//GEN-LAST:event_Bilangan1ActionPerformed

    private void BtntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtntambahActionPerformed
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil2 = bil1+bil2;
        Hasil.setText(String.valueOf(hasil2));
    }//GEN-LAST:event_BtntambahActionPerformed

    private void BtnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnkaliActionPerformed
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil2 = bil1*bil2;
        Hasil.setText(String.valueOf(hasil2));
    }//GEN-LAST:event_BtnkaliActionPerformed

    private void BtnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbagiActionPerformed
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil2 = bil1 / bil2;
        Hasil.setText(String.valueOf(hasil2));
    }//GEN-LAST:event_BtnbagiActionPerformed

    private void BtnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnkurangActionPerformed
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil2 = bil1-bil2;
        Hasil.setText(String.valueOf(hasil2));
    }//GEN-LAST:event_BtnkurangActionPerformed

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
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lat3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lat3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bilangan1;
    private javax.swing.JTextField Bilangan2;
    private javax.swing.JButton Btnbagi;
    private javax.swing.JButton Btnkali;
    private javax.swing.JButton Btnkurang;
    private javax.swing.JButton Btntambah;
    private javax.swing.JTextField Hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
