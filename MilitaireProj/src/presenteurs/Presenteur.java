package presenteurs;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.armees.FactoryMilitair;
import models.facade.FacadeModel;
import views.ConstanceView;
import views.facade.FacadeView;
import views.utils.Perso.utilPrint;

import static views.ConstanceView.MENU_PRINCIPAL;
import static views.utils.Perso.AffichageConsole.afficherMenu;

public class Presenteur {
    FacadeView view;
    FacadeModel model;
    FactoryMilitair factory;

    public Presenteur(FacadeView view, FacadeModel model){
        setView(view);
        setModel(model);
    }

    private void setModel(FacadeModel model) {
        this.model = model;
    }

    private void setView(FacadeView view) {
        this.view = view;
    }

    public  void start(){
        int choix;

        do{

            view.afficherMenu(MENU_PRINCIPAL);

            choix = view.choixMenu(0, 3);

            gestionMenuPrincipal(choix);

        }while (choix != 0);
    }

    public void initStage(Stage stage){
        model.ajouterStage(stage);
    }

    private void gestionMenuPrincipal(int choix) {



        switch (choix) {
            case 1 -> afficherLaSection();
            case 2 -> ajouterMembreSection();
            case 3 -> retirerMembreSection();
        }
    }

    public void afficherLaSection(){
        utilPrint.printString("=====Afficher la section=====");
        view.afficherSection(model.recupererStage(0));
        utilPrint.printString("=============FIN=============");
    }

    private void ajouterMembreSection() {
        utilPrint.printString("Ajouter un membre a la section");
        // TODOO : creer le militair
        // recuperer un nom
        // recuperer un prenom
        // choisir armee
        // recuperer un spe
        // recuperer un grade
        //factory.creermilitair(nom, prenom, armee, spe, grade)


    }

    private Militaire saisirMilitair() {

        String nom = view.saisirNom();
        String prenom = view.saisirPrenom();

        view.afficherMenu(ConstanceView.TYPE_MILITAIR);
        int choix = view.choixMenu(1, ConstanceView.TYPE_MILITAIR.size());

        Militaire militaire;

        switch (choix){
            case 1 -> mi ;
        }



        return null;
    }

    private void retirerMembreSection() {
        utilPrint.printString("Retirer un membre de la section");
        // TODOO : afficher la liste de militair du stage
        afficherLaSection();
        // TODOO : choisire le stagiair

    }

}
