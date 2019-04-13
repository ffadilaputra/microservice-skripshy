package id.polinema.lsp.service;
import id.polinema.lsp.entity.Skema;

import java.util.List;

public interface SkemaService {

    List<Skema> findAll();
    Skema findById(Long id);
    Skema update(Long id,Skema skema);
    Skema create(Skema skema);
    void delete(Long id);


}
