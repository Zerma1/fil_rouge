package lanceurs;

import models.entities.EntitiesFactory;
import models.entities.Stage;
import models.entities.references.grades.Grade_AAE;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.grades.Grade_MN;
import models.entities.references.specialites.Arme;
import models.entities.references.specialites.SpecialiteAAE;
import models.entities.references.specialites.SpecialiteMN;
import models.facades.FacadeModel;
import models.facades.FacadeModelImpl;
import presenteur.Presenteur;
import views.facades.FacadeView;
import views.facades.FacadeViewImpl;

import java.time.LocalDate;

public class PreProduction {
    public static void main(String[] args) {

        //Permet l'instanciation des différentes facades
        FacadeModel model = new FacadeModelImpl();
        FacadeView view = new FacadeViewImpl();
        //Envoi des facades au présenteur
        Presenteur presenteur = new Presenteur(view, model);
        presenteur.initStage(initStagePO85());
        presenteur.start();
    }

    public static Stage initStagePO85(){
        LocalDate debut = LocalDate.of(2024,12,2);
        LocalDate fin = LocalDate.of(2025,07,25);
        Stage PO85 = EntitiesFactory.creerStage("PO85", debut, fin);

        //TODO Crée les stagiaires puis
        //Creation de la section
        PO85.ajouterMilitaire(EntitiesFactory.creerTerrien("FONTAINE", "Baptiste", Grade_AdT.SERGENT, Arme.TROUPES_DE_MARINE));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("RAKOTOBE", "Tsiriniaina", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("EUZEN", "Ashley", Grade_AAE.SERGENT, SpecialiteAAE.Agent_du_transit_aerien));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("VILLENEUVE", "Harry", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("BOUTTANT", "Matthieu", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("LEMARTINEL", "Thomas", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("LENOBLE", "Cyril", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("OLSEN", "Yves", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        PO85.ajouterMilitaire(EntitiesFactory.creerMarin("LE GLUDIC", "Quentin", Grade_MN.MAITRE, SpecialiteMN.TECHNICIEN_SYSTÈMES_DINFORMATION_RESEAUX_ET_TELECOMMUNICATIONS));
        PO85.ajouterMilitaire(EntitiesFactory.creerMarin("ZERMANI", "Baptiste", Grade_MN.QUARTIER_MAITRE, SpecialiteMN.TECHNICIEN_SYSTÈMES_DINFORMATION_RESEAUX_ET_TELECOMMUNICATIONS));
        PO85.ajouterMilitaire(EntitiesFactory.creerTerrien("KICHELM", "Thomas", Grade_AdT.SERGENT, Arme.TRANSMISSION));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("JOLY", "Simon", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        PO85.ajouterMilitaire(EntitiesFactory.creerAviateur("MICHELENA", "Patxi", Grade_AAE.SERGENT, SpecialiteAAE.Technicien_developpeur_informatique));
        PO85.ajouterMilitaire(EntitiesFactory.creerTerrien("FAURE", "Bryce", Grade_AdT.SERGENT, Arme.TRANSMISSION));

        return PO85;
    }
}
