package model.dao.implDao;

import model.dao.DaoStage;
import model.entities.Militaire;
import model.entities.Stage;

import java.util.*;

public class DaoStageImpl  extends AbstractDaoImpl<Stage> implements DaoStage {

    public DaoStageImpl() {}

    @Override
    public Stage findByNom(String nom) throws NoSuchElementException{

        if(nom == null){
            throw new NullPointerException("Erreur de DaoStage findByNID param NID Null");
        }

        Stage stage = null;
        System.out.println(persistence.values().size());
        for (Stage unStageMap : persistence.values()) {
            if (unStageMap.getNom() == nom) {
                stage = unStageMap;
            }
        }

        if (stage == null) {
            throw new NoSuchElementException("Erreur de DaoStage findByNom nom " + nom + " n'existe pas");
        }

        return stage;
    }
}
