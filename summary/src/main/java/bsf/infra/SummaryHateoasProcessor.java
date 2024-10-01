package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SummaryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Summary>> {

    @Override
    public EntityModel<Summary> process(EntityModel<Summary> model) {
        return model;
    }
}
