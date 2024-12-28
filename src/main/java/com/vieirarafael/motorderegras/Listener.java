package com.vieirarafael.motorderegras;

import com.vieirarafael.motorderegras.domain.Documento;
import com.vieirarafael.motorderegras.services.ValidacaoService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@Component
public class Listener {
    private final ValidacaoService validacaoService;

    @RabbitListener(queues = "")
    public void validar(Documento documento) {
        validacaoService.validarDocumento(documento);
    }

}
