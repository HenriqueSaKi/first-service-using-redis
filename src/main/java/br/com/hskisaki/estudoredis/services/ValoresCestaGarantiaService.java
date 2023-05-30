package br.com.hskisaki.estudoredis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.hskisaki.estudoredis.models.ValoresCestaGarantiaModels;

@Service
public interface ValoresCestaGarantiaService {

    void save(ValoresCestaGarantiaModels valoresCestaGarantiaModels);

    List<ValoresCestaGarantiaModels> findAll();
    
    Optional<ValoresCestaGarantiaModels> findById(String codCesta);

}
