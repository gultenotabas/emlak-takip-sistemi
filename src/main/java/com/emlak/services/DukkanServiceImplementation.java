package com.emlak.services;
import com.emlak.model.Dukkan;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emlak.model.Dukkan;
import com.emlak.repository.DukkanRepository;

@Service
@Transactional


public class DukkanServiceImplementation implements DukkanService {

    @Autowired
    DukkanRepository dukkanRepository;

    @Override
    public List<Dukkan> getAllDukkan() {
        return (List<Dukkan>) dukkanRepository.findAll();
    }

    @Override
    public Dukkan getDukkanIddukkan(int iddukkan) {
        return dukkanRepository.findById(iddukkan).get();
    }

    @Override
    public void addDukkan(Dukkan dukkan) {
        dukkanRepository.save(dukkan);
    }

    @Override
    public void deleteDukkan(int iddukkan) {
        dukkanRepository.deleteById(iddukkan);
    }

    @Override
    public Dukkan getDukkanById(int id) {
        return null;
    }

}
