package models.dao.implDao;

import models.dao.Dao;
import models.dao.DaoMilitaire;
import models.entities.Militaire;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DaoMilitaireImpl extends AbstractDaoImpl<Militaire> implements DaoMilitaire{

    private Map<Long, Militaire> militaire = new HashMap<>();

    @Override
    public Militaire findByNID(String nid) {
        return null;
    }

    @Override
    public Militaire save(Militaire entity) {
        return null;
    }

    @Override
    public Militaire findById(Long id) {
        return null;
    }

    @Override
    public Militaire update(Long id, Militaire entity) {
        return null;
    }

    @Override
    public Iterable<Militaire> readAll() {
        return Collections.unmodifiableCollection(militaire.values());
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean exist(Long id) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }
}
