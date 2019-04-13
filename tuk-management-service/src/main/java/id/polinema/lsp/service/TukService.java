package id.polinema.lsp.service;

import id.polinema.lsp.entity.Tuk;

import java.util.List;

public interface TukService {

    List<Tuk> findAll();
    Tuk findById(Long id);
    Tuk update(Long id,Tuk tuk);
    Tuk create(Tuk tuk);
    void delete(Long id);

}
