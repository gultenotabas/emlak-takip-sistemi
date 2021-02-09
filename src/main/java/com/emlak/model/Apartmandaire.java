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
@Table(name = "apartmandaire")

public class Apartmandaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idapartman")
    private int idapartman;

    @Column(name="adepozito", nullable = false, length = 30)
    private int adepozito;

    @Column(name="akapora", nullable = false, length = 30)
    private int akapora;

    @Column(name="akirasuresi", nullable = false, length = 45)
    private String akirasuresi;

    @Column(name="afiyat", nullable = false, length = 30)
    private int afiyat;

    @Column(name="kat", nullable = false, length = 30)
    private int kat;

    @Column(name="akonum", nullable = false, length = 45)
    private String akonum;

    @Column(name="acephe", nullable = false, length = 45)
    private String acephe;

    @Column(name="asatilik_kiralik", nullable = false, length = 45)
    private String asatilik_kiralik;

    @Column(name="dairemetrekare", nullable = false, length = 45)
    private String dairemetrekare;

    @ManyToOne
    @JoinColumn(name="idapartman")
    private Apartmandaire apartmandaire;


    public int getIdapartman() {
        return idapartman;
    }

    public void setIdapartman(int idapartman) {
        this.idapartman = idapartman;
    }

    public int getAdepozito() {
        return adepozito;
    }

    public void setAdepozito(int adepozito) {
        this.adepozito = adepozito;
    }

    public int getAkapora() {
        return akapora;
    }

    public void setAkapora(int akapora) {
        this.akapora = akapora;
    }

    public String getAkirasuresi() {
        return akirasuresi;
    }

    public void setAkirasuresi(String akirasuresi) {
        this.akirasuresi = akirasuresi;
    }

    public int getAfiyat() {
        return afiyat;
    }

    public void setAfiyat(int adfiyat) {
        this.afiyat = adfiyat;
    }

    public int getKat() {
        return kat;
    }

    public void setKat(int kat) {
        this.kat = kat;
    }

    public String getAkonum() {
        return akonum;
    }

    public void setAkonum(String akonum) {
        this.akonum = akonum;
    }

    public String getAcephe() {
        return acephe;
    }

    public void setAcephe(String acephe) {
        this.acephe = acephe;
    }

    public String getAsatilik_kiralik() {
        return asatilik_kiralik;
    }

    public void setAsatilik_kiralik(String asatilik_kiralik) {
        this.asatilik_kiralik = asatilik_kiralik;
    }

    public String getDairemetrekare() {
        return dairemetrekare;
    }

    public void setDairemetrekare(String dairemetrekare) {
        this.dairemetrekare = dairemetrekare;
    }
}
