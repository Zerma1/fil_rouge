package entities.armee;

import entities.grades.Grades;

public class Marine extends Militaire {
    public Marine(String nom, String prenom, Grades grade, int matricule) {
        super(nom, prenom, grade, matricule);
    }
}
