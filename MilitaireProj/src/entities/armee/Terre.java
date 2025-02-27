package entities.armee;

import entities.Militaire;
import entities.grades.GradesTerre;

public class Terre extends Militaire {

    //ATTRIBUTS
    private GradesTerre grade;

    //CONSTRUCTEUR
    public Terre(String nom, String prenom, GradesTerre grade, int matricule) {
        super(nom, prenom, matricule);
        this.grade = grade;
    }

    //GETTERS

    //SETTERS

    //METHODES

}
