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
    IncomeVerificationResultARepository incomeVerificationResultARepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCustomerRegisteredE_IncomeVerify(
        @Payload CustomerRegisteredE customerRegisteredE
    ) {
        if (!customerRegisteredE.validate()) return;
        CustomerRegisteredE event = customerRegisteredE;
        System.out.println(
            "\n\n##### listener IncomeVerify : " +
            customerRegisteredE.toJson() +
            "\n\n"
        );

        // Sample Logic //
        IncomeVerificationResultA.incomeVerify(event);
    }
    // keep

}
