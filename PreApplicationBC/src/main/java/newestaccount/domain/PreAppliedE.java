package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class PreAppliedE extends AbstractEvent {

    private Long id;
    private String realResNo;
    private String custNm;
    private String phoneNo;
    private String appliedStatus;

    public PreAppliedE(PreApplicationA aggregate) {
        super(aggregate);
    }

    public PreAppliedE() {
        super();
    }
    // keep

}
