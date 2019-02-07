/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cambodia.raven.DateChooser;
import controller.VeritabaniYonetici;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Musteri;

public class ArabaKirala extends javax.swing.JFrame {

    String adminId;
    int arabaId;
    int musteriId;
    int kiraUcreti;
    VeritabaniYonetici vy = new VeritabaniYonetici();

    public ArabaKirala() {
        initComponents();
    }

    public ArabaKirala(String adminId, int arabaId, int kiraUcreti) throws SQLException {
        initComponents();
        this.adminId = adminId;
        this.arabaId = arabaId;
        this.kiraUcreti = kiraUcreti;
        vy.arabaBilgisiGetir(arabaId, arabaBilgileriLabel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        telefonLabel = new javax.swing.JLabel();
        adresLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        adTF = new javax.swing.JTextField();
        adresTF = new javax.swing.JTextField();
        soyadTF = new javax.swing.JTextField();
        varOlanMusteriToggleBtn = new javax.swing.JToggleButton();
        tcTFVarOlan = new javax.swing.JTextField();
        tcLabelVarolan = new javax.swing.JLabel();
        dogrulaBtn = new javax.swing.JButton();
        tcLabel = new javax.swing.JLabel();
        tcTF = new javax.swing.JTextField();
        telefonTF = new javax.swing.JTextField();
        dogrulanmisMusteriLabel = new javax.swing.JLabel();
        baslangicTarihiDC = new cambodia.raven.DateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bitisTarihiDC = new cambodia.raven.DateChooser();
        tamamlaBtn = new javax.swing.JButton();
        iptalBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        arabaBilgileriLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Müşteri Bilgileri");

        adLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adLabel.setText("Ad");

        soyadLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        soyadLabel.setText("Soyad");

        telefonLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        telefonLabel.setText("Telefon");

        adresLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adresLabel.setText("Adres");

        varOlanMusteriToggleBtn.setText("Var Olan Müşteri");
        varOlanMusteriToggleBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                varOlanMusteriToggleBtnItemStateChanged(evt);
            }
        });

        tcTFVarOlan.setEnabled(false);

        tcLabelVarolan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tcLabelVarolan.setText("TC");
        tcLabelVarolan.setEnabled(false);

        dogrulaBtn.setText("Doğrula");
        dogrulaBtn.setEnabled(false);
        dogrulaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogrulaBtnActionPerformed(evt);
            }
        });

        tcLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tcLabel.setText("TC");

        dogrulanmisMusteriLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dogrulanmisMusteriLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogrulanmisMusteriLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        baslangicTarihiDC.setBackground(new java.awt.Color(73, 125, 107));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Başlangıç Tarihi");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Bitiş Tarihi");

        bitisTarihiDC.setBackground(new java.awt.Color(73, 125, 107));

        tamamlaBtn.setText("Kiralama İşlemini Tamamla");
        tamamlaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamamlaBtnActionPerformed(evt);
            }
        });

        iptalBtn.setText("İptal");
        iptalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptalBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Araba Kirala");

        arabaBilgileriLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        arabaBilgileriLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adresLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(adresTF, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telefonLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addComponent(telefonTF, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(soyadLabel)
                                                .addGap(56, 56, 56))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tcLabel)
                                                    .addComponent(adLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(80, 80, 80)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(soyadTF, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(tcTF)
                                            .addComponent(adTF))))
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(tcLabelVarolan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tcTFVarOlan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dogrulaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(varOlanMusteriToggleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dogrulanmisMusteriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(baslangicTarihiDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(tamamlaBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(bitisTarihiDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(iptalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arabaBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(arabaBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyadTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyadLabel))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcLabel)
                            .addComponent(tcTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonLabel)
                            .addComponent(telefonTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(varOlanMusteriToggleBtn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcTFVarOlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcLabelVarolan)
                            .addComponent(dogrulaBtn))
                        .addGap(18, 18, 18)
                        .addComponent(dogrulanmisMusteriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresLabel))
                .addGap(27, 27, 27)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baslangicTarihiDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tamamlaBtn)
                            .addComponent(iptalBtn)))
                    .addComponent(bitisTarihiDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void varOlanMusteriToggleBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_varOlanMusteriToggleBtnItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
            varOlanMusteriBtnSelected();
        else
            varOlanMusteriBtnNotSelected();
    }//GEN-LAST:event_varOlanMusteriToggleBtnItemStateChanged

    private void dogrulaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogrulaBtnActionPerformed
        try {
            vy.musteriGetir(tcTFVarOlan.getText(), adTF, soyadTF, tcTF, telefonTF, adresTF);
        } catch (SQLException ex) {}
        tcLabelVarolan.setEnabled(false);
        tcTFVarOlan.setEnabled(false);
        dogrulaBtn.setEnabled(false);
    }//GEN-LAST:event_dogrulaBtnActionPerformed

    private void iptalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptalBtnActionPerformed
        this.hide();
    }//GEN-LAST:event_iptalBtnActionPerformed

    private void tamamlaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamamlaBtnActionPerformed

        String baslangicTarihi = baslangicTarihiDC.getSelectedDate(DateChooser.GET_YEAR) + "-" + baslangicTarihiDC.getSelectedDate(DateChooser.GET_MONTH) + "-" + 
                                                                                                 baslangicTarihiDC.getSelectedDate(DateChooser.GET_DAY);
        String bitisTarihi = bitisTarihiDC.getSelectedDate(DateChooser.GET_YEAR) + "-" + bitisTarihiDC.getSelectedDate(DateChooser.GET_MONTH) + "-" + 
                                                                                                 bitisTarihiDC.getSelectedDate(DateChooser.GET_DAY);
        Musteri musteri = new Musteri(adTF.getText(), soyadTF.getText(), tcTF.getText(), adresTF.getText(), telefonTF.getText());
        boolean musteriEklendi, kiralamaEklendi;
        musteriEklendi = vy.musteriEkle(musteri);
        try {
            musteriId = vy.musteriIdGetir(tcTF.getText());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        kiralamaEklendi = vy.kiralamaEkle(musteriId, arabaId, adminId, baslangicTarihi, bitisTarihi, kiraUcreti);
        if(kiralamaEklendi && musteriEklendi)
            JOptionPane.showMessageDialog(rootPane, "Araba başarıyla kiralandı.");
        else
            JOptionPane.showMessageDialog(rootPane, "Kiralama başarısız oldu.");
    }//GEN-LAST:event_tamamlaBtnActionPerformed

    @Override
    public void setDefaultCloseOperation(int operation) {
        this.hide();
    }
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
            java.util.logging.Logger.getLogger(ArabaKirala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArabaKirala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArabaKirala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArabaKirala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArabaKirala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adLabel;
    private javax.swing.JTextField adTF;
    private javax.swing.JLabel adresLabel;
    private javax.swing.JTextField adresTF;
    private javax.swing.JLabel arabaBilgileriLabel;
    private cambodia.raven.DateChooser baslangicTarihiDC;
    private cambodia.raven.DateChooser bitisTarihiDC;
    private javax.swing.JButton dogrulaBtn;
    private javax.swing.JLabel dogrulanmisMusteriLabel;
    private javax.swing.JButton iptalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JTextField soyadTF;
    private javax.swing.JButton tamamlaBtn;
    private javax.swing.JLabel tcLabel;
    private javax.swing.JLabel tcLabelVarolan;
    private javax.swing.JTextField tcTF;
    private javax.swing.JTextField tcTFVarOlan;
    private javax.swing.JLabel telefonLabel;
    private javax.swing.JTextField telefonTF;
    private javax.swing.JToggleButton varOlanMusteriToggleBtn;
    // End of variables declaration//GEN-END:variables

    private void varOlanMusteriBtnSelected(){
        adLabel.setEnabled(false);
        soyadLabel.setEnabled(false);
        tcLabel.setEnabled(false);
        telefonLabel.setEnabled(false);
        adresLabel.setEnabled(false);
        adTF.setEnabled(false);
        soyadTF.setEnabled(false);
        tcTF.setEnabled(false);
        telefonTF.setEnabled(false);
        adresTF.setEnabled(false);
        
        tcLabelVarolan.setEnabled(true);
        tcTFVarOlan.setEnabled(true);
        dogrulaBtn.setEnabled(true);
    }
    
    private void varOlanMusteriBtnNotSelected(){
        adLabel.setEnabled(true);
        soyadLabel.setEnabled(true);
        tcLabel.setEnabled(true);
        telefonLabel.setEnabled(true);
        adresLabel.setEnabled(true);
        adTF.setEnabled(true);
        soyadTF.setEnabled(true);
        tcTF.setEnabled(true);
        telefonTF.setEnabled(true);
        adresTF.setEnabled(true);
        
        tcLabelVarolan.setEnabled(false);
        tcTFVarOlan.setEnabled(false);
        dogrulaBtn.setEnabled(false);
    }
    
}


