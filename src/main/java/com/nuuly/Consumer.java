package com.nuuly;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * This class will consume the messages that are produced on thegiven topic.
 * It will then perform some action on that message.
 */
@Component
public class Consumer {

    final String INVENTORY_TOPIC = "inventory_updates";

    @KafkaListener(topics = INVENTORY_TOPIC)
    public void processMessage(String content) {
        System.out.println(content);
    }
}
