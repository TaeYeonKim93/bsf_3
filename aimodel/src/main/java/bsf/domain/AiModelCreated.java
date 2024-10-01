package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AiModelCreated extends AbstractEvent {

    private Long id;
    private Long modelId;
    private String modelName;
    private String modelPath;

    public AiModelCreated(AiModel aggregate) {
        super(aggregate);
    }

    public AiModelCreated() {
        super();
    }
}
//>>> DDD / Domain Event
