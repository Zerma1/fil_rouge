// Marine.java
package entities;

import entities.grades.GradesMarine;

import static commons.utils.AffichageConsole.printListe;
import static commons.utils.readPrimitif.readInt;

public class Marine extends Militaire {
    private GradesMarine grade;

    // Constructeur
    public Marine(String nom, String prenom, int matricule, GradesMarine grade) {
        super(nom, prenom, matricule);
        this.grade = grade;
    }
    public Marine(String nom, String prenom, int matricule) {
        super(nom, prenom, matricule);
        choisirGrade();
    }
    // GETTERS

    // SETTERS
    private void setGrade(GradesMarine grade) {
        this.grade = grade;
    }

    // Méthodes
    private void choisirGrade(){
        printListe("GARDES DE LA MARINE",GradesMarine.getListeGrade());
        int choix = readInt();
        setGrade(GradesMarine.getGrade(choix-1));
    }

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
