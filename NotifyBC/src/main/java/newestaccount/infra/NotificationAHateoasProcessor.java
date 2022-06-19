package newestaccount.infra;

import newestaccount.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class NotificationAHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<NotificationA>> {

    @Override
    public EntityModel<NotificationA> process(
        EntityModel<NotificationA> model
    ) {
        return model;
    }
}
