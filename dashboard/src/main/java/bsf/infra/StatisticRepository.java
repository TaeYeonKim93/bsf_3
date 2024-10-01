package bsf.infra;

import bsf.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "statistics",
    path = "statistics"
)
public interface StatisticRepository
    extends PagingAndSortingRepository<Statistic, Long> {}
