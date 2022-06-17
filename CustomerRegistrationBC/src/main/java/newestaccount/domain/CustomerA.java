package newestaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newestaccount.CustomerRegistrationBcApplication;
import newestaccount.domain.CustomerRegisteredE;

@Entity
@Table(name = "CustomerA_table")
@Data
public class CustomerA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String realResNo;

    private String custNm;

    private String phoneNo;

    private String custNo;

    @PostPersist
    public void onPostPersist() {
        CustomerRegisteredE customerRegisteredE = new CustomerRegisteredE(this);
        customerRegisteredE.publishAfterCommit();
    }

    public static CustomerARepository repository() {
        CustomerARepository customerARepository = CustomerRegistrationBcApplication.applicationContext.getBean(
            CustomerARepository.class
        );
        return customerARepository;
    }

    public static void customerRegistP(PreAppliedE preAppliedE) {
        /** Example 1:  new item 
        CustomerA customerA = new CustomerA();
        repository().save(customerA);

        CustomerRegisteredE customerRegisteredE = new CustomerRegisteredE(customerA);
        customerRegisteredE.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(preAppliedE.get???()).ifPresent(customerA->{
            
            customerA // do something
            repository().save(customerA);

            CustomerRegisteredE customerRegisteredE = new CustomerRegisteredE(customerA);
            customerRegisteredE.publishAfterCommit();

         });
        */

    }
}
