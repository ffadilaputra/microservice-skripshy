package id.polinema.lsp.implement;

import id.polinema.lsp.entity.Kuk;
import id.polinema.lsp.repository.KukRepository;
import id.polinema.lsp.service.KukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KukServiceImpl implements KukService {

    @Autowired
    KukRepository kukRepository;

    @Override
    public List<Kuk> findAll() {
        return kukRepository.findAll();
    }

    @Override
    public Kuk findById(Long id) {
        return kukRepository.getOne(id);
    }

    @Override
    public Kuk update(Long id, Kuk kuk) {
        kuk.getId();
        return kukRepository.save(kuk);
    }

    @Override
    public Kuk create(Kuk kuk) {
        return kukRepository.save(kuk);
    }

    @Override
    public void delete(Long id) {
        kukRepository.deleteById(id);
    }
}
