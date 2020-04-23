package app.service.interf;

import app.model.Nation;

import java.util.List;

public interface INationService {
    List<Nation> findAll();

    Nation findOne(Long id);
}
