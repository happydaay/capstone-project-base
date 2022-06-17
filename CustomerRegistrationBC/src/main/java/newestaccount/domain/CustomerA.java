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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealResNo() {
        return realResNo;
    }

    public void setRealResNo(String realResNo) {
        this.realResNo = realResNo;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

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
