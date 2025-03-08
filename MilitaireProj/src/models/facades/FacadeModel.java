package models.facades;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.specialites.Arme;

import java.util.List;

public interface FacadeModel {
    Stage recupererStage(int choix);
    void ajouterStage(Stage stage);

    Grade_AdT recupererGradesAdt(int choix);
    Arme recupererArme(int choix);

    void ajouterStagiaireDunStage(Stage stage, Militaire militaire);
    void supprimerStagiaireDunStage(Stage stage, int choix);


    List<Stage> recupererStages();
}
