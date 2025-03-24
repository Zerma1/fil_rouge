package lanceur;

import model.entities.FactoryMilitaire;
import model.entities.Stage;
import model.entities.exceptions.FactoryException;
import model.entities.references.*;
import model.entities.Militaire;
import model.facades.FacadeModel;
import model.facades.FacadeModelImpl;
import presenteur.Presenteur;
import view.facades.FacadeView;
import view.facades.FacadeViewConsoleImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgMain {

    private static FacadeView facadeView = new FacadeViewConsoleImpl();
    private static FacadeModel facadeModel = new FacadeModelImpl();

    public static void main(String[] args) {

        Presenteur presenteur = new Presenteur(facadeView, facadeModel);

        init(presenteur);

        presenteur.start();
    }

    public static void init(Presenteur presenteur) {
        Stage empireGalactique = FactoryMilitaire.creerStage(LocalDate.of(2024, 12, 2), LocalDate.of(2025, 7, 25), "Empire Galactique");

        initStage(empireGalactique);

        try {
            presenteur.addStageAuModel(empireGalactique);
        }
        catch (Exception e) {
            facadeView.afficherMessageErreur(e.getMessage());
        }
    }

    public static void initStage(Stage stage) {
        for (Militaire militaire : listMembreEmpire()) {
            stage.addMilitaire(militaire);
        }
    }

    public static List<Militaire> listMembreEmpire() {

        List<Militaire> listMembreEmpire = new ArrayList<>();

        try{
            listMembreEmpire.add(FactoryMilitaire.creerTerrien("FAURE", "Bryce", 1245788965, GradeTerrien.SERGENT, Arme.TRANSMISSIONS));
            listMembreEmpire.add(FactoryMilitaire.creerTerrien("VANTO", "Eli", 2115040107, GradeTerrien.LIEUTENANT_COLONEL, Arme.MATERIEL));
            listMembreEmpire.add(FactoryMilitaire.creerMarin("THRAWN", "Mitth'raw'nuruodo", 1915040107, GradeMarin.AMIRAL, SpecialiteMN.AMIRAL));
            listMembreEmpire.add(FactoryMilitaire.creerTerrien("PALPATINE", "Sheev", 1545040107, GradeTerrien.SERGENT, Arme.INFANTERIE));
            listMembreEmpire.add(FactoryMilitaire.creerTerrien("VADOR", "Dark", 1245741965, GradeTerrien.GENERAL_DE_CORPS_D_ARMEE, Arme.INFANTERIE));
            listMembreEmpire.add(FactoryMilitaire.creerTerrien("TARKIN", "Wilhuff", 124148965, GradeTerrien.GENERAL_DE_CORPS_D_ARMEE, Arme.INFANTERIE));
            listMembreEmpire.add(FactoryMilitaire.creerTerrien("KRENNIC", "Orson", 1244178965, GradeTerrien.CAPITAINE, Arme.INFANTERIE));
            listMembreEmpire.add(FactoryMilitaire.creerTerrien("HUX", "Armitage", 14, GradeTerrien.ADJUDANT, Arme.INFANTERIE));
            listMembreEmpire.add(FactoryMilitaire.creerTerrien("GIDEON", "Tarkin", 1245741965, GradeTerrien.GENERAL_DE_BRIGADE, Arme.INFANTERIE));

        }catch (FactoryException e){
            System.out.println("ERREUR INITIALIZATION");
            System.out.println(e.getMessage());
        }

        return listMembreEmpire;
    }
}
