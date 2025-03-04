package models.entities.armees;

import models.entities.Militaire;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.specialites.Arme;

public class Terrien extends Militaire {

    private Grade_AdT grade;
    private Arme arme;

    public Terrien(String nom, String prenom, Grade_AdT grade, Arme arme) {
        super(nom, prenom);
        setGrade(grade);
        setArme(arme);
    }

    public Grade_AdT getGrade() {
        return grade;
    }

    public void setGrade(Grade_AdT grade) {
        this.grade = grade;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    @Override
    public void sePresenter() {
        System.out.println("Terrien : " + getGrade().getSymbol() + " " + getNom() + " " + getPrenom() + " \n Arme : " + getArme());
    }
}


