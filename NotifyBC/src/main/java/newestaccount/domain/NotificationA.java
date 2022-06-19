package newestaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import newestaccount.NotifyBcApplication;
import newestaccount.domain.Notified;

@Entity
@Table(name = "NotificationA_table")
@Data
public class NotificationA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String notiDate;

    private String notiContext;

    private String phoneNo;

    private String custNo;

    @PostPersist
    public void onPostPersist() {
        Notified notified = new Notified(this);
        notified.publishAfterCommit();
    }

    public static NotificationARepository repository() {
        NotificationARepository notificationARepository = NotifyBcApplication.applicationContext.getBean(
            NotificationARepository.class
        );
        return notificationARepository;
    }

    public static void notifyP(IncomeVerifiedE incomeVerifiedE) {
        /** Example 1:  new item 
        NotificationA notificationA = new NotificationA();
        repository().save(notificationA);

        Notified notified = new Notified(notificationA);
        notified.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(incomeVerifiedE.get???()).ifPresent(notificationA->{
            
            notificationA // do something
            repository().save(notificationA);

            Notified notified = new Notified(notificationA);
            notified.publishAfterCommit();

         });
        */

    }
}
