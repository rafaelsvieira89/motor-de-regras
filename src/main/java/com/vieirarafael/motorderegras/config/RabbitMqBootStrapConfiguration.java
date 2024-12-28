package com.vieirarafael.motorderegras.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqBootStrapConfiguration {
    @Value("${rabbitmq.exchanges.motor-de-regras.analise.concluida}")
    private String analiseConcluidaExchange;
    @Value("${rabbitmq.queue.motor-de-regras.analise.concluida}")
    private String filaAnaliseConcluida;



    @Bean
    public FanoutExchange criarExchangeAnaliseConcluida(){
        return ExchangeBuilder.fanoutExchange(analiseConcluidaExchange)
                .build();
    }

    @Bean
    public Queue criarFilaAnaliseConcluida(){
        return QueueBuilder.durable(filaAnaliseConcluida)
                .build();
    }

    @Bean
    public Binding criarBindingAnaliseConcluida(){
        return BindingBuilder.bind(criarFilaAnaliseConcluida())
                .to(criarExchangeAnaliseConcluida());
    }


}
