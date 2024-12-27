package com.vieirarafael.motorderegras.domain.validacoes;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosa;
import com.vieirarafael.motorderegras.domain.glosas.Glosa002ContratanteInadimplente;
import org.springframework.stereotype.Component;

@Component
public class ValidarGlosa002ContratanteInadimplente implements ValidacaoGlosa {
    @Override
    public Glosa validar(Documento documento) {
        if(documento.getUsuario().isInadimplente())
            return new Glosa002ContratanteInadimplente();
        return null;
    }
}
