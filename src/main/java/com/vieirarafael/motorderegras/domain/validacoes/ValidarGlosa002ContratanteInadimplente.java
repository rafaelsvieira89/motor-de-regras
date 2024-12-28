package com.vieirarafael.motorderegras.domain.validacoes;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosa;
import com.vieirarafael.motorderegras.domain.glosas.AcaoGlosa;
import org.springframework.stereotype.Component;

@Component
public class ValidarGlosa002ContratanteInadimplente implements ValidacaoGlosa {
    public static String GLOSA = "Contratante inadimplente";
    @Override
    public Glosa validar(Documento documento) {
        if(documento.getUsuario().isInadimplente())
            return new Glosa(GLOSA, AcaoGlosa.GLOSAR);
        return null;
    }
}
