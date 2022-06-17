package newestaccount.infra;

import newestaccount.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerAHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CustomerA>> {

    @Override
    public EntityModel<CustomerA> process(EntityModel<CustomerA> model) {
        return model;
    }
}
