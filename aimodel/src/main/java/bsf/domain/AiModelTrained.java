package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AiModelTrained extends AbstractEvent {

    private Long id;
    private Long modelId;
    private String modelName;
    private Integer status;
    private String modelPath;
    private String modelVersion;
    private Boolean isLastestVersion;
    private Date trainCompTime;

    public AiModelTrained(AiModel aggregate) {
        super(aggregate);
    }

    public AiModelTrained() {
        super();
    }
}
//>>> DDD / Domain Event
