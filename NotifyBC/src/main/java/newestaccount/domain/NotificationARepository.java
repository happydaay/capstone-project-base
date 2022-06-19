package newestaccount.domain;

import newestaccount.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "notificationAS",
    path = "notificationAS"
)
public interface NotificationARepository
    extends PagingAndSortingRepository<NotificationA, Long> {}
