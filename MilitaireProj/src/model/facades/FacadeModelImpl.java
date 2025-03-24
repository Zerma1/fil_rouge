package model.facades;

import model.dao.implDao.DaoMilitaireImpl;
import model.dao.implDao.DaoStageImpl;
import model.entities.FactoryMilitaire;
import model.entities.Militaire;
import model.entities.Stage;
import model.entities.exceptions.DaoExeption;
import model.entities.references.Arme;
import model.entities.references.GradeMarin;
import model.entities.references.GradeTerrien;
import model.entities.references.SpecialiteMN;
import view.facades.FacadeView;
import view.facades.FacadeViewConsoleImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FacadeModelImpl implements FacadeModel {

    private DaoMilitaireImpl daoMilitaire = new DaoMilitaireImpl();
    private DaoStageImpl daoStage = new DaoStageImpl();

    public void addStage(Stage stage) throws DaoExeption {
        daoStage.save(stage);
    }

    public void removeStage(Stage stage) throws DaoExeption {
        daoStage.delete(stage.getId());
    }

    @Override
    public Stage getStageParNom(String nomStageCherhcer) {

        Stage stage = daoStage.findByNom(nomStageCherhcer);

        return stage;
    }

    @Override
    public void retirerMilitaire(Stage stage, Militaire militaire) {
        stage.removeMilitaire(militaire);
    }

    @Override
    public void ajouterMilitaire(Stage stage, Militaire militaire) {
        stage.addMilitaire(militaire);
    }
}
