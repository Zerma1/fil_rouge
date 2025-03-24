package model.entities.references;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum GradeAviateur {
    // Militaires du rang
    AVIAT1, AVIAT2, CAPORAL, CAPORAL_CHEF,

    // Sous-officiers
    SERGENT, SERGENT_CHEF, ADJUDANT, ADJUDANT_CHEF, MAJOR,

    // Officiers subalternes
    ASPIRANT, SOUS_LIEUTENANT, LIEUTENANT, CAPITAINE,

    // Officiers supérieurs
    COMMANDANT, LIEUTENANT_COLONEL, COLONEL,

    // Officiers généraux
    GENERAL_DE_BRIGADE_AERIENNE, GENERAL_DE_DIVISION_AERIENNE, GENERAL_DE_CORPS_AERIEN, GENERAL_D_ARME_AERIENNE;

    public static List<String> getListGradeToString() {
        return Arrays.stream(values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}