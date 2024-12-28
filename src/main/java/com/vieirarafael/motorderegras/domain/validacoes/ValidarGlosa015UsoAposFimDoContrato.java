package com.vieirarafael.motorderegras.domain.validacoes;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.domain.Glosa;
import com.vieirarafael.motorderegras.domain.Procedimento;
import com.vieirarafael.motorderegras.domain.ValidacaoGlosa;
import com.vieirarafael.motorderegras.domain.ports.SistemaErpPort;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Component
public class ValidarGlosa015UsoAposFimDoContrato implements ValidacaoGlosa {
    public static String GLOSA = "Uso apos o fim do contrato";
    private final SistemaErpPort sistemaErpPort;

    @Override
    public Glosa validar(Documento documento) {
        if(documento.getUsuario().getContrato().getDtVencimento().isBefore(LocalDate.now()))
            return new Glosa(GLOSA);
        return null;
    }
}
