package models.dao;

import models.entities.Stage;

public interface DaoStage extends Dao<Stage> {

    Stage findByNumSalle(String numSalle);

}
