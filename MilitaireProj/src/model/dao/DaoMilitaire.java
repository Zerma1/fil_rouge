package model.dao;

import model.entities.Militaire;

public interface DaoMilitaire extends Dao<Militaire> {

    Militaire findByNID (Long nid);

}
