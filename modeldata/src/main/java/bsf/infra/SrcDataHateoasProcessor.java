package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SrcDataHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SrcData>> {

    @Override
    public EntityModel<SrcData> process(EntityModel<SrcData> model) {
        return model;
    }
}
