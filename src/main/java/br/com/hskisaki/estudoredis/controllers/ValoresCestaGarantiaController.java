package br.com.hskisaki.estudoredis.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hskisaki.estudoredis.models.ValoresCestaGarantiaModels;
import br.com.hskisaki.estudoredis.services.ValoresCestaGarantiaServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class ValoresCestaGarantiaController {

    @Autowired
    private ValoresCestaGarantiaServiceImpl valoresCestaGarantiaService;

    @GetMapping("/isAvailable")
    public ResponseEntity<String> isAvailable () {
        return ResponseEntity.status(HttpStatus.OK).body("The service is available");
    }

    @PostMapping("/gravaValores")
    public ResponseEntity<String> save (@RequestBody ValoresCestaGarantiaModels valoresCestaGarantiaModels) {
        try {
            valoresCestaGarantiaService.save(valoresCestaGarantiaModels);
            return ResponseEntity.status(HttpStatus.OK).body("Valores registrados com sucesso no Redis.");
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao tentar gravar os valores no Redis.");
        }
    }

    @GetMapping("/listaValores")
    public ResponseEntity<List<ValoresCestaGarantiaModels>> findAll () {
        try {
            List<ValoresCestaGarantiaModels> valores = valoresCestaGarantiaService.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(valores);
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/{codCesta}")
    public ResponseEntity<Optional<ValoresCestaGarantiaModels>> findById (@PathVariable String codCesta) {
        try {
            Optional<ValoresCestaGarantiaModels> valores = valoresCestaGarantiaService.findById(codCesta);
            return ResponseEntity.status(HttpStatus.OK).body(valores);
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    
}
