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
public class TamirKaydi {
    private int tamirKaydiId;
    private int arabaId;
    private String tarih;
    private int ucret;
    private String servisAdi;
    private String aciklama;

    public TamirKaydi(int arabaId, String tarih, int ucret, String servisAdi, String aciklama) {
        this.arabaId = arabaId;
        this.tarih = tarih;
        this.ucret = ucret;
        this.servisAdi = servisAdi;
        this.aciklama = aciklama;
    }

    public int getTamirKaydiId() {
        return tamirKaydiId;
    }

    public void setTamirKaydiId(int tamirKaydiId) {
        this.tamirKaydiId = tamirKaydiId;
    }

    public int getArabaId() {
        return arabaId;
    }

    public void setArabaId(int arabaId) {
        this.arabaId = arabaId;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public String getServisAdi() {
        return servisAdi;
    }

    public void setServisAdi(String servisAdi) {
        this.servisAdi = servisAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    
    
}
