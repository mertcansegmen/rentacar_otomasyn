/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.VeritabaniYonetici;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class ArabaIade extends javax.swing.JFrame {

    int arabaId;
    int musteriId;
    VeritabaniYonetici vy = new VeritabaniYonetici();
    
    public ArabaIade() {
        initComponents();
    }

    public ArabaIade(int arabaId){
        initComponents();
        this.arabaId = arabaId;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasarKaydiDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ucretTF = new javax.swing.JTextField();
        olusturBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        aciklamaTA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        tcTF = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        arabaBilgileriLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yeniKmTF = new javax.swing.JTextField();
        hasarKaydiBtn = new javax.swing.JButton();
        tamamlaBtn = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Ücret");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Açıklama");

        ucretTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        olusturBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        olusturBtn.setText("Oluştur");
        olusturBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturBtnActionPerformed(evt);
            }
        });

        aciklamaTA.setColumns(20);
        aciklamaTA.setRows(5);
        jScrollPane1.setViewportView(aciklamaTA);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("TC");

        tcTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout hasarKaydiDialogLayout = new javax.swing.GroupLayout(hasarKaydiDialog.getContentPane());
        hasarKaydiDialog.getContentPane().setLayout(hasarKaydiDialogLayout);
        hasarKaydiDialogLayout.setHorizontalGroup(
            hasarKaydiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasarKaydiDialogLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(hasarKaydiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(olusturBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(hasarKaydiDialogLayout.createSequentialGroup()
                        .addGroup(hasarKaydiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(hasarKaydiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(ucretTF)
                            .addComponent(tcTF))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        hasarKaydiDialogLayout.setVerticalGroup(
            hasarKaydiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasarKaydiDialogLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(hasarKaydiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tcTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hasarKaydiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ucretTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hasarKaydiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(olusturBtn)
                .addGap(44, 44, 44))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Araba İade");

        arabaBilgileriLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        arabaBilgileriLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Yeni KM:");

        yeniKmTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        hasarKaydiBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hasarKaydiBtn.setText("Hasar Kaydı");
        hasarKaydiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasarKaydiBtnActionPerformed(evt);
            }
        });

        tamamlaBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tamamlaBtn.setText("Tamamla");
        tamamlaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamamlaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89)
                        .addComponent(arabaBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tamamlaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(yeniKmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addComponent(hasarKaydiBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arabaBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yeniKmTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasarKaydiBtn))
                .addGap(44, 44, 44)
                .addComponent(tamamlaBtn)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setDefaultCloseOperation(int operation) {
        this.hide();
    }

    private void hasarKaydiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasarKaydiBtnActionPerformed
        hasarKaydiDialog.setVisible(true);
        hasarKaydiDialog.setSize(600,400);
    }//GEN-LAST:event_hasarKaydiBtnActionPerformed

    private void tamamlaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamamlaBtnActionPerformed
        boolean basarili = vy.kmGuncelle(arabaId, yeniKmTF.getText());
        if(basarili)
            JOptionPane.showMessageDialog(rootPane, "Km güncellenmesi başarılı.");
        else
            JOptionPane.showMessageDialog(rootPane, "Km güncellenmesi başarısız.");
    }//GEN-LAST:event_tamamlaBtnActionPerformed

    private void olusturBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturBtnActionPerformed
        try {
            musteriId = vy.musteriIdGetir(tcTF.getText());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        boolean basarili = vy.hasarKaydiEkle(musteriId, arabaId, Integer.parseInt(ucretTF.getText()), aciklamaTA.getText());
        if(basarili)
            JOptionPane.showMessageDialog(rootPane, "Hasar kaydı ekleme başarılı oldu.");
        else
            JOptionPane.showMessageDialog(rootPane, "Hasar kaydı ekleme başarısız oldu.");
    }//GEN-LAST:event_olusturBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ArabaIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArabaIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArabaIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArabaIade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArabaIade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aciklamaTA;
    private javax.swing.JLabel arabaBilgileriLabel;
    private javax.swing.JButton hasarKaydiBtn;
    private javax.swing.JDialog hasarKaydiDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton olusturBtn;
    private javax.swing.JButton tamamlaBtn;
    private javax.swing.JTextField tcTF;
    private javax.swing.JTextField ucretTF;
    private javax.swing.JTextField yeniKmTF;
    // End of variables declaration//GEN-END:variables
}
