package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "preferences",
    path = "preferences"
)
public interface PreferenceRepository
    extends PagingAndSortingRepository<Preference, Long> {}
