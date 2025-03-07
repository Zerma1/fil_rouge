package models.entities;

import java.util.Objects;

public abstract class Militaire extends Personne {


    protected Militaire(String nom, String prenom) {
        super(nom,prenom);
    }


    @Override
    public String toString() {
        return "Militaire{" +
                "Nom='" + getNom() + '\'' +
                "Prenom='" + getPrenom() + '\'';
    }

    public abstract void sePresenter();

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
}
