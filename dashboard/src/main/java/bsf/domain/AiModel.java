package bsf.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "AiModel_table")
@Data
public class AiModel {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Boolean isCreated;
    private Boolean isDeployed;
    private Boolean isAnalyzed;
    private String modelName;
    private String status;
    private String performance;
}
