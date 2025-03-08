package models.entities;

import models.entities.references.Grade;

import java.util.Objects;

public abstract class Militaire extends Personne {

    public Grade Grade;

    public Militaire(String nom, String prenom) {
        super(nom,prenom);
    }
    @Override
    public String toString() {
        return "Militaire{" +
                "Nom='" + getNom() + '\'' +
                "Prenom='" + getPrenom() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if (!(o instanceof Militaire militaire)) return false;
        return this.hashCode() == militaire.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom());
    }

    public abstract boolean sePresenter();
}
