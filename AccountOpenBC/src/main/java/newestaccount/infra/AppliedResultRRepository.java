package newestaccount.infra;

import java.util.List;
import newestaccount.domain.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AppliedResultRRepository
    extends CrudRepository<AppliedResultR, Long> {
    // keep

}
