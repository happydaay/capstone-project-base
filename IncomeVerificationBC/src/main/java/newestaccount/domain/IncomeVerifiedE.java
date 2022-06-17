package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.domain.*;
import newestaccount.infra.AbstractEvent;

@Data
public class IncomeVerifiedE extends AbstractEvent {

    private Long id;
    private String custNo;
    private String verifyResult;
    private Long incomeAmount;
    private String phoneNo;
    private Long appId;

    public IncomeVerifiedE(IncomeVerificationResultA aggregate) {
        super(aggregate);
    }

    public IncomeVerifiedE() {
        super();
    }
    // keep

}
