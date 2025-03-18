package models.dao;

import models.dao.implDao.AbstractDaoImpl;
import models.entities.Militaire;

public interface DaoMilitaire extends Dao<Militaire> {
    Militaire findByNID(String nid);
}
