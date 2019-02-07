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
public class HasarKaydi {
    private int hasarKaydiId;
    private int musteriId;
    private int arabaId;
    private int ucret;
    private String aciklama;

    public HasarKaydi(int musteriId, int arabaId, int ucret, String aciklama) {
        this.musteriId = musteriId;
        this.arabaId = arabaId;
        this.ucret = ucret;
        this.aciklama = aciklama;
    }

    public int getHasarKaydiId() {
        return hasarKaydiId;
    }

    public void setHasarKaydiId(int hasarKaydiId) {
        this.hasarKaydiId = hasarKaydiId;
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

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    
    
}
