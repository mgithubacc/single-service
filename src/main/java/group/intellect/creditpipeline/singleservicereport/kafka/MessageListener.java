package group.intellect.creditpipeline.singleservicereport.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = "${message.topic.name}", groupId = "groupOne", containerFactory = "fooKafkaListenerContainerFactory")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group 'groupOne': " + message);
    }
}
