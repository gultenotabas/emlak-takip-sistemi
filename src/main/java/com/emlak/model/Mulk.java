package com.emlak.model;


import javax.persistence.*;
import java.util.Set;

public class Mulk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="adminKullanici", nullable = false, length = 45)
    private String adminKullanici;

    @Column(name="adminSifre", nullable = false, length = 45)
    private String adminSifre;

    @OneToMany(mappedBy="mulk", cascade = CascadeType.REMOVE)
    private Set<Mulk> stajbirim;


    public String getAdminKullanici() {
        return adminKullanici;
    }

    public void setAdminKullanici(String adminKullanici) {
        this.adminKullanici = adminKullanici;
    }

    public String getAdminSifre() {
        return adminSifre;
    }

    public void setAdminSifre(String adminSifre) {
        this.adminSifre = adminSifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}