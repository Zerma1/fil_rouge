package entities.grades;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Grades {
    // Grades de l'armée française
    // HOMMES DU RANG
    MOUSSE ("MOT", "OR-",0),
    AVIATEUR ("AVT", "OR-",0),
    SOLDAT ("SDT", "OR-",0),
    MATELOT2 ("MO2", "OR-",1),
    CAPORAL("CPL", "OR-",3),
    MATELOT1 ("MO1", "OR-",2),
    PREMIERE_CLASSE ("1CL", "OR-",2),
    QUARTIER_MAITRE ("QM2", "OR-",3),
    QUARTIER_MAITRE_CHEF ("QM2", "OR-",4),
    CAPORAL_CHEF("CCH", "OR-",4),

    // SOUS_OFFICIERS
    SECOND_MAITRE ("SM", "OR-",5),
    SERGENT("SGT", "OR-",5),
    MAITRE ("MT", "OR-",6),
    SERGENT_CHEF ("SGC", "OR-",6),
    PREMIER_MAITRE ("PM", "OR8-",8),
    ADJUDANT ("ADJ", "OR-",8),
    MAITRE_PRINCIPAL ("MP", "OR9-",9),
    ADJUDANT_CHEF ("ADC", "OR-",9),
    MAJOR("MJR", "OR-",10),

    // OFFICIERS
    ASPIRANT ("ASP", "OF0-",0),
    ASPIRANT_TERRE ("ASP", "OF0-",0),
    ENSEIGNE_DE_VAISSEAU2 ("EV2", "OF(D)-",1),
    ENSEIGNE_DE_VAISSEAU1 ("EV1", "OF1-",1),
    SOUS_LIEUTENANT ("SLT", "OF1-",1),
    LIEUTENANT_DE_VAISSEAU ("LV", "OF2-",2),
    LIEUTENANT ("LTN", "OF2-",2),
    CAPITAINE_DE_CORVETTE ("CC", "OF3-",3),
    CAPITAINE ("CPT", "OF3-",3),
    CAPITAINE_DE_FREGATE ("CF", "OF4-",4),
    COMMANDANT ("CDT", "OF4-",4),
    CAPITAINE_DE_VAISSEAU ("CF", "OF5-",5),
    LIEUTENANT_COLONEL ("LCL", "OF5-",5),
    COLONEL ("COL", "OF6-",6),

    // AMIRAUTEE
    CONTRE_AMIRAL ("CA", "OF6-",6),
    GENERAL_DE_BRIGADE ("GDB", "OF7-",7),
    VICE_AMIRAL ("VA", "OF7-",7),
    GENERAL_DE_DIVISION ("GDD", "OF8-",8),
    VICE_AMIRAL_D_ESCADRE ("VAE", "OF8-",8),
    GENERAL_DE_CORPS_D_ARMEE ("GCA", "OF9-",9),
    AMIRAL ("AL", "OF9-",9),
    GENERAL_D_ARME ("GDA", "OF10-",10),
    AMIRAL_DE_FRANCE ("AL", "OF10-",10);
    //    private final String grade;
    private final String trigramme;
    private final String prefixOTAN;
    private final int indiceOTAN;

    private static final List<Grades> listeGrade = new ArrayList<>();


    Grades(String trigramme, String prefixOTAN, int indiceOTAN) {
//        this.grade = grade;
        this.trigramme = trigramme;
        this.prefixOTAN = prefixOTAN;
        this.indiceOTAN = indiceOTAN;
    }

    @Override
    public String toString() {
        return name() + " ("+ trigramme + ", OTAN : " + prefixOTAN + indiceOTAN + ")";
    }

    private static void initListeGrade(){
        listeGrade.addAll(Arrays.asList(Grades.values()));
    }

    public static Grades choisGrade(){
        initListeGrade();

        Grades choix;

        AffichageConsole.printListe("Choisir un grade", listeGrade);

        int index = LecureConsole.lectureChoisInt(1, listeGrade.size());

        choix = listeGrade.get(index-1);

        return choix;
    }



}
