package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MapHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Map>> {

    @Override
    public EntityModel<Map> process(EntityModel<Map> model) {
        return model;
    }
}
