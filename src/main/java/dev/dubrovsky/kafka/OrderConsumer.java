package dev.dubrovsky.kafka;

import dev.dubrovsky.kafka.data.OrderData;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "order_topic", groupId = "my-group")
    public void processOrder(OrderData orderData) {
        System.out.println("Сборочный пункт получил заказ: " + orderData.toString());
    }

    @KafkaListener(topics = "token_topic", groupId = "my-group")
    public void processToken(String message) {
        System.out.println(message);
    }

}
