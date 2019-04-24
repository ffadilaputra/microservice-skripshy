package id.polinema.acessor.managementacessor.implement;

import id.polinema.acessor.managementacessor.entity.Acessor;
import id.polinema.acessor.managementacessor.repository.AcessorRepository;
import id.polinema.acessor.managementacessor.service.AcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcessorImpl implements AcessorService {

    @Autowired
    AcessorRepository acessorRepository;

    @Override
    public List<Acessor> findAll() {
        return acessorRepository.findAll();
    }

    @Override
    public Acessor findById(Long id) {
        return acessorRepository.getOne(id);
    }

    @Override
    public Acessor update(Long id, Acessor acessor) {
        acessor.getId();
        return acessorRepository.save(acessor);
    }

    @Override
    public Acessor create(Acessor acessor) {
        return acessorRepository.save(acessor);
    }

    @Override
    public void delete(Long id) {
        acessorRepository.deleteById(id);
    }
}
