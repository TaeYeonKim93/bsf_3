package bsf.infra;

import bsf.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "srcData", path = "srcData")
public interface SrcDataRepository
    extends PagingAndSortingRepository<SrcData, Long> {}
