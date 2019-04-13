package org.ffadilaputra.belajarspringrestapi.service;

import org.ffadilaputra.belajarspringrestapi.entity.Tuk;
import java.util.List;

public interface TukService {

    List<Tuk> findAll();
    Tuk findById(Long id);
    Tuk update(Long id,Tuk tuk);
    Tuk create(Tuk tuk);
    void delete(Long id);

}
