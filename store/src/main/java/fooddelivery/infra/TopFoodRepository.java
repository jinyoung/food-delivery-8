package fooddelivery.infra;

import fooddelivery.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "topFoods", path = "topFoods")
public interface TopFoodRepository
    extends PagingAndSortingRepository<TopFood, Long> {
    List<TopFood> findByFooid(Long fooid);
    // keep

}
