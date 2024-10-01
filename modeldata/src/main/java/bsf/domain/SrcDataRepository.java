package bsf.domain;

import bsf.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "srcData", path = "srcData")
public interface SrcDataRepository
    extends PagingAndSortingRepository<SrcData, Long> {}
