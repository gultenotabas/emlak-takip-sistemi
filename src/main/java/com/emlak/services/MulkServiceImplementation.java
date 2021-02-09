package com.emlak.services;

import java.util.List;

import com.emlak.model.Mulk;
import com.emlak.repository.MulkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class MulkServiceImplementation implements MulkService{

    @Autowired
    MulkRepository mulkRepository;

    @Override
    public List<Mulk> getAllMulk() {
        return (List<Mulk>) mulkRepository.findAll();
    }

    @Override
    public Mulk getMulkId(int id) {
        return mulkRepository.findById(id).get();
    }

    @Override
    public void addMulk(Mulk mulk) {
        mulkRepository.save(mulk);
    }

    @Override
    public void deleteMulk(int id) {
        mulkRepository.deleteById(id);
    }

    @Override
    public Mulk getMulkById(int id) {
        return null;
    }
}