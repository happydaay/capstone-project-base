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
    // keep

}
