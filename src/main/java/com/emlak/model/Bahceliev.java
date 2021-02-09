package com.emlak.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bahceliev")

public class Bahceliev {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idbahceli")
    private int idbahceli;

    @Column(name="bcephe", nullable = false, length = 45)
    private String bcephe;


    @Column(name="bdepozito", nullable = false, length = 30)
    private int bdepozito;

    @Column(name="bkapora", nullable = false, length = 30)
    private int bkapora;

    @Column(name="bmetrekare", nullable = false, length = 45)
    private String bmetrekare;

    @Column(name="barsametrekare", nullable = false, length = 45)
    private String barsametrekare;

    @Column(name="bfiyat", nullable = false, length = 30)
    private int bfiyat;

    @Column(name="bkonum", nullable = false, length = 45)
    private String bkonum;

    @Column(name="bsatilik_kiralik", nullable = false, length = 45)
    private String bsatilik_kiralik;

    @Column(name="bkirasuresi", nullable = false, length = 45)
    private String bkirasuresi;

    @ManyToOne
    @JoinColumn(name="idbahceli")
    private Bahceliev bahceliev;


    public int getIdbahceli() {
        return idbahceli;
    }

    public void setIdbahceli(int idbahceli) {
        this.idbahceli = idbahceli;
    }

    public String getBcephe() {
        return bcephe;
    }

    public void setBcephe(String bcephe) {
        this.bcephe = bcephe;
    }

    public int getBdepozito() {
        return bdepozito;
    }

    public void setBdepozito(int bdepozito) {
        this.bdepozito = bdepozito;
    }

    public int getBkapora() {
        return bkapora;
    }

    public void setBkapora(int bkapora) {
        this.bkapora = bkapora;
    }

    public String getBmetrekare() {
        return bmetrekare;
    }

    public void setBmetrekare(String bmetrekare) {
        this.bmetrekare = bmetrekare;
    }

    public String getBarsametrekare() {
        return barsametrekare;
    }

    public void setBarsametrekare(String barsametrekare) {
        this.barsametrekare = barsametrekare;
    }

    public int getBfiyat() {
        return bfiyat;
    }

    public void setBfiyat(int bfiyat) {
        this.bfiyat = bfiyat;
    }

    public String getBkonum() {
        return bkonum;
    }

    public void setBkonum(String bkonum) {
        this.bkonum = bkonum;
    }

    public String getBsatilik_kiralik() {
        return bsatilik_kiralik;
    }

    public void setBsatilik_kiralik(String bsatilik_kiralik) {
        this.bsatilik_kiralik = bsatilik_kiralik;
    }

    public String getBkirasuresi() {
        return bkirasuresi;
    }

    public void setBkirasuresi(String bkirasuresi) {
        this.bkirasuresi = bkirasuresi;
    }
}

