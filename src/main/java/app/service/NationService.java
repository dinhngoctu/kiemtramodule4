package app.service;

import app.model.Nation;
import app.repository.INationRepo;
import app.service.interf.INationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NationService implements INationService {
    @Autowired
    INationRepo nationRepo;
    @Override
    public List<Nation> findAll() {
        List<Nation> list = (List<Nation>) nationRepo.findAll();
        return list;
    }

    @Override
    public Nation findOne(Long id) {
        Nation nation = (nationRepo.findById(id)).get();
        return nation;
    }
}
