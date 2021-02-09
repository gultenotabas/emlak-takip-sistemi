package com.emlak.services;

import java.util.List;

import com.emlak.model.Bahceliev;

public interface BahcelievService {

    public List<Bahceliev> getAllBahceliev();

    public Bahceliev getBahcelievIdbahceli(int id);

    public void addBahceliev(Bahceliev bahceliev);

    public void deleteBahceliev(int id);

    Bahceliev getBahcelievById(int id);
}