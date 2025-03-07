package presenteurs;

import models.entities.Stage;
import models.facade.FacadeModel;
import views.facade.FacadeView;
import views.utils.Perso.utilPrint;

import static views.ConstanceView.MENU_PRINCIPAL;
import static views.utils.Perso.AffichageConsole.afficherMenu;

public class Presenteur {
    FacadeView view;
    FacadeModel model;

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
        utilPrint.printString("Afficher la section");
        view.afficherSection(model.recupererStage(0));
    }

    private void ajouterMembreSection() {
        utilPrint.printString("Ajouter un membre a la section");

    }

    private void retirerMembreSection() {
        utilPrint.printString("Retirer un membre de la section");

    }

}
