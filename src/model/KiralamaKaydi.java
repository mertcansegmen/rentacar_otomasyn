/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mert
 */
public class KiralamaKaydi {
    private int kiralamaKaydiId;
    private int musteriId;
    private int arabaId;
    private int adminId;
    private String baslangicTarihi;
    private String bitisTarihi;
    private String sozlesmeTarihi;
    private int toplamUcret;

    public KiralamaKaydi(int musteriId, int arabaId, int adminId, String baslangicTarihi, String bitisTarihi, String sozlesmeTarihi, int toplamUcret) {
        this.musteriId = musteriId;
        this.arabaId = arabaId;
        this.adminId = adminId;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.sozlesmeTarihi = sozlesmeTarihi;
        this.toplamUcret = toplamUcret;
    }

    public int getKiralamaKaydiId() {
        return kiralamaKaydiId;
    }

    public void setKiralamaKaydiId(int kiralamaKaydiId) {
        this.kiralamaKaydiId = kiralamaKaydiId;
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public int getArabaId() {
        return arabaId;
    }

    public void setArabaId(int arabaId) {
        this.arabaId = arabaId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(String baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public String getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(String bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public String getSozlesmeTarihi() {
        return sozlesmeTarihi;
    }

    public void setSozlesmeTarihi(String sozlesmeTarihi) {
        this.sozlesmeTarihi = sozlesmeTarihi;
    }

    public int getToplamUcret() {
        return toplamUcret;
    }

    public void setToplamUcret(int toplamUcret) {
        this.toplamUcret = toplamUcret;
    }
    
    
}
