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
    StoreOrderRepository storeOrderRepository;

    @Autowired
    MenuRepository menuRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @Autowired
    fooddelivery.external.OrderService orderService;

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Paid'"
    )
    public void wheneverPaid_주문목록에추가(@Payload Paid paid) {
        Paid event = paid;
        System.out.println(
            "\n\n##### listener 주문목록에추가 : " + paid + "\n\n"
        );

        // REST Request Sample

        // orderService.getOrder(/** mapping value needed */);

        // Sample Logic //
        StoreOrder.주문목록에추가(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCanceled'"
    )
    public void wheneverOrderCanceled_주문취소알림(
        @Payload OrderCanceled orderCanceled
    ) {
        OrderCanceled event = orderCanceled;
        System.out.println(
            "\n\n##### listener 주문취소알림 : " + orderCanceled + "\n\n"
        );

        // Sample Logic //
        StoreOrder.주문취소알림(event);
    }
    // keep

}
