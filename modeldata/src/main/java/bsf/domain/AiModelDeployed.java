package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AiModelDeployed extends AbstractEvent {

    private Long id;
    private Long modelId;
    private String modelName;
    private Integer status;
    private String modelPath;
    private String modelVersion;
    private Boolean isLastestVersion;
}
