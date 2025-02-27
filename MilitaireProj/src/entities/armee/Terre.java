// Terre.java
package entities;

import entities.grades.GradesTerre;

public class Terre extends Militaire {
    private GradesTerre grade;

    // Constructeur
    public Terre(String nom, String prenom, int matricule, GradesTerre grade) {
        super(nom, prenom, matricule);
        this.grade = grade;
    }

    // Méthodes
    @Override
    public void sePresenter() {
        System.out.println("Je suis le " + grade + " " + super.getNom() + " " + getPrenom() + " de la Terre.");
    }

    @Override
    public String toString() {
        return "Terre ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom() + " | " +
                "grade : " + grade;
    }
}