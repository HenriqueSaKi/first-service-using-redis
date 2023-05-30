package br.com.hskisaki.estudoredis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hskisaki.estudoredis.models.ValoresCestaGarantiaModels;
import br.com.hskisaki.estudoredis.repositories.ValoresCestaGarantiaRepository;

@Service
public class ValoresCestaGarantiaServiceImpl implements ValoresCestaGarantiaService {

    @Autowired
    private ValoresCestaGarantiaRepository valoresCestaGarantiaRepository;

    public void save(ValoresCestaGarantiaModels valoresCestaGarantiaModels) {
        valoresCestaGarantiaRepository.save(valoresCestaGarantiaModels);
    }

    public List<ValoresCestaGarantiaModels> findAll() {
        return (List<ValoresCestaGarantiaModels>) valoresCestaGarantiaRepository.findAll();
    }

    public Optional<ValoresCestaGarantiaModels> findById(String codCesta) {
        return valoresCestaGarantiaRepository.findById(codCesta);
    }
    
}
