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

    @Value("${rabbitmq.exchanges.motor-de-regras.analise.pendente}")
    private String analisePendenteExchange;
    @Value("${rabbitmq.queue.motor-de-regras.analise.pendente}")
    private String filaAnalisePendente;



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

    @Bean
    public FanoutExchange criarExchangeAnalisePendente(){
        return ExchangeBuilder.fanoutExchange(analisePendenteExchange)
                .build();
    }

    @Bean
    public Queue criarFilaAnalisePendente(){
        return QueueBuilder.durable(filaAnalisePendente)
                .build();
    }

    @Bean
    public Binding criarBindingAnalisePendente(){
        return BindingBuilder.bind(criarFilaAnalisePendente())
                .to(criarExchangeAnalisePendente());
    }


}
