package model.entities.Armee;

import model.entities.Militaire;
import model.entities.exceptions.EntityException;
import model.entities.references.Arme;
import model.entities.references.GradeTerrien;

public class Terrien extends Militaire {
    //attributes
    private GradeTerrien grade;
    private Arme arme;

    //constructeurs
    public Terrien(String nom, String prenom, long nid, GradeTerrien grade, Arme arme) throws EntityException {
        super(nom, prenom, nid);
        this.setGrade(grade);
        this.setArme(arme);
    }


    //get & set
    public GradeTerrien getGrade() {
        return grade;
    }

    public void setGrade(GradeTerrien grade) {
        this.grade = grade;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    //methode
    @Override
    public String toString() {
        return this.grade.name().toLowerCase().replace('_', ' ') + " " + super.getNom() + " " + super.getPrenom();
    }
}
