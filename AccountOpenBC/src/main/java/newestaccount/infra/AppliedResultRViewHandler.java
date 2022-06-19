package newestaccount.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import newestaccount.config.kafka.KafkaProcessor;
import newestaccount.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class AppliedResultRViewHandler {

    @Autowired
    private AppliedResultRRepository appliedResultRRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPreAppliedE_then_UPDATE_1(
        @Payload PreAppliedE preAppliedE
    ) {
        try {
            if (!preAppliedE.validate()) return;
            // view 객체 조회

            List<AppliedResultR> appliedResultRList = appliedResultRRepository.findByCustNo(
                preAppliedE.getCustNo()
            );
            for (AppliedResultR appliedResultR : appliedResultRList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                appliedResultR.setAppliedStatus(preAppliedE.getAppliedStatus());
                // view 레파지 토리에 save
                appliedResultRRepository.save(appliedResultR);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // keep

}
