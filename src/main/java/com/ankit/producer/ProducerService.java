package com.ankit.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class ProducerService {


    public void publish(Message message){
        Properties props1 = new Properties();
        props1.put("bootstrap.servers", "localhost:9093,localhost:9094");
        props1.put("acks", "all");
        props1.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props1.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer1 = new KafkaProducer<>(props1);
        producer1.send(new ProducerRecord<>("my-replicated-topic",message.getKey(), message.getValue()));

        producer1.close();
    }

}
