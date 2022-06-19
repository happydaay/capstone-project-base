package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class AccountOpenedE extends AbstractEvent {

    private Long id;
    private String acctNo;
    private String custNo;
    private String openDate;
    private String cancelDate;
    private String accountStatus;
    private String accountBalance;
    // keep

}
