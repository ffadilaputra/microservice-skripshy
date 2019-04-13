package id.polinema.lsp.implement;

import id.polinema.lsp.entity.Tuk;
import id.polinema.lsp.service.TukService;
import id.polinema.lsp.repository.TukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TukServiceImpl implements TukService {

    @Autowired
    TukRepository tukRepository;

    @Override
    public List<Tuk> findAll() {
        return tukRepository.findAll();
    }

    @Override
    public Tuk findById(Long id) {
        return tukRepository.getOne(id);
    }

    @Override
    public Tuk update(Long id, Tuk tuk) {
        tuk.getId();
        return tukRepository.save(tuk);
    }

    @Override
    public Tuk create(Tuk tuk) {
        return tukRepository.save(tuk);
    }

    @Override
    public void delete(Long id) {
        tukRepository.deleteById(id);
    }
}
