/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.berat.badan;

import javax.swing.JOptionPane;

/**
 *
 * @author -asus-
 */
public class Frame1 extends javax.swing.JFrame {

   String temp ="";
   Double ti,bt,ide;
   
    public Frame1() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        hitung = new javax.swing.JButton();
        coba = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        saran = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 100, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 50, 40, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 90, 34, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 130, 70, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 160, 80, 14);
        getContentPane().add(nama);
        nama.setBounds(130, 50, 160, 30);
        getContentPane().add(tinggi);
        tinggi.setBounds(130, 90, 40, 30);
        getContentPane().add(berat);
        berat.setBounds(130, 130, 40, 30);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Perempuan");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(130, 160, 90, 23);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Laki-laki");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(220, 160, 90, 23);

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung);
        hitung.setBounds(63, 190, 70, 23);

        coba.setText("Coba Lagi");
        coba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobaActionPerformed(evt);
            }
        });
        getContentPane().add(coba);
        coba.setBounds(150, 190, 90, 23);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(260, 190, 70, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Berat Badan ideal anda adalah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 220, 180, 14);
        getContentPane().add(ideal);
        ideal.setBounds(230, 220, 40, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 220, 14, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 250, 150, 14);
        getContentPane().add(hasil);
        hasil.setBounds(10, 270, 390, 30);
        getContentPane().add(saran);
        saran.setBounds(10, 310, 390, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("cm");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 100, 17, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 140, 14, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        if(tinggi.getText().equals("")||berat.getText().equals("")||nama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kotak Isian Harus diisi semua");
        } else if(jRadioButton2.isSelected()||jRadioButton1.isSelected()){
            try{
                Proses();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Masukkan ada yang salah");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Radio Button harus dipilih");
        }
        
    }//GEN-LAST:event_hitungActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
         
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void cobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobaActionPerformed
        nama.setText("");
        tinggi.setText("");
        berat.setText("");
        ideal.setText("");
        hasil.setText("");
        saran.setText("");
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_cobaActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton coba;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JTextField ideal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField saran;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        ti = Double.parseDouble(tinggi.getText());
        bt = Double.parseDouble(berat.getText());
        
        if(jRadioButton1.isSelected()){
            ide = (ti - 100) * 1;
        } else if (jRadioButton2.isSelected()){
            ide = (ti - 104) * 1;
        }
        temp = Double.toString(ide.intValue());
        
        if(ide < bt){
            ideal.setText(temp);
            hasil.setText("Maaf " + nama.getText() +", Sepertinya anda Overweight");
            saran.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
        } else if (ide > bt){
            ideal.setText(temp);
            hasil.setText("Maaf " + nama.getText()+", Sepertinya anda Underweight");
            saran.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        } else{
            ideal.setText(temp);
            hasil.setText("Hallo" + nama.getText() + ", Berat badan anda sudah ideal");
            saran.setText("Lanjutkan pola makan teratur dan gaya hidup sehat :) ");
        }
    }
}
