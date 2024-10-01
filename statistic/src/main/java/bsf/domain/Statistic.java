package bsf.domain;

import bsf.StatisticApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Statistic_table")
@Data
//<<< DDD / Aggregate Root
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long statisticId;

    private Long type;

    private Long period;

    private Long value;

    public static StatisticRepository repository() {
        StatisticRepository statisticRepository = StatisticApplication.applicationContext.getBean(
            StatisticRepository.class
        );
        return statisticRepository;
    }
}
//>>> DDD / Aggregate Root
