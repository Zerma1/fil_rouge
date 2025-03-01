package entities;

import java.time.LocalDate;

public class Personne {

    private String nom;
    private String prenom;
    private LocalDate dateNaissaince ;

    //CONSTRUCTOR
    public Personne(String nom, String prenom) {
        setNom(nom);
        setPrenom(prenom);
    }

    //GETTERS
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public LocalDate getDateNaissaince() {
        return dateNaissaince;
    }

    //SETTER
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDateNaissaince(LocalDate dateNaissaince) {
        this.dateNaissaince = dateNaissaince;
    }

    //METHODE

    //OVERRIDE & SURCHARGE
    @Override
    public boolean equals(Object tester){

        return this.hashCode() == tester.hashCode() && tester.getClass() == Personne.class;
    }

    public int hashCode() {
        return this.getNom().hashCode() + this.getPrenom().hashCode();
    }
}
