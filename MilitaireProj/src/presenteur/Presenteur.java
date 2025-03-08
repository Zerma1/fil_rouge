package presenteur;

import models.entities.EntitiesFactory;
import models.entities.Militaire;
import models.entities.Stage;
import models.entities.armees.Terrien;
import models.entities.references.Grade;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.specialites.Arme;
import models.facades.FacadeModel;
import views.ConstanceView;
import views.facades.FacadeView;
import views.utils.LectureConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Presenteur {
    //Importation des View et Models
    FacadeView view;
    FacadeModel model;

    //Constructeur
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

        do {
            view.afficherMenu(ConstanceView.MENU_PRINCIPAL);
            choix = view.choixMenu(0,3);
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
        //H1 code découpé
       //Récupérer les stages
        List<Stage> lesStage = this.model.recupererStages();
        //CHoisir un stage
        Stage stage = this.view.selectionnerStage(lesStage);
        //Afficher les militaires du stage
        view.afficherSectionDeStage(stage);

        //H2
        //view.afficherSectionDeStage(this.view.selectionnerStage(this.model.recupererStages()));
    }
    public void ajouterMembreSection(){
        //H1 Code découper
        Militaire milouf = saisirMilitaire();
        List<Stage> lesStage = this.model.recupererStages();
        Stage stage = this.view.selectionnerStage(lesStage);
        stage.ajouterMilitaire(milouf);
        //Choisir l'armé
        //PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("LENOBLE", "Cyril", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        //Insertion des données
        //Création des données
    }
    public Militaire saisirMilitaire() {
        int choix;
        view.afficherMenu(ConstanceView.MENU_CHOIX_ARMEE);
        choix = view.choixMenu(0,ConstanceView.MENU_CHOIX_ARMEE.size());

        Militaire monMilitaire;
        switch (choix){
            case 1 -> monMilitaire = saisirTerrien();
            case 2 -> monMilitaire = saisirAviateur();
            case 3 -> monMilitaire = saisirMarin();
            default -> throw new IllegalArgumentException("Choix invalide : " + choix);
        }
        return monMilitaire;
    }

    private Militaire saisirTerrien(){
        String nom = view.saisirChaineDeCaractere("Nom : ");
        String prenom = view.saisirChaineDeCaractere("Prenom : ");
        //Afficher a l'utilisateur les différents création possible d'un militaire en fonction des armées
        Grade_AdT gradeChoisi = saisirGradeAdt();
        Arme armeChoisi = saisirArmeAdt();
        return EntitiesFactory.creerTerrien(nom, prenom, gradeChoisi, armeChoisi); // instanciation de l'objet;
    };
    private Terrien saisirAviateur(){

        return null;
    };
    private Terrien saisirMarin(){

        return null;
    };
    private Grade_AdT saisirGradeAdt(){
        int choix = 0;
        //Conversion du tableau d'enum en List
        List<Grade_AdT> grades = Arrays.asList(Grade_AdT.values());
        //Affichage du tableau
        view.afficherGradeAdt(grades);
        //récupérer le choix
        choix = view.choixMenu(1, Grade_AdT.values().length);
        Grade_AdT gradeChoisi = model.recupererGradesAdt(choix-1);
        return gradeChoisi;
    }
    private Arme saisirArmeAdt(){
        int choix = 0;
        List<Arme> armes = Arrays.asList(Arme.values());
        view.afficherArme(armes);
        Arme armeChoisie = model.recupererArme((view.choixMenu(1, Arme.values().length))-1);
        return armeChoisie;
    }

    public void retirerMembreSection(){
        int choixStagiaire;
        //afficher la liste des membres de la section
        List<Stage> lesStage = this.model.recupererStages();
        Stage stage = this.view.selectionnerStage(lesStage);
        view.afficherChaineDeCaractere("Voici la liste des membres du stage : \n");
        //Afficher les militaires du stage
        view.afficherSectionDeStage(stage);
        //demander a l'utilisateur le quel supprimer
        view.afficherChaineDeCaractere("Merci de choisir un numéro : ");
        choixStagiaire = view.choixMenu(1, stage.getSection().size());
        //Retirer le membre de la liste
        model.supprimerStagiaireDunStage(stage,choixStagiaire-1);

    }

}
