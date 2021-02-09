package com.emlak.services;

import java.util.List;

import com.emlak.model.Mulk;

public interface MulkService {

    public List<Mulk> getAllMulk();

    public Mulk getMulkId(int id);

    public void addMulk(Mulk mulk);

    public void deleteMulk(int id);

    Mulk getMulkById(int id);
}
