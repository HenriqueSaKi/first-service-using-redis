package br.com.hskisaki.estudoredis.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.hskisaki.estudoredis.models.ValoresCestaGarantiaModels;

@Repository
public interface ValoresCestaGarantiaRepository extends CrudRepository<ValoresCestaGarantiaModels, String> {
    
}
