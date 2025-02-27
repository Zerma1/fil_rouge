package entities;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Grades {
    // Grades de l'armée française
    AMIRAL("AM", "OF-", 9),
    GENERAL("GEN", "OF-", 9),


    // Officiers

    COLONEL("COL", "OF-", 5),
    CAPITAINE("CAP", "OF-", 2),
    LIEUTENANT("LT", "OF-", 1),

    // Sous-officiers
    MAJOR("MAJ", "OR-", 9),

    MAITRE_PRINCIPAL("MTP", "OR-", 9),
    ADJUDANT_CHEF("ADC", "OR-", 9),

    PREMIER_MAITRE("PM", "OR-", 8),
    ADJUDANT("ADJ", "OR-", 8),

    MAITRE("MT","OR-",6),
    SERGENT_CHEF("SGC", "OR-", 6),

    SECOND_MAITRE("SM", "OR-", 5),
    SERGENT("SGT", "OR-", 5),

    //Militair du rang - équipage
    QUARTIER_MAITRE_1("QM1", "OR-", 4),
    CAPORAL_CHEF("CPC", "OR-", 4),

    QUARTIER_MAITRE_2("QM2", "OR-", 3),
    CAPORAL("CPL", "OR-", 3),

    MATELOT("MOT", "OR-", 2),
    PREMIER_CLASSE("1CL", "OR-", 2),

    MOUSSE("MUS", "OR-", 1),
    AVIATEUR("AVT", "OR-", 1),
    SOLDAT("SDT", "OR-", 1);

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
