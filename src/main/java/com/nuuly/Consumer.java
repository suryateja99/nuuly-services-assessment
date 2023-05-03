package com.nuuly;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * This class will consume the messages that are produced on the given topic.
 * It will then perform some action on that message.
 */
@Component
public class Consumer {

    final String INVENTORY_TOPIC = "inventory_updates";

    @KafkaListener(topics = INVENTORY_TOPIC)
    public void processMessage(ConsumerRecord<String, String> content) {
        System.out.println(content);
    }
}
