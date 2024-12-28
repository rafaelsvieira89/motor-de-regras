package com.vieirarafael.motorderegras.domain;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class Usuario {
    public boolean isInadimplente() {
        return false;
    }
    private LocalDate dtInclusao;
    private Carteira carteira;
    private Contrato contrato;
}
