package entities;

import entities.references.Grades;

import java.util.Objects;

public class Militaire extends Personne {
    Grades grade;
    private int matiricule;


    //METHODES
    public Militaire(String nom, String prenom, Grades grade, int matricule) {
        super(nom, prenom);
        this.grade = grade;
        this.matiricule = matricule;
    }

    public void sePresenter() {
        System.out.println("Je suis le " + this.grade + " " + Militaire.super.getNom() + "  " + getPrenom());
    }

    @Override
    public String toString() {
        return "Militaire ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom() + " | " +
                "grade : " + this.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom(), matiricule);
    }

    @Override
    public boolean equals(Object aComparer) {
        return this.hashCode() == aComparer.hashCode() && aComparer instanceof Militaire;
    }

}
