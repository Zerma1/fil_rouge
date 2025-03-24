package view.facades;

import model.entities.Militaire;
import model.entities.Stage;

import java.util.List;

public interface FacadeView {
    void afficherMenu(List<String> menu);

    void afficherNbJourAvantFin(Stage stage);

    void afficherSection(List<Militaire> section);

    int choisirArmee();

    int choisirMenu(int nombreChoix);

    Militaire creerMilitaire(int choixArmee);

    Militaire creerTerrien();
    Militaire creerAviateur();
    Militaire creerMarin();

    Militaire choisirMilitaireRetirer(List<Militaire> section);

    void afficherMessageErreur(String message);
}
