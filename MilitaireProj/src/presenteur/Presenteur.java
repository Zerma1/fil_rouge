package presenteur;

import model.entities.Stage;
import model.entities.references.ConstanteMetier;
import model.facades.FacadeModel;
import view.facades.FacadeView;

import java.util.ArrayList;
import java.util.List;

public class Presenteur {

    FacadeModel facadeModel;
    FacadeView facadeView;
    private static List<String> menu = new ArrayList<>();

    public Presenteur(FacadeView facadeView, FacadeModel facadeMetier) {
        setFacadeMetier(facadeMetier);
        setFacadeView(facadeView);
    }

    public FacadeModel getFacadeMetier() {
        return facadeModel;
    }

    public void setFacadeMetier(FacadeModel facadeMetier) {
        this.facadeModel = facadeMetier;
    }

    public FacadeView getFacadeView() {
        return facadeView;
    }

    public void setFacadeView(FacadeView facadeView) {
        this.facadeView = facadeView;
    }

    private static void init(){
        menu = ConstanteMetier.MENU_PRINCIPAL;
    }

    public void addStageAuModel(Stage stage) {
        facadeModel.addStage(stage);
    }

    public void start(){
        init();

        Stage empire = facadeModel.getStageParNom("Empire Galactique");

        facadeView.afficherSection(empire.getListMilitaire());

        int choix;
        do{
            //afficher menu utilisateur
            facadeView.afficherMenu(menu);

            choix = facadeView.choisirMenu(menu.size());
            gereChoixMenuPrincipal(empire, choix);

        }while(choix != menu.size());

        //afficher la date de fin de stage
        facadeView.afficherNbJourAvantFin(empire);

    }

    private void gereChoixMenuPrincipal(Stage stage, int choixMenu) {
        switch (choixMenu){
            case 1 -> facadeView.afficherSection(stage.getListMilitaire());
            case 2 -> facadeModel.ajouterMilitaire(stage, facadeView.creerMilitaire(facadeView.choisirArmee()));
            case 3 -> facadeModel.retirerMilitaire(stage, facadeView.choisirMilitaireRetirer(stage.getListMilitaire()));
        }
    }
}
