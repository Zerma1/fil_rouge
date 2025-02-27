package entities.grades;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum GradesAire {
    // Grades de l'armée française
    AMIRAL("AM", "OF-", 9),
    GENERAL("GEN", "OF-", 9),


    // Officiers

    COLONEL("COL", "OF-", 5),
    CAPITAINE("CAP", "OF-", 2),
    LIEUTENANT("LT", "OF-", 1),

    // Sous-officiers
    MAJOR("MAJ", "OR-", 9),

    ADJUDANT_CHEF("ADC", "OR-", 9),

    ADJUDANT("ADJ", "OR-", 8),

    SERGENT_CHEF("SGC", "OR-", 6),

    SERGENT("SGT", "OR-", 5),

    //Militair du rang
    CAPORAL_CHEF("CPC", "OR-", 4),

    CAPORAL("CPL", "OR-", 3),

    PREMIER_CLASSE("1CL", "OR-", 2),

    AVIATEUR("AVT", "OR-", 1);

//    private final String grade;
    private final String trigramme;
    private final String prefixOTAN;
    private final int indiceOTAN;

    private static final List<GradesAire> listeGrade = new ArrayList<>();


    GradesAire(String trigramme, String prefixOTAN, int indiceOTAN) {
//        this.grade = grade;
        this.trigramme = trigramme;
        this.prefixOTAN = prefixOTAN;
        this.indiceOTAN = indiceOTAN;
    }

    //GETTERS
    public static List<GradesAire> getListeGrade() {
        return Collections.unmodifiableList(listeGrade);
    }

    public static GradesAire getGrade(int index){
        return listeGrade.get(index);
    }

    @Override
    public String toString() {
        return name() + " ("+ trigramme + ", OTAN : " + prefixOTAN + indiceOTAN + ")";
    }

    private static void initListeGrade(){
        listeGrade.addAll(Arrays.asList(GradesAire.values()));
    }

    public static GradesAire choisGrade(){
        initListeGrade();

        GradesAire choix;

        AffichageConsole.printListe("Choisir un grade", listeGrade);

        int index = LecureConsole.lectureChoisInt(1, listeGrade.size());

        choix = listeGrade.get(index-1);

        return choix;
    }



}
