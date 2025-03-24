package model.dao;

import model.entities.Stage;

public interface DaoStage extends Dao<Stage> {

    Stage findByNom (String nom);
}
