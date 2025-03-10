package models.facades;

import models.entities.Militaire;
import models.entities.Stage;

import java.util.ArrayList;
import java.util.List;

public class FacadeModelImpl implements FacadeModel{

    List<Stage> stages = new ArrayList<>();

    @Override
    public Stage recupererStage(int choix) {
        return stages.get(choix);
    }

    @Override
    public void ajouterStage(Stage stage) {
        stages.add(stage);
    }

    @Override
    public void supprimerStagiaireDunStage(Stage stage, Militaire militaire) {

    }

    @Override
    public void ajouterStagiaireDunStage(Stage stage, Militaire militaire) {

    }
}
