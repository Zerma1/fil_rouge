package entities;

import entities.grades.GradesAire;

import java.util.Objects;

public class Militaire extends Personne {
    private int matiricule;


    //METHODES
    public Militaire(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matiricule = matricule;
    }

    public void sePresenter() {
        System.out.println("Je suis le " + " " + Militaire.super.getNom() + "  " + getPrenom());
    }

    @Override
    public String toString() {
        return "Militaire ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom();
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
