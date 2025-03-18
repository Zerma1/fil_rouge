package models.dao.implDao;

import models.dao.DaoStage;
import models.entities.Militaire;
import models.entities.Stage;

public class DaoStageImpl  extends AbstractDaoImpl<Stage> implements DaoStage {
    @Override
    public Stage findByNumSalle(String numSalle) {
        return null;
    }

    @Override
    public Stage save(Stage entity) {
        return null;
    }

    @Override
    public Stage findById(Long id) {
        return null;
    }

    @Override
    public Stage update(Long id, Stage entity) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Iterable<Stage> readAll() {
        return null;
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
