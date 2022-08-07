package fooddelivery.domain;

import fooddelivery.MarketingApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Preference_table")
@Data
public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long foodId;

    private Integer count;

    public static PreferenceRepository repository() {
        PreferenceRepository preferenceRepository = MarketingApplication.applicationContext.getBean(
            PreferenceRepository.class
        );
        return preferenceRepository;
    }

    public static void 주문내역수집(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Preference preference = new Preference();
        repository().save(preference);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(preference->{
            
            preference // do something
            repository().save(preference);


         });
        */

    }

    public static void 추천(오후_12시 오후_12시) {
        /** Example 1:  new item 
        Preference preference = new Preference();
        repository().save(preference);

        */

        /** Example 2:  finding and process
        
        repository().findById(오후_12시.get???()).ifPresent(preference->{
            
            preference // do something
            repository().save(preference);


         });
        */

    }
}
