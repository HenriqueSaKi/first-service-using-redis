package br.com.hskisaki.estudoredis.models;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash
public class ValoresCestaGarantiaModels {

    @Id
    private String codCesta;
    
    private Date dataPosicao;
    private Date dataVencimentoPesq;
    private String codColigada;
    private BigDecimal vlrUtilizLastro;
    
}
