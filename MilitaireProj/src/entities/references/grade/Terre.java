package entities.references.grade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Terre {
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
    SOLDAT("SDT", "OR-", 1);

    private final String trigramme;
    private final String prefixOTAN;
    private final int indiceOTAN;

    private static final List<Terre> listeGrade = new ArrayList<>();

    //CONSTRUCTOR
    Terre(String trigramme, String prefixOTAN, int indiceOTAN) {
        this.trigramme = trigramme;
        this.prefixOTAN = prefixOTAN;
        this.indiceOTAN = indiceOTAN;
    }

    //GETTERS
    public static List<Terre> getListeGrade() {
        return Collections.unmodifiableList(listeGrade);
    }

    public static Terre getGrade(int index){
        return listeGrade.get(index);
    }

    //SETTERS

    //METHODS
}
