package entities.armee;

import entities.Militaire;
import entities.grades.GradesMarine;

public class Marine  extends Militaire {

    //ATTRIBUTS
    GradesMarine grade;

    //CONSTRUCTEUR
    public Marine(String nom, String prenom, GradesMarine grade, int matricule) {
        super(nom, prenom, matricule);
        this.grade = grade;

    }

    //GETTERS

    //SETTERS

    //METHODES

}
