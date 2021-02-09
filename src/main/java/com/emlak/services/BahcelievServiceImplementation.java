package com.emlak.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emlak.model.Bahceliev;
import com.emlak.repository.BahcelievRepository;

@Service
@Transactional

public class BahcelievServiceImplementation implements BahcelievService {

    @Autowired
    BahcelievRepository bahcelievRepository;

    @Override
    public List<Bahceliev> getAllBahceliev() {
        return (List<Bahceliev>) bahcelievRepository.findAll();
    }

    @Override
    public Bahceliev getBahcelievIdbahceli(int idbahceli) {
        return bahcelievRepository.findById(idbahceli).get();
    }

    @Override
    public void addBahceliev(Bahceliev bahceliev) {
        bahcelievRepository.save(bahceliev);
    }

    @Override
    public void deleteBahceliev(int idbahceli) {
        bahcelievRepository.deleteById(idbahceli);
    }

    @Override
    public Bahceliev getBahcelievById(int id) {
        return null;
    }

}
