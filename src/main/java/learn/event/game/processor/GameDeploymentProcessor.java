package learn.event.game.processor;

import learn.event.game.event.DeploymentRequestedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class GameDeploymentProcessor {
    private static final String COMPLETED_TOPIC = "game-deployment-completed";

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public GameDeploymentProcessor(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener
    public void onDeploymentRequested(
            @Payload DeploymentRequestedEvent event,
            @Header(KafkaHeaders.RECEIVED_KEY) String key,
            Acknowledgment acknowledgment) {
        System.out.println();
    }
}
