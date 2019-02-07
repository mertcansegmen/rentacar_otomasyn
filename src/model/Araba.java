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
public class Araba {
    private int arabaId;
    private String marka;
    private String model;
    private int yil;
    private String km;
    private int ucret;
    private String plaka;
    private String durum;
    private String yakit;
    private String vites;
    private String kategori;

    public Araba() {}
    
    public Araba(String marka, String model, int yil, String km, int ucret, String plaka, String durum, String yakit, String vites, String kategori) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.km = km;
        this.ucret = ucret;
        this.plaka = plaka;
        this.durum = durum;
        this.yakit = yakit;
        this.vites = vites;
        this.kategori = kategori;
    }

    public int getArabaId() {
        return arabaId;
    }

    public void setArabaId(int arabaId) {
        this.arabaId = arabaId;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
}
