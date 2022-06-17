package newestaccount.domain;

import newestaccount.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "customerAS",
    path = "customerAS"
)
public interface CustomerARepository
    extends PagingAndSortingRepository<CustomerA, Long> {}
