package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class Notified extends AbstractEvent {

    private Long id;

    public Notified(NotificationA aggregate) {
        super(aggregate);
    }

    public Notified() {
        super();
    }
    // keep

}
