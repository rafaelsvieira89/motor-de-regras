package com.vieirarafael.motorderegras.domain.validacoes;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosa;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ValidarGlosa005BeneficiarioEmCarencia implements ValidacaoGlosa {
    public static String GLOSA = "Beneficiário em carencia";
    @Override
    public Glosa validar(Documento documento) {
        throw new UnsupportedOperationException("Método validar ainda não implementado.");
    }
}
