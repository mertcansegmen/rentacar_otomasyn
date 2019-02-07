package controller;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Araba;
import model.Musteri;
import net.proteanit.sql.DbUtils;

public class VeritabaniYonetici {

    private final String url = "jdbc:mysql://localhost:3306/";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String dbname = "rentacar";
    private final String username = "root";
    private final String password = "";

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void baglan(){
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url+dbname, username, password);
            System.out.println("Veritabanına bağlantı başarılı");
            durumGuncelle();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            System.out.println(ex.getMessage() + "baglan");
        }
    }

    public boolean girisYap(String id, String sifre) throws SQLException{
        baglan();
        String sorgu = "SELECT sifre FROM admin where id = ?";
        ps = con.prepareCall(sorgu);
        ps.setString(1, id);
        rs = ps.executeQuery();
        while(rs.next()){
            String pw = rs.getString("sifre");
            return pw.equals(sifre);
        }
        return false;
    }

    public boolean arabaEkle(Araba araba){
        try{
            baglan();
            String sorgu = "INSERT INTO araba" +
                           "(marka, model, kategori, yil, km, durum, kira_ucreti, plaka, yakit, vites) " +
                           "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sorgu);
            ps.setString(1, araba.getMarka());
            ps.setString(2, araba.getModel());
            ps.setString(3, araba.getKategori());
            ps.setInt(4, araba.getYil());
            ps.setString(5, araba.getKm());
            ps.setString(6, araba.getDurum());
            ps.setInt(7, araba.getUcret());
            ps.setString(8, araba.getPlaka());
            ps.setString(9, araba.getYakit());
            ps.setString(10, araba.getVites());
            ps.execute();
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage() + "arabaEkle");
            return false;
        }
        return true;
    }

    public void butunArabalariListele(JTable table) throws SQLException{
        baglan();
        String sorgu = "SELECT * FROM araba";
        ps = con.prepareCall(sorgu);
        rs = ps.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }

    public void plakayaGoreListele(String plaka, JTable table) throws SQLException{
        baglan();
        plaka = "%" + plaka + "%";
        String sorgu = "SELECT * FROM araba WHERE plaka LIKE ?";
        ps = con.prepareCall(sorgu);
        ps.setString(1, plaka);
        rs = ps.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }

    public void arabaBilgisiGetir(int arabaId, JLabel label) {
        try {
            baglan();
            String sorgu = "SELECT UPPER(CONCAT(marka, ' ', model, '   -   ', plaka)) as araba_bilgisi FROM araba WHERE id = ?";
            ps = con.prepareCall(sorgu);
            ps.setInt(1, arabaId);
            rs = ps.executeQuery();
            rs.next();
            label.setText(rs.getString("araba_bilgisi"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + "arabaBilgisiGetir");
        }
    }

    public boolean musteriEkle(Musteri musteri){
        try {
            baglan();
            String sorgu = "INSERT INTO musteri(ad, soyad, tc, tel, adres) VALUES(?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sorgu);
            ps.setString(1, musteri.getAd());
            ps.setString(2, musteri.getSoyad());
            ps.setString(3, musteri.getTc());
            ps.setString(4, musteri.getTel());
            ps.setString(5, musteri.getAdres());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + "musteriEkle");
            return false;
        }
        return true;
    }

    public void musteriGetir(String tc, JTextField ad, JTextField soyad, JTextField tcNo, JTextField tel, JTextField adres) throws SQLException{
        baglan();
        String sorgu = "SELECT ad, soyad, tc, tel, adres FROM musteri WHERE tc = ?";
        ps = con.prepareCall(sorgu);
        ps.setString(1, tc);
        rs = ps.executeQuery();
        while(rs.next()){
            ad.setText(rs.getString("ad"));
            soyad.setText(rs.getString("soyad"));
            tcNo.setText(rs.getString("tc"));
            tel.setText(rs.getString("tel"));
            adres.setText(rs.getString("adres"));
        }
    }

    public int musteriIdGetir(String tcNo) throws SQLException{
        baglan();
        String sorgu = "SELECT id FROM musteri WHERE tc = ?";
        ps = con.prepareCall(sorgu);
        ps.setString(1, tcNo);
        rs = ps.executeQuery();
        rs.next();
        return rs.getInt("id");
    }

    public boolean kiralamaEkle(int musteriId, int arabaId, String adminId, String baslangicTarihi, 
                             String bitisTarihi, int kiraUcreti)  {
        try{
            baglan();
            String sorgu = "INSERT INTO kiralama(musteri_id, araba_id, admin_id, baslangic_tarihi, bitis_\n" +
"            String sorgu = \"INSERT INTO kiralama(musteri_id, araba_id, admin_idtarihi, " +
                           "sozlesme_tarihi, toplam_ucret) VALUES(?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sorgu);
            ps.setInt(1, musteriId);
            ps.setInt(2, arabaId);
            ps.setString(3, adminId);
            ps.setString(4, baslangicTarihi);
            ps.setString(5, bitisTarihi);
            ps.setString(6, java.time.LocalDate.now().toString());
            Date bitis = new SimpleDateFormat("yyyy-MM-dd").parse(bitisTarihi);
            Date baslangic = new SimpleDateFormat("yyyy-MM-dd").parse(baslangicTarihi);
            int gunFarki = (int)((bitis.getTime() - baslangic.getTime()) / (1000 * 60 * 60 * 24));
            System.out.println(gunFarki);
            ps.setInt(7, gunFarki * kiraUcreti);
            ps.execute();
        } catch (SQLException | ParseException ex) {
            System.out.println(ex.getMessage() + "kiralamaEkle");
            return false;
        }
        return true;
    }

    public void durumGuncelle() throws SQLException {
        String sorgu = "UPDATE araba SET durum = 'Kirada' WHERE id IN (SELECT araba_id FROM kiralama " +
                       "WHERE curdate() between baslangic_tarihi and bitis_tarihi)";
        ps = con.prepareStatement(sorgu);
        ps.executeUpdate();
    }

    public boolean kmGuncelle(int arabaId, String km) {
        try {
            baglan();
            String sorgu = "UPDATE araba SET km = ? WHERE id = ?";
            ps = con.prepareStatement(sorgu);
            ps.setString(1, km);
            ps.setInt(2, arabaId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + "kmGuncelle");
            return false;
        }
        return true;
    }
    
    public void tariheGoreAra(boolean benzin, boolean dizel, boolean manuel, boolean otomatik,
                              String baslangicTarihi, String bitisTarihi, JTable table){
        try {
            baglan();
            String yakit = "";
            String vites = "";
            if(benzin || dizel){
                if(benzin)
                    yakit = "AND yakit = 'Benzin & LPG' ";
                else
                    yakit = "AND yakit = 'Dizel' ";
            }
            if(otomatik || manuel){
                if(otomatik)
                    vites += "AND vites = 'Otomatik' ";
                else
                    vites += "AND vites = 'Manuel' ";
            }
            String sorgu = "select * from araba where id in(select id from rentacar.kiralama where araba_id not in " +
                    "(select araba_id from rentacar.kiralama " +
                    "where ((baslangic_tarihi>? and bitis_tarihi<?) " +
                    "or (baslangic_tarihi<? and bitis_tarihi>?)))) ";
            sorgu += (vites + yakit);
            System.out.println(sorgu);
            ps = con.prepareCall(sorgu);
            ps.setString(1, baslangicTarihi);
            ps.setString(2, bitisTarihi);
            ps.setString(3, bitisTarihi);
            ps.setString(4, bitisTarihi);
            rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " tariheGoreAra");
        }
       
          
    }
    public boolean bakimaGonder(int arabaId, int ucret, String servisAdi, String aciklama) {
        try {
            baglan();
            String sorgu = "INSERT INTO tamir (araba_id, tarih, ucret, servis_adi, aciklama) VALUES(?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sorgu);
            ps.setInt(1, arabaId);
            ps.setString(2, java.time.LocalDate.now().toString());
            ps.setInt(3, ucret);
            ps.setString(4, servisAdi);
            ps.setString(5, aciklama);
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + "bakimaGonder");
            return false;
        }
        return true;
    }

    public boolean durumDegistir(String durum, int arabaId) {
        try {
            baglan();
            String sorgu = "UPDATE araba SET durum = ? WHERE id = ?";
            ps = con.prepareCall(sorgu);
            ps.setString(1, durum);
            ps.setInt(2, arabaId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + "durumDegistir");
            return false;
        }
        return true;
    }
    
    public boolean hasarKaydiEkle(int musteriId, int arabaId, int ucret, String aciklama){
        try {
            baglan();
            String sorgu = "INSERT INTO hasar_kaydi(musteri_id, araba_id, ucret, aciklama)" +
                    "VALUES(?, ?, ? ,?)";
            ps = con.prepareCall(sorgu);
            ps.setInt(1, musteriId);
            ps.setInt(2, arabaId);
            ps.setInt(3, ucret);
            ps.setString(4, aciklama);
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " hasarKaydiEkle");
            return false;
        }
        return true;
    }
    
}