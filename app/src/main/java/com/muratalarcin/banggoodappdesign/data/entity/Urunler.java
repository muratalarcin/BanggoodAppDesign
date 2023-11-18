package com.muratalarcin.banggoodappdesign.data.entity;


import java.io.Serializable;

public class Urunler implements Serializable {

    private int urunId;

    private String foto;
    private String baslik;
    private float fiyat;
    private boolean etiket;
    private float rating;
    private int yorum;

    public Urunler() {
    }

    public Urunler(int urunId, String foto, String baslik, float fiyat, boolean etiket, float rating, int yorum) {
        this.urunId = urunId;
        this.foto = foto;
        this.baslik = baslik;
        this.fiyat = fiyat;
        this.etiket = etiket;
        this.rating = rating;
        this.yorum = yorum;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public boolean isEtiket() {
        return etiket;
    }

    public void setEtiket(boolean etiket) {
        this.etiket = etiket;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getYorum() {
        return yorum;
    }

    public void setYorum(int yorum) {
        this.yorum = yorum;
    }
}
