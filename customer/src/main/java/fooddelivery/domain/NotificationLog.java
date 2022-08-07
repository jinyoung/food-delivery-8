package fooddelivery.domain;

import fooddelivery.CustomerApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "NotificationLog_table")
@Data
public class NotificationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String message;

    public static NotificationLogRepository repository() {
        NotificationLogRepository notificationLogRepository = CustomerApplication.applicationContext.getBean(
            NotificationLogRepository.class
        );
        return notificationLogRepository;
    }

    public static void 카카오톡알림(Accepted accepted) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void 카카오톡알림(Rejected rejected) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(rejected.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void 카카오톡알림(Cooked cooked) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(cooked.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void 카카오톡알림(Paid paid) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void 카카오톡알림(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void 카카오톡알림(DeliveryStarted deliveryStarted) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }
}
