package model.entities.references;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum GradeMarin {
    // Militaires du rang
    MATELLOT, QUARTIER_MAITRE_DE_2E_CLASSE, QUARTIER_MAITRE_DE_1RE_CLASSE,

    // Sous-officiers
    SECOND_MAITRE, MAITRE, PREMIER_MAITRE, MAITRE_PRINCIPAL, OFFICIER_MARINIER_CHEF,

    // Officiers subalternes
    ASPIRANT, ENSEIGNE_DE_VAISSEAU_DE_2E_CLASSE, ENSEIGNE_DE_VAISSEAU_DE_1RE_CLASSE, LIEUTENANT_DE_VAISSEAU,

    // Officiers supérieurs
    CAPITAINE_DE_CORVETTE, CAPITAINE_DE_FREGATE, CAPITAINE_DE_VAISSEAU,

    // Officiers généraux
    CONTRE_AMIRAL, VICE_AMIRAL, VICE_AMIRAL_D_ESCADRE, AMIRAL;

    public static List<String> getListGradeToString() {
        return Arrays.stream(values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}
