package app.repository;

import app.model.City;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICityRepo extends PagingAndSortingRepository<City,Long> {
}
