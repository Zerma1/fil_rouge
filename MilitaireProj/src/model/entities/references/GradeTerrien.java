package model.entities.references;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum GradeTerrien {
    // Militaires du rang
    SOLDAT("SLD", "OR-1"),
    CAPORAL("CPL", "OR-3"),
    CAPORAL_CHEF("CCH", "OR-4"),

    // Sous-officiers
    SERGENT("SGT", "OR-5"),
    SERGENT_CHEF("SCH", "OR-6"),
    ADJUDANT("ADJ", "OR-7"),
    ADJUDANT_CHEF("ADC", "OR-8"),
    MAJOR("MAJ", "OR-9"),

    // Officiers subalternes
    ASPIRANT("ASP", "OF-1"),
    SOUS_LIEUTENANT("SLT", "OF-1"),
    LIEUTENANT("LTN", "OF-1"),

    // Officiers supérieurs
    CAPITAINE("CNE", "OF-2"),
    COMMANDANT("CDT", "OF-3"),
    LIEUTENANT_COLONEL("LCL", "OF-4"),
    COLONEL("COL", "OF-5"),

    // Officiers généraux
    GENERAL_DE_BRIGADE("GDB", "OF-6"),
    GENERAL_DE_DIVISION("GDI", "OF-7"),
    GENERAL_DE_CORPS_D_ARMEE("GCA", "OF-8"),
    GENERAL_D_ARMEE("GA", "OF-9");

    private final String trigramme;
    private final String gradeOTAN;

    GradeTerrien(String trigramme, String gradeOTAN) {
        this.trigramme = trigramme;
        this.gradeOTAN = gradeOTAN;
    }

    public String getTrigramme() {
        return trigramme;
    }

    public String getGradeOTAN() {
        return gradeOTAN;
    }

    public static List<String> getListGradeToString() {
        return Arrays.stream(values())
                    .map(Enum::name)
                    .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return name().toLowerCase().replace('_', ' ') + " : " + trigramme + ", grade OTAN : " + gradeOTAN;
    }
}