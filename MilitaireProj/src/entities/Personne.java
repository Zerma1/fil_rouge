package entities;

public class Personne {

    private String nom;
    private String prenom;
    private int bAnnee;
    private int bMoi;
    private int bJour;


    public Personne(String nom, String prenom) {
        setNom(nom);
        setPrenom(prenom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int hashCode() {
        return this.getNom().hashCode() + this.getPrenom().hashCode();
    }

    @Override
    public boolean equals(Object tester){

        return this.hashCode() == tester.hashCode() && tester.getClass() == Personne.class;
    }
}
