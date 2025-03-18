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
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;

        return Objects.equals(getNom(), personne.getNom()) && Objects.equals(getPrenom(), personne.getPrenom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom());
    }


}
