package com.vieirarafael.motorderegras.domain.validacoes;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosaProcedimento;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Component
public class ValidarGlosa010QuantidadeExcedida implements ValidacaoGlosaProcedimento {
    public static String GLOSA = "Quantidade permitida excedida";
    @Override
    public Glosa validar(Documento documento) {
        if(documento.getUsuario().getCarteira().getDtVencimento().isBefore(LocalDate.now()))
            return new Glosa(GLOSA);
        return null;
    }
}
