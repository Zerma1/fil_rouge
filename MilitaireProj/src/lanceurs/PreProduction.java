package lanceurs;

import models.entities.EntitiesFactory;
import models.entities.Militaire;
import models.entities.Stage;
import models.entities.armees.Aviateur;
import models.entities.armees.Marin;
import models.entities.armees.Terrien;
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
import java.util.ArrayList;
import java.util.List;

public class PreProduction {

    public static void main(String[] args) {

        FacadeView view = new FacadeViewImpl();
        FacadeModel model = new FacadeModelImpl();

        Presenteur presenteur = new Presenteur(view, model);

        presenteur.initStage(initStagePO85());

        presenteur.start();

    }

    public static Stage initStagePO85(){
        LocalDate debut = LocalDate.of(2024,12,2);
        LocalDate fin = LocalDate.of(2025,07,25);
        Stage PO85 = EntitiesFactory.creerStage("PO85",debut,fin);

        for(Militaire militaire : stagiairesPO85()){
            PO85.ajouterMilitaire(militaire);
        }
        return PO85;
    }

    public static List<Militaire> stagiairesPO85(){

        List<Militaire> stagiaires = new ArrayList<>();

        stagiaires.add(EntitiesFactory.createMarin("ZERMANI", "Baptiste", Grade_MN.QUARTIER_MAITRE, SpecialiteMN.TECHNICIEN_SYSTEMES_NUMERIQUES));
        stagiaires.add(EntitiesFactory.createMarin("LE GLUDIC", "Quentin", Grade_MN.MAITRE, SpecialiteMN.TECHNICIEN_SYSTEMES_NUMERIQUES));
        stagiaires.add(EntitiesFactory.createTerrien("FONTAINE", "Baptiste", Grade_AdT.SERGENT, Arme.TROUPES_DE_MARINE));
        stagiaires.add(EntitiesFactory.createTerrien("FAURE", "Bryce", Grade_AdT.SERGENT, Arme.TRANSMISSION));
        stagiaires.add(EntitiesFactory.createAviateur("BOUTANT", "Matthieu", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(EntitiesFactory.createAviateur("LEMARTINEL", "Thomas", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(EntitiesFactory.createAviateur("EUZEN", "Ashley", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(EntitiesFactory.createAviateur("VILLENEUVE", "Harry", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(EntitiesFactory.createAviateur("JOLY", "Simon", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(EntitiesFactory.createTerrien("KILCHEM", "Thomas", Grade_AdT.SERGENT, Arme.TRANSMISSION));
        stagiaires.add(EntitiesFactory.createAviateur("MICHELENA", "Patxi", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(EntitiesFactory.createAviateur("LENOBLE", "Cyril", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(EntitiesFactory.createAviateur("OLSEN", "Yves", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(EntitiesFactory.createAviateur("ROKOTOBE", "Tsriniaina", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));

        return stagiaires;
    }

}
