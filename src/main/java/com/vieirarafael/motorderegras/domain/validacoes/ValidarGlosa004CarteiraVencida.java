package com.vieirarafael.motorderegras.domain.validacoes;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosa;
import com.vieirarafael.motorderegras.domain.glosas.AcaoGlosa;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Component
public class ValidarGlosa004CarteiraVencida implements ValidacaoGlosa {
    public static String GLOSA = "Beneficiário com carteira vencida";
    @Override
    public Glosa validar(Documento documento) {
        if(documento.getUsuario().getCarteira().getDtVencimento().isBefore(LocalDate.now()))
            return new Glosa(GLOSA, AcaoGlosa.GLOSAR);
        return null;
    }
}
