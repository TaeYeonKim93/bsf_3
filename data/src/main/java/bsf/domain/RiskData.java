package bsf.domain;

import bsf.DataApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "RiskData_table")
@Data
//<<< DDD / Aggregate Root
public class RiskData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long dataId;

    private Integer dataType;

    private Long size;

    private Date createAt;

    private String dataValue;

    private String analyzeResult;

    public static RiskDataRepository repository() {
        RiskDataRepository riskDataRepository = DataApplication.applicationContext.getBean(
            RiskDataRepository.class
        );
        return riskDataRepository;
    }

    //<<< Clean Arch / Port Method
    public static void analyze(AiModelDeployed aiModelDeployed) {
        //implement business logic here:

        /** Example 1:  new item 
        RiskData riskData = new RiskData();
        repository().save(riskData);

        */

        /** Example 2:  finding and process
        
        repository().findById(aiModelDeployed.get???()).ifPresent(riskData->{
            
            riskData // do something
            repository().save(riskData);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
