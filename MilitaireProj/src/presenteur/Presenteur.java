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

        return monMilitaire;
    }

    private Aviateur saisirAviateur(){
        Aviateur aviateur;
        aviateur = (Aviateur) model.saisirMilitaire(ConstanceView.TYPE_MILITAIRE.get(0));
        return aviateur;
    }
    private Marin saisirMarin(){
        Marin marin;
        marin = (Marin) model.saisirMilitaire(ConstanceView.TYPE_MILITAIRE.get(1));
        return marin;
    }
    private Terrien saisirTerrien(){
        Terrien terrien;
        terrien = (Terrien) model.saisirMilitaire(ConstanceView.TYPE_MILITAIRE.get(2));
        return terrien;
    }



    public void retirerMembreSection(){

    }

}
