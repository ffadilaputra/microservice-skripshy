package id.polinema.lsp.service;

import id.polinema.lsp.entity.Tuk;
import id.polinema.lsp.entity.UnitKopetensi;

import java.util.List;

public interface UnitKopetensiService {
    List<UnitKopetensi> findAll();
    UnitKopetensi findById(Long id);
    UnitKopetensi update(Long id,UnitKopetensi unitKopetensi);
    UnitKopetensi create(UnitKopetensi unitKopetensi);
    void delete(Long id);
}
