package com.vieirarafael.motorderegras.domain.ports;

import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.Procedimento;

public interface SistemaErpPort {
    Glosa validar(Procedimento procedimento, int codigoGlosa);
}
