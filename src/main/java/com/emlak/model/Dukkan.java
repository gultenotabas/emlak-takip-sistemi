package com.emlak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dukkan")

public class Dukkan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddukkan")
    private int iddukkan;

    @Column(name="dsatilik_kiralik", nullable = false, length = 45)
    private String dsatilik_kiralik;

    @Column(name="ddepozito", nullable = false, length = 30)
    private int ddepozito;

    @Column(name="dkapora", nullable = false, length = 30)
    private int dkapora;

    @Column(name="dkirasuresi", nullable = false, length = 45)
    private String dkirasuresi;

    @Column(name="dfiyat", nullable = false, length = 30)
    private int ddfiyat;

    @Column(name="dmetrekare", nullable = false, length = 30)
    private int dmetrekare;

    @Column(name="dkonum", nullable = false, length = 45)
    private String dkonum;

    @ManyToOne
    @JoinColumn(name="iddukkan")
    private Dukkan dukkan;


    public int getIddukkan() {
        return iddukkan;
    }

    public void setIddukkan(int iddukkan) {
        this.iddukkan = iddukkan;
    }

    public String getDsatilik_kiralik() {
        return dsatilik_kiralik;
    }

    public void setDsatilik_kiralik(String dsatilik_kiralik) {
        this.dsatilik_kiralik = dsatilik_kiralik;
    }

    public int getDdepozito() {
        return ddepozito;
    }

    public void setDdepozito(int ddepozito) {
        this.ddepozito = ddepozito;
    }

    public int getDkapora() {
        return dkapora;
    }

    public void setDkapora(int dkapora) {
        this.dkapora = dkapora;
    }

    public String getDkirasuresi() {
        return dkirasuresi;
    }

    public void setDkirasuresi(String dkirasuresi) {
        this.dkirasuresi = dkirasuresi;
    }

    public int getDdfiyat() {
        return ddfiyat;
    }

    public void setDdfiyat(int ddfiyat) {
        this.ddfiyat = ddfiyat;
    }

    public int getDmetrekare() {
        return dmetrekare;
    }

    public void setDmetrekare(int dmetrekare) {
        this.dmetrekare = dmetrekare;
    }

    public String getDkonum() {
        return dkonum;
    }

    public void setDkonum(String dkonum) {
        this.dkonum = dkonum;
    }
}
