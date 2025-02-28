package entities.references.grade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Marine {

    MOUSSE ("MOT", "OR-",0),
    MATELOT2 ("MO2", "OR-",1),
    MATELOT1 ("MO1", "OR-",2),
    QUARTIER_MAITRE ("QM2", "OR-",3),
    QUARTIER_MAITRE_CHEF ("QM2", "OR-",4),
    SECOND_MAITRE ("SM", "OR-",5),
    MAITRE ("MT", "OR-",6),
    PREMIER_MAITRE ("PM", "OR8-",8),
    MAITRE_PRINCIPAL ("MP", "OR9-",9),
    MAJOR ("MJR", "OR9-",9),
    ASPIRANT ("ASP", "OF0-",0),
    ENSEIGNE_DE_VAISSEAU2 ("EV2", "OF(D)-",1),
    ENSEIGNE_DE_VAISSEAU1 ("EV1", "OF1-",1),
    LIEUTENANT_DE_VAISSEAU ("LV", "OF2-",2),
    CAPITAINE_DE_CORVETTE ("CC", "OF3-",3),
    CAPITAINE_DE_FREGATE ("CF", "OF4-",4),
    CAPITAINE_DE_VAISSEAU ("CF", "OF5-",5),
    CONTRE_AMIRAL ("CA", "OF6-",6),
    VICE_AMIRAL ("VA", "OF7-",7),
    VICE_AMIRAL_D_ESCADRE ("VAE", "OF8-",8),
    AMIRAL ("AL", "OF9-",9),
    AMIRAL_DE_FRANCE ("AL", "OF10-",10);

    private final String trigramme;
    private final String prefixOTAN;
    private final int indiceOTAN;

    private static final List<Marine> listeGrade = new ArrayList<>();

    //CONSTRUCTOR
    Marine(String trigramme, String prefixOTAN, int indiceOTAN) {
        this.trigramme = trigramme;
        this.prefixOTAN = prefixOTAN;
        this.indiceOTAN = indiceOTAN;
    }

    //GETTERS
    public static List<Marine> getListeGrade() {
        return Collections.unmodifiableList(listeGrade);
    }

    public static Marine getGrade(int index){
        return listeGrade.get(index);
    }

    //SETTERS

    //METHODS
}
