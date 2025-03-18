package presenteur;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.armees.Aviateur;
import models.entities.armees.Marin;
import models.entities.armees.Terrien;
import models.facades.FacadeModel;
import views.ConstanceView;
import views.facades.FacadeView;

public class Presenteur {

    FacadeView view;
    FacadeModel model;

    public Presenteur(FacadeView view, FacadeModel model) {
        setView(view);
        setModel(model);
    }

    public void setView(FacadeView view) {
        this.view = view;
    }

    public void setModel(FacadeModel model) {
        this.model = model;
    }

    public void start(){

        int choix;

        do{
            view.afficherMenu(ConstanceView.MENU_PRINCIPAL);
            choix = view.choixMenu(0, 3);
            gestionMenuPrincipal(choix);

        }while(choix != 0);
    }

    public void initStage(Stage stage){
        model.ajouterStage(stage);
    }

    public void gestionMenuPrincipal(int choix){

        switch (choix){
            case 1 -> afficherLaSection();
            case 2 -> ajouterMembreSection();
            case 3 -> retirerMembreSection();
        }
    }

    public void afficherLaSection(){
        view.afficherSectionDeStage(model.recupererStage(0));
    }

    public void ajouterMembreSection(){

    }

    private Militaire saisirMilitaire(){

        String nom = view.saisirNom();
        String prenom = view.saisirPrenom();

        view.afficherMenu(ConstanceView.TYPE_MILITAIRE);
        int choix = view.choixMenu(1,ConstanceView.TYPE_MILITAIRE.size());
        Militaire monMilitaire;
        switch (choix){
            case 1 -> monMilitaire = saisirAviateur();
            case 2 -> monMilitaire = saisirMarin();
            case 3 -> monMilitaire = saisirTerrien();
            default -> monMilitaire = saisirAviateur();
        }

        model.ajouterStagiaireDunStage(model.recupererStage(0), monMilitaire);

        return monMilitaire;
    }

    private Aviateur saisirAviateur(){
        return null;
    }
    private Marin saisirMarin(){
        return null;
    }
    private Terrien saisirTerrien(){
        return null;
    }



    public void retirerMembreSection(){

    }

}
