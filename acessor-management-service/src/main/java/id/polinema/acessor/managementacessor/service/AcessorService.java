package id.polinema.acessor.managementacessor.service;

import id.polinema.acessor.managementacessor.entity.Acessor;

import java.util.List;

public interface AcessorService {

    List<Acessor> findAll();
    Acessor findById(Long id);
    Acessor update(Long id,Acessor acessor);
    Acessor create(Acessor acessor);
    void delete(Long id);

}
