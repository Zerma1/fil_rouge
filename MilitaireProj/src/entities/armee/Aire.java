// Aire.java
package entities;

public class Aire extends Militaire {
    private String grade;

    // Constructeur
    public Aire(String nom, String prenom, int matricule, String grade) {
        super(nom, prenom, matricule);
        this.grade = grade;
    }

    // Méthodes
    @Override
    public void sePresenter() {
        System.out.println("Je suis le " + grade + " " + super.getNom() + " " + getPrenom() + " de l'Aire.");
    }

    @Override
    public String toString() {
        return "Aire ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom() + " | " +
                "grade : " + grade;
    }
}
