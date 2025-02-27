// Militaire.java
package entities;

import java.util.Objects;

public class Militaire extends Personne {
    private int matricule;

    // Constructeur
    public Militaire(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matricule = matricule;
    }

    // Méthodes
    public void sePresenter() {
        System.out.println("Je suis le " + " " + super.getNom() + "  " + getPrenom());
    }

    @Override
    public String toString() {
        return "Militaire ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom(), matricule);
    }

    @Override
    public boolean equals(Object aComparer) {
        return this.hashCode() == aComparer.hashCode() && aComparer instanceof Militaire;
    }
}