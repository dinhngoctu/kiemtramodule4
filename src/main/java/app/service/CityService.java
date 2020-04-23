package app.service;

import app.model.City;
import app.model.Nation;
import app.repository.ICityRepo;
import app.service.interf.ICityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityService implements ICityService {
    @Autowired
    ICityRepo cityRepo;

    @Override
    public List<City> findAll() {
        List<City> list = (List<City>) cityRepo.findAll();
        return list;
    }

    @Override
    public void save(City city) {
        cityRepo.save(city);
    }

    @Override
    public City findOne(Long id) {
        City city = (cityRepo.findById(id)).get();
        return city;
    }

    @Override
    public void delete(Long id) {
        cityRepo.deleteById(id);
    }
}
