package id.polinema.lsp.implement;

import id.polinema.lsp.entity.Skema;
import id.polinema.lsp.repository.SkemaRepository;
import id.polinema.lsp.service.SkemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkemaServiceImpl implements SkemaService {

    @Autowired
    SkemaRepository skemaRepository;

    @Override
    public List<Skema> findAll() {
        return skemaRepository.findAll();
    }

    @Override
    public Skema findById(Long id) {
        return skemaRepository.getOne(id);
    }

    @Override
    public Skema update(Long id, Skema skema) {
        skema.getId();
        return skemaRepository.save(skema);
    }

    @Override
    public Skema create(Skema skema) {
        return skemaRepository.save(skema);
    }

    @Override
    public void delete(Long id) {
        skemaRepository.deleteById(id);
    }
}
