package fooddelivery.domain;

import fooddelivery.StoreApplication;
import fooddelivery.domain.Accepted;
import fooddelivery.domain.Rejected;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "StoreOrder_table")
@Data
public class StoreOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String foodId;

    private String preference;

    private Long orderId;

    private String test;

    @Enumerated(EnumType.STRING)
    private Status status;

    @PostPersist
    public void onPostPersist() {
        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();

        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();
    }

    public static StoreOrderRepository repository() {
        StoreOrderRepository storeOrderRepository = StoreApplication.applicationContext.getBean(
            StoreOrderRepository.class
        );
        return storeOrderRepository;
    }

    public void finishCook() {
        Cooked cooked = new Cooked(this);
        cooked.publishAfterCommit();
    }

    public void accept() {}

    public void reject() {}

    public void startCook() {}

    public static void 주문목록에추가(Paid paid) {
        /** Example 1:  new item 
        StoreOrder storeOrder = new StoreOrder();
        repository().save(storeOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(storeOrder->{
            
            storeOrder // do something
            repository().save(storeOrder);


         });
        */

    }

    public static void 주문취소알림(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        StoreOrder storeOrder = new StoreOrder();
        repository().save(storeOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(storeOrder->{
            
            storeOrder // do something
            repository().save(storeOrder);


         });
        */

    }
}
