package id.polinema.acessor.managementacessor.implement;

import id.polinema.acessor.managementacessor.entity.Pemohon;
import id.polinema.acessor.managementacessor.repository.PemohonRepository;
import id.polinema.acessor.managementacessor.service.PemohonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PemohonImpl implements PemohonService {

    @Autowired
    PemohonRepository pemohonRepository;


    @Override
    public List<Pemohon> findAll() {
        return pemohonRepository.findAll();
    }

    @Override
    public Pemohon findById(Long id) {
        return pemohonRepository.getOne(id);
    }

    @Override
    public Pemohon update(Long id, Pemohon pemohon) {
        pemohon.getId();
        return pemohonRepository.save(pemohon);
    }

    @Override
    public Pemohon create(Pemohon pemohon) {
        return pemohonRepository.save(pemohon);
    }

    @Override
    public void delete(Long id) {
        pemohonRepository.deleteById(id);
    }
}
