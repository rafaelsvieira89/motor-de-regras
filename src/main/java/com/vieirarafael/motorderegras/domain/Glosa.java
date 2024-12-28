package com.vieirarafael.motorderegras.domain;

import com.vieirarafael.motorderegras.domain.glosas.AcaoGlosa;
import lombok.Getter;

@Getter
public class Glosa {
    private final String descricao;
    private final AcaoGlosa acaoGlosa;

    public Glosa(String descricao, AcaoGlosa acaoGlosa) {
        this.descricao = descricao;
        this.acaoGlosa = acaoGlosa;
    }



}
