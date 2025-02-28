// Aire.java
package entities;

import entities.grades.GradesAire;
import entities.grades.GradesMarine;

import static commons.utils.AffichageConsole.printListe;
import static commons.utils.readPrimitif.readInt;

public class Aire extends Militaire {
    private GradesAire grade;

    // Constructeur
    public Aire(String nom, String prenom, int matricule, GradesAire grade) {
        super(nom, prenom, matricule);
        this.grade = grade;
    }
    public Aire(String nom, String prenom, int matricule) {
        super(nom, prenom, matricule);
        choisirGrade();
    }

    // GETTERS

    // SETTERS
    private void setGrade(GradesAire grade) {
        this.grade = grade;
    }

    // Méthodes
    private void choisirGrade(){
        printListe("Rang de l'amicale du vent et du vide",GradesAire.getListeGrade());
        int choix = readInt();
        setGrade(GradesAire.getGrade(choix-1));
    }

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
