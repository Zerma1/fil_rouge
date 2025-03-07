package lanceurs;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.armees.FactoryMilitair;
import models.entities.references.grades.Grade_AAE;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.grades.Grade_MN;
import models.entities.references.specialites.Arme;
import models.entities.references.specialites.SpecialiteAAE;
import models.entities.references.specialites.SpecialiteMN;
import models.facade.FacadeModel;
import models.facade.FacadeModelImpl;
import presenteurs.Presenteur;
import views.facade.FacadeView;
import views.facade.FacadeViewImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PreProduction {

    public static void main(String[] args){
        FacadeModel model = new FacadeModelImpl();
        FacadeView view = new FacadeViewImpl();
        Stage PO85 = initStagePO85();

        Presenteur presenteur = new Presenteur(view, model);

        presenteur.initStage(PO85);
        presenteur.start();

    }

    public static Stage initStagePO85() {
        LocalDate debut = LocalDate.of(2024,12,2);
        LocalDate fin = LocalDate.of(2025,12,2);

        Stage PO85 = FactoryMilitair.creerStage("PO85", debut, fin);

        for(Militaire militaire : stagiairesPO85()){
            PO85.ajouterMilitaire(militaire);
        }

        return PO85;
    }

    public static List<Militaire> stagiairesPO85 (){
        List<Militaire> stagiaires = new ArrayList<>();

        stagiaires.add(FactoryMilitair.creerMarin("ZERMANI", "Baptiste", Grade_MN.QUARTIER_MAITRE, SpecialiteMN.TECHNICIEN_SYSTEMES_NUMERIQUES));
        stagiaires.add(FactoryMilitair.creerMarin("LE GLUDIC", "Quentin", Grade_MN.MAITRE, SpecialiteMN.TECHNICIEN_SYSTEMES_NUMERIQUES));
        stagiaires.add(FactoryMilitair.creerTerrien("FONTAINE", "Baptiste", Grade_AdT.SERGENT, Arme.TROUPES_DE_MARINE));
        stagiaires.add(FactoryMilitair.creerTerrien("FAURE", "Bryce", Grade_AdT.SERGENT, Arme.TRANSMISSION));
        stagiaires.add(FactoryMilitair.creerTerrien("KILCHEM", "Thomas", Grade_AdT.SERGENT, Arme.TRANSMISSION));
        stagiaires.add(FactoryMilitair.creerAvia("BOUTANT", "Matthieu", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(FactoryMilitair.creerAvia("LEMARTINEL", "Thomas", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(FactoryMilitair.creerAvia("EUZEN", "Ashley", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(FactoryMilitair.creerAvia("VILLENEUVE", "Harry", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(FactoryMilitair.creerAvia("JOLY", "Simon", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(FactoryMilitair.creerAvia("MICHELENA", "Patxi", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(FactoryMilitair.creerAvia("LENOBLE", "Cyril", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(FactoryMilitair.creerAvia("OLSEN", "Yves", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        stagiaires.add(FactoryMilitair.creerAvia("RAKOTOBE", "Tsriniaina", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));

    return stagiaires;
    }
}
/*
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at models.facade.FacadeModelImpl.recupererStage(FacadeModelImpl.java:14)
	at presenteurs.Presenteur.afficherLaSection(Presenteur.java:57)
	at presenteurs.Presenteur.gestionMenuPrincipal(Presenteur.java:50)
	at presenteurs.Presenteur.start(Presenteur.java:36)
	at lanceurs.PreProduction.main(PreProduction.java:31)
 */