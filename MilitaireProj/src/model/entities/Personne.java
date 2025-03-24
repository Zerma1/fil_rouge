package model.entities;

import model.entities.exceptions.EntityException;

public class Personne extends AbstractEntity {
    //attributes
    private String nom;
    private String prenom;

    //constructeurs
    public Personne(String nom, String prenom) throws EntityException {
        this.setNom(nom);
        this.setPrenom(prenom);
    }

    //get & set
    public String getNom() {
        return nom;
    }


    public void setNom(String nom) throws EntityException {

        if(nom == null ||nom.isEmpty() || nom.isBlank()){
            throw new EntityException("Nom invalide [Null ou Vide ou Blanc]");
        }

        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) throws EntityException {
        this.prenom = prenom;
    }

    //methode
    @Override
    public String toString() {
        return " Nom : " + this.nom + " Prenom : " + this.prenom;
    }
}