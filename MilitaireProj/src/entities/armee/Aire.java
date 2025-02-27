package entities.armee;

import entities.Militaire;
import entities.grades.GradesAire;

public class Aire  extends Militaire {

    //ATTRIBUTS
    GradesAire grade;

    //CONSTRUCTEUR
    public Aire(String nom, String prenom, GradesAire grade, int matricule) {
        super(nom, prenom, matricule);
        this.grade = grade;
    }

    //GETTERS

    //SETTERS

    //METHODES

}
