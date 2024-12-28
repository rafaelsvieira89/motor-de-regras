package com.vieirarafael.motorderegras.infrastructure;

import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.Procedimento;
import com.vieirarafael.motorderegras.domain.ports.SistemaErpPort;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoSistemaErp implements SistemaErpPort {
    @Override
    public Glosa validar(Procedimento procedimento, int glosa) {
        return null;
    }
}
