package com.emlak.services;

import java.util.List;

import com.emlak.model.Apartmandaire;

public interface ApartmandaireService {

    public List<Apartmandaire> getAllApartmandaire();

    public Apartmandaire getApartmandaireIdapartman(int idapartman);

    public void addApartmandaire(Apartmandaire apartmandaire);

    public void deleteApartmandaire(int idapartman);


    Apartmandaire getApartmandaireById(int id);
}