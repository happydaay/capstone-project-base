package newestaccount.domain;

import newestaccount.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "accountAS", path = "accountAS")
public interface AccountARepository
    extends PagingAndSortingRepository<AccountA, Long> {}
