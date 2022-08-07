package fooddelivery.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fooddelivery.config.kafka.KafkaProcessor;
import fooddelivery.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationLogRepository notificationLogRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Accepted'"
    )
    public void wheneverAccepted_카카오톡알림(@Payload Accepted accepted) {
        Accepted event = accepted;
        System.out.println(
            "\n\n##### listener 카카오톡알림 : " + accepted + "\n\n"
        );

        // Sample Logic //
        NotificationLog.카카오톡알림(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Rejected'"
    )
    public void wheneverRejected_카카오톡알림(@Payload Rejected rejected) {
        Rejected event = rejected;
        System.out.println(
            "\n\n##### listener 카카오톡알림 : " + rejected + "\n\n"
        );

        // Sample Logic //
        NotificationLog.카카오톡알림(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Cooked'"
    )
    public void wheneverCooked_카카오톡알림(@Payload Cooked cooked) {
        Cooked event = cooked;
        System.out.println(
            "\n\n##### listener 카카오톡알림 : " + cooked + "\n\n"
        );

        // Sample Logic //
        NotificationLog.카카오톡알림(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Paid'"
    )
    public void wheneverPaid_카카오톡알림(@Payload Paid paid) {
        Paid event = paid;
        System.out.println(
            "\n\n##### listener 카카오톡알림 : " + paid + "\n\n"
        );

        // Sample Logic //
        NotificationLog.카카오톡알림(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_카카오톡알림(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener 카카오톡알림 : " + orderPlaced + "\n\n"
        );

        // Sample Logic //
        NotificationLog.카카오톡알림(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryStarted'"
    )
    public void wheneverDeliveryStarted_카카오톡알림(
        @Payload DeliveryStarted deliveryStarted
    ) {
        DeliveryStarted event = deliveryStarted;
        System.out.println(
            "\n\n##### listener 카카오톡알림 : " + deliveryStarted + "\n\n"
        );

        // Sample Logic //
        NotificationLog.카카오톡알림(event);
    }
    // keep

}
