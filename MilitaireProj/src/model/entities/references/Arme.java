package model.entities.references;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Arme {
    INFANTERIE, L_ARME_BLINDEE_CAVALERIE, L_ARTILLERIE, LE_GENIE, MATERIEL, LE_TRAIN, TRANSMISSIONS, L_AVIATION_LEGERE_DE_L_ARMEE_DE_TERRE, TROUPES_DE_MARINE, ACCEDER_AU_DETAIL;

    public static List<String> getListArmeToString() {
        return Arrays.stream(values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}
