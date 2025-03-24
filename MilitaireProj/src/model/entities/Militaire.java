package model.entities;

import model.entities.exceptions.EntityException;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Militaire extends Personne {

    //attributes
    private LocalDate dateArriveeSection;
    private long nid;

    //constructeurs
    public Militaire(String nom, String prenom, long nid) throws EntityException {
        super(nom, prenom);
        this.setNid(nid);
    }

    //get & set
    public LocalDate getDateArriveeSection() {
        return dateArriveeSection;
    }

    public void setDateArriveeSection(LocalDate dateArriveeSection) {
        this.dateArriveeSection = dateArriveeSection;
    }

    public long getNid() {
        return nid;
    }

    public void setNid(long nid) {
        this.nid = nid;
    }

    //methode
    @Override
    public abstract String toString();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (this.getClass() != o.getClass()) return false;

        Militaire militaire = (Militaire) o;
        return hashCode() == Objects.hash(militaire.getNom(), militaire.getPrenom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getNom(), super.getPrenom());
    }
}