package models.facade;

import models.entities.Militaire;
import models.entities.Stage;

import java.util.ArrayList;
import java.util.List;

public class FacadeModelImpl implements FacadeModel{

    List<Stage> listeStages = new ArrayList<>();

    @Override
    public Stage recupererStage(int choixStage) {
        return listeStages.get(choixStage);
    }

    @Override
    public void ajouterStage(Stage stage) {
        this.listeStages.add(stage);
    }

    @Override
    public void ajouterMembreSection(Stage stage, Militaire stagiaire) {
        stage.ajouterMilitaire(stagiaire);
    }

    @Override
    public void retirerMembreSection(Stage stage, Militaire stagiaire) {
        stage.supprimerMiltaire(stagiaire);
    }
}
