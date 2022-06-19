package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class CustomerRegisteredE extends AbstractEvent {

    private Long id;
    private String realResNo;
    private String custNm;
    private String phoneNo;
    private String custNo;

    public CustomerRegisteredE(CustomerA aggregate) {
        super(aggregate);
    }

    public CustomerRegisteredE() {
        super();
    }
    // keep

}
