package bsf.domain;

import bsf.MapApplication;
import bsf.domain.MapCreated;
import bsf.domain.MapUpdated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Map_table")
@Data
//<<< DDD / Aggregate Root
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mapId;

    private String dataType;

    private String geoData;

    @PostPersist
    public void onPostPersist() {
        MapUpdated mapUpdated = new MapUpdated(this);
        mapUpdated.publishAfterCommit();

        MapCreated mapCreated = new MapCreated(this);
        mapCreated.publishAfterCommit();
    }

    public static MapRepository repository() {
        MapRepository mapRepository = MapApplication.applicationContext.getBean(
            MapRepository.class
        );
        return mapRepository;
    }

    public void create() {
        //implement business logic here:

    }

    //<<< Clean Arch / Port Method
    public static void updateMap(RiskAnalyzed riskAnalyzed) {
        //implement business logic here:

        /** Example 1:  new item 
        Map map = new Map();
        repository().save(map);

        */

        /** Example 2:  finding and process
        
        repository().findById(riskAnalyzed.get???()).ifPresent(map->{
            
            map // do something
            repository().save(map);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
