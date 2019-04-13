package id.polinema.lsp.service;

import id.polinema.lsp.entity.ElemenKopetensi;
import id.polinema.lsp.entity.Skema;

import java.util.List;

public interface ElemenKopetensiService {

    List<ElemenKopetensi> findAll();
    ElemenKopetensi findById(Long id);
    ElemenKopetensi update(Long id,ElemenKopetensi elemen);
    ElemenKopetensi create(ElemenKopetensi elemen);
    void delete(Long id);

}
