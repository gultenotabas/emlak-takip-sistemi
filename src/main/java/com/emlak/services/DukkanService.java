package com.emlak.services;

import java.util.List;

import com.emlak.model.Dukkan;

public interface DukkanService {

    public List<Dukkan> getAllDukkan();

    public Dukkan getDukkanIddukkan(int id);

    public void addDukkan(Dukkan dukkan);

    public void deleteDukkan(int id);

    Dukkan getDukkanById(int id);
}