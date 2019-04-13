package id.polinema.lsp.implement;

import id.polinema.lsp.entity.Tuk;
import id.polinema.lsp.entity.UnitKopetensi;
import id.polinema.lsp.repository.UnitKopetensiRepository;
import id.polinema.lsp.service.UnitKopetensiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitKopetensiImpl implements UnitKopetensiService {

    @Autowired
    UnitKopetensiRepository unitKopetensiRepository;

    @Override
    public List<UnitKopetensi> findAll() {
        return unitKopetensiRepository.findAll();
    }

    @Override
    public UnitKopetensi findById(Long id) {
        return unitKopetensiRepository.getOne(id);
    }

    @Override
    public UnitKopetensi update(Long id, UnitKopetensi unitKopetensi) {
        unitKopetensi.getId();
        return unitKopetensiRepository.save(unitKopetensi);
    }

    @Override
    public UnitKopetensi create(UnitKopetensi unitKopetensi) {
        return unitKopetensiRepository.save(unitKopetensi);
    }

    @Override
    public void delete(Long id) {
        unitKopetensiRepository.deleteById(id);
    }
}
