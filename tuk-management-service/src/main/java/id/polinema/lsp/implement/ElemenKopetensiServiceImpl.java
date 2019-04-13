package id.polinema.lsp.implement;

import id.polinema.lsp.entity.ElemenKopetensi;
import id.polinema.lsp.repository.ElemenKopetensiRepository;
import id.polinema.lsp.service.ElemenKopetensiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElemenKopetensiServiceImpl implements ElemenKopetensiService {

    @Autowired
    ElemenKopetensiRepository elemenKopetensiRepository;

    @Override
    public List<ElemenKopetensi> findAll() {
        return elemenKopetensiRepository.findAll();
    }

    @Override
    public ElemenKopetensi findById(Long id) {
        return elemenKopetensiRepository.getOne(id);
    }

    @Override
    public ElemenKopetensi update(Long id, ElemenKopetensi elemen) {
        elemen.getId();
        return elemenKopetensiRepository.save(elemen);
    }

    @Override
    public ElemenKopetensi create(ElemenKopetensi elemen) {
        return elemenKopetensiRepository.save(elemen);
    }

    @Override
    public void delete(Long id) {
        elemenKopetensiRepository.deleteById(id);
    }
}
