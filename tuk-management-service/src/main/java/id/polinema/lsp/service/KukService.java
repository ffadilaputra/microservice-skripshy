package id.polinema.lsp.service;

import id.polinema.lsp.entity.Kuk;
import id.polinema.lsp.entity.Skema;

import java.util.List;

public interface KukService {
    List<Kuk> findAll();
    Kuk findById(Long id);
    Kuk update(Long id,Kuk kuk);
    Kuk create(Kuk kuk);
    void delete(Long id);
}
