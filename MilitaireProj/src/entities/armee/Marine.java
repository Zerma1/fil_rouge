// Marine.java
package entities;

public class Marine extends Militaire {
    private String grade;

    // Constructeur
    public Marine(String nom, String prenom, int matricule, String grade) {
        super(nom, prenom, matricule);
        this.grade = grade;
    }

    // Méthodes
    @Override
    public void sePresenter() {
        System.out.println("Je suis le " + grade + " " + super.getNom() + " " + getPrenom() + " de la Marine.");
    }

    @Override
    public String toString() {
        return "Marine ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom() + " | " +
                "grade : " + grade;
    }
}
