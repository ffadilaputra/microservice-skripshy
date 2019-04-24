package id.polinema.acessor.managementacessor.service;

import id.polinema.acessor.managementacessor.entity.Pemohon;

import java.util.List;

public interface PemohonService {
    List<Pemohon> findAll();
    Pemohon findById(Long id);
    Pemohon update(Long id,Pemohon pemohon);
    Pemohon create(Pemohon pemohon);
    void delete(Long id);
}
