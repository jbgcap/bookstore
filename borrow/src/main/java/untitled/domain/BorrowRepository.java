package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "borrows", path = "borrows")
public interface BorrowRepository
    extends PagingAndSortingRepository<Borrow, Long> {}
