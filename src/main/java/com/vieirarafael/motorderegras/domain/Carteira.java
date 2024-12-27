package com.vieirarafael.motorderegras.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Carteira {
    private LocalDate dtVencimento;
}
