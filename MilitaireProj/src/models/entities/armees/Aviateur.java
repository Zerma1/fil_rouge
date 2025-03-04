package models.entities.armees;

import models.entities.Militaire;
import models.entities.references.grades.Grade_AAE;
import models.entities.references.specialites.SpecialiteAAE;

public class Aviateur extends Militaire {

    private Grade_AAE grade;
    private SpecialiteAAE specialite;



    public Aviateur(String nom, String prenom, Grade_AAE grade, SpecialiteAAE specialite) {
        super(nom, prenom);
        setGrade(grade);
        setSpecialite(specialite);
    }

    public Grade_AAE getGrade() {
        return grade;
    }

    public void setGrade(Grade_AAE grade) {
        this.grade = grade;
    }

    public SpecialiteAAE getSpecialite() {
        return specialite;
    }

    public void setSpecialite(SpecialiteAAE specialite) {
        this.specialite = specialite;
    }

    @Override
    public void sePresenter() {
        System.out.println("Aviateur : " + getGrade().getSymbol() + " " + getNom() + " " + getPrenom() + " \n Spécialité : " + getSpecialite());
    }

}
