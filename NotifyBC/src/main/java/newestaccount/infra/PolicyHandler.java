package newestaccount.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import newestaccount.config.kafka.KafkaProcessor;
import newestaccount.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationARepository notificationARepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverIncomeVerifiedE_NotifyP(
        @Payload IncomeVerifiedE incomeVerifiedE
    ) {
        if (!incomeVerifiedE.validate()) return;
        IncomeVerifiedE event = incomeVerifiedE;
        System.out.println(
            "\n\n##### listener NotifyP : " + incomeVerifiedE.toJson() + "\n\n"
        );

        // Sample Logic //
        NotificationA.notifyP(event);
    }
    // keep

}
