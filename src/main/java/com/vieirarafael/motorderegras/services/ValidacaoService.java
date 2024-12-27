package com.vieirarafael.motorderegras.services;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@Service
public class ValidacaoService {
    private final List<ValidacaoGlosa> validacoes;

    public void validarDocumento(Documento documento){
        var glosas = validacoes.stream().map(v-> v.validar(documento))
                .filter(Objects::nonNull)
                .toList();
    }
}
