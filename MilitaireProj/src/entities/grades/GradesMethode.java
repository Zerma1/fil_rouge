package entities.grades;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum GradesMethode {

//    private final String grade;
    private final String trigramme;
    private final String prefixOTAN;
    private final int indiceOTAN;

    private static final List<GradesMethode> listeGrade = new ArrayList<>();


    GradesMethode(String trigramme, String prefixOTAN, int indiceOTAN) {
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
        listeGrade.addAll(Arrays.asList(GradesMethode.values()));
    }

    public static GradesMethode choisGrade(){
        initListeGrade();

        GradesMethode choix;

        AffichageConsole.printListe("Choisir un grade", listeGrade);

        int index = LecureConsole.lectureChoisInt(1, listeGrade.size());

        choix = listeGrade.get(index-1);

        return choix;
    }



}
