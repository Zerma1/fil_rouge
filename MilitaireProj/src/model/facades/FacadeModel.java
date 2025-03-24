package model.facades;

import model.entities.Militaire;
import model.entities.Stage;

import java.time.LocalDate;
import java.util.List;

public interface FacadeModel {

    void addStage(Stage stage);

    void removeStage(Stage stage);

    Stage getStageParNom(String nomStageCherhcer);

    void retirerMilitaire(Stage stage, Militaire militaire);

    void ajouterMilitaire(Stage stage, Militaire militaire);
}
