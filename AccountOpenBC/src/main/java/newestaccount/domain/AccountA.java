package newestaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newestaccount.AccountOpenBcApplication;
import newestaccount.domain.AccountOpenedE;

@Entity
@Table(name = "AccountA_table")
@Data
public class AccountA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String acctNo;

    private String custNo;

    private String openDate;

    private String cancelDate;

    private String accountStatus;

    private String accountBalance;

    @PostPersist
    public void onPostPersist() {
        AccountOpenedE accountOpenedE = new AccountOpenedE(this);
        accountOpenedE.publishAfterCommit();
        // Get request from PreApplicationA
        //newestaccount.external.PreApplicationA preApplicationA =
        //    Application.applicationContext.getBean(newestaccount.external.PreApplicationAService.class)
        //    .getPreApplicationA(/** mapping value needed */);

    }

    public static AccountARepository repository() {
        AccountARepository accountARepository = AccountOpenBcApplication.applicationContext.getBean(
            AccountARepository.class
        );
        return accountARepository;
    }
}
