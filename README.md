# KafkaProducer


This spring boot application exposes an api - http://localhost:8080/message.

Steps to bring this up:
1) Start kafka zoopkeeper by running %KAFKA_HOME%/bin/zookeeper-server-start.sh config/zookeeper.properties
2) Start Kafka brokers
    %KAFKA_HOME%/bin/kafka-server-start.sh config/server-1.properties
    %KAFKA_HOME%/bin/kafka-server-start.sh config/server-2.properties
3) Run main class ProducerApplication from this project


