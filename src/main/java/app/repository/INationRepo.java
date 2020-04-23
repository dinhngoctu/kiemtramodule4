package app.repository;

import app.model.Nation;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface INationRepo extends PagingAndSortingRepository<Nation,Long> {
}
