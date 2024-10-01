package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class MapCreated extends AbstractEvent {

    private Long id;

    public MapCreated(Map aggregate) {
        super(aggregate);
    }

    public MapCreated() {
        super();
    }
}
//>>> DDD / Domain Event
