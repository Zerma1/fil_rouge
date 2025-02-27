// Terre.java
package entities;

import entities.grades.GradesAire;
import entities.grades.GradesMarine;
import entities.grades.GradesTerre;

import static commons.utils.AffichageConsole.printListe;
import static commons.utils.readPrimitif.readInt;

public class Terre extends Militaire {
    private GradesTerre grade;

    // Constructeur
    public Terre(String nom, String prenom, int matricule, GradesTerre grade) {
        super(nom, prenom, matricule);
        this.grade = grade;
    }
    public Terre(String nom, String prenom, int matricule) {
        super(nom, prenom, matricule);
        choisirGrade();
    }

    // GETTERS

    // SETTERS
    private void setGrade(GradesTerre grade) {
        this.grade = grade;
    }

    // Méthodes
    private void choisirGrade(){
        printListe("GARDES DE LA MARINE", GradesMarine.getListeGrade());
        int choix = readInt();
        setGrade(GradesTerre.getGrade(choix-1));
    }

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