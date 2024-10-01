package bsf.domain;

import bsf.ModeldataApplication;
import bsf.domain.DataInserted;
import bsf.domain.DataLinked;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SrcData_table")
@Data
//<<< DDD / Aggregate Root
public class SrcData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long dataId;

    private Integer dataType;

    private Long size;

    private Date createAt;

    private String dataValue;

    @PostPersist
    public void onPostPersist() {
        DataLinked dataLinked = new DataLinked(this);
        dataLinked.publishAfterCommit();

        DataInserted dataInserted = new DataInserted(this);
        dataInserted.publishAfterCommit();
    }

    public static SrcDataRepository repository() {
        SrcDataRepository srcDataRepository = ModeldataApplication.applicationContext.getBean(
            SrcDataRepository.class
        );
        return srcDataRepository;
    }

    public void link() {
        //implement business logic here:

    }

    public void insert() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root
