package com.emlak.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emlak.model.Apartmandaire;
import com.emlak.repository.ApartmandaireRepository;

@Service
@Transactional

public class ApartmandaireServiceImplementation implements ApartmandaireService {

    @Autowired
    ApartmandaireRepository apartmandaireRepository;


    @Override
    public List<Apartmandaire> getAllApartmandaire() {
        return (List<Apartmandaire>) apartmandaireRepository.findAll();
    }

    @Override
    public Apartmandaire getApartmandaireIdapartman(int idapartman) {
        return apartmandaireRepository.findById(idapartman).get();
    }

    @Override
    public void addApartmandaire(Apartmandaire apartmandaire) {
        apartmandaireRepository.save(apartmandaire);
    }

    @Override
    public void deleteApartmandaire(int idapartman) {
        apartmandaireRepository.deleteById(idapartman);
    }

    @Override
    public Apartmandaire getApartmandaireById(int id) {
        return null;
    }
}