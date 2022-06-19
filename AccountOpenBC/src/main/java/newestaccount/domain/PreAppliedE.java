package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.infra.AbstractEvent;

@Data
public class PreAppliedE extends AbstractEvent {

    private Long id;
    private String realResNo;
    private String custNm;
    private String phoneNo;
    private String appliedStatus;
    private String custNo;
}
