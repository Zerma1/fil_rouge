package models.facades;

import models.entities.Militaire;
import models.entities.Stage;

public interface FacadeModel {

    Stage recupererStage(int choix);

    void ajouterStage(Stage stage);

    void supprimerStagiaireDunStage(Stage stage, Militaire militaire);

    void ajouterStagiaireDunStage(Stage stage, Militaire militaire);


}
