package com.vieirarafael.motorderegras.domain.validacoes;

import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.Procedimento;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosaProcedimento;
import com.vieirarafael.motorderegras.domain.ports.SistemaErpPort;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@Getter
@Component
public class ValidarGlosa010QuantidadeExcedida extends ValidacaoGlosaProcedimento {
    public static String GLOSA = "Quantidade permitida excedida";
    private final SistemaErpPort sistemaErpPort;

    @Override
    public Glosa validar(Procedimento procedimento) {
        return sistemaErpPort.validar(procedimento, 10);
    }
}
