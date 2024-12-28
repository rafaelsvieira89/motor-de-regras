package com.vieirarafael.motorderegras.domain.validacoes;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosa;
import com.vieirarafael.motorderegras.domain.glosas.AcaoGlosa;
import com.vieirarafael.motorderegras.domain.glosas.Glosa002ContratanteInadimplente;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Getter
@Component
public class ValidarGlosa003BeneficiarioComInclusaoProgramada implements ValidacaoGlosa {
    public static String GLOSA = "Beneficiário com inclusão programada";
    @Override
    public Glosa validar(Documento documento) {
        if(documento.getUsuario().getDtInclusao().isAfter(LocalDate.now()))
            return new Glosa(GLOSA, AcaoGlosa.GLOSAR);
        return null;
    }
}
