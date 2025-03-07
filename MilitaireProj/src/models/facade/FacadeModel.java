package models.facade;

import models.entities.Militaire;
import models.entities.Stage;

import java.util.ArrayList;
import java.util.List;

public interface FacadeModel {
    Stage recupererStage(int choixStage);

    void ajouterStage(Stage stage);

    void ajouterMembreSection(Stage stage, Militaire stagiaire);

    void retirerMembreSection();
}


