package model.entities.Armee;

import model.entities.Militaire;
import model.entities.exceptions.EntityException;
import model.entities.references.GradeAviateur;
import model.entities.references.SpecialiteAAE;

public class Aviateur extends Militaire {
    //attributes
    private GradeAviateur grade;
    private SpecialiteAAE specialite;

    //constructeurs

    public Aviateur(String nom, String prenom, long nid, GradeAviateur grade, SpecialiteAAE specialite) throws EntityException {
        super(nom, prenom, nid);
        this.setGrade(grade);
        this.setSpecialite(specialite);
    }


    //get & set
    public GradeAviateur getGrade() {
        return grade;
    }

    public void setGrade(GradeAviateur grade) {
        this.grade = grade;
    }

    public SpecialiteAAE getSpecialite() {
        return specialite;
    }

    public void setSpecialite(SpecialiteAAE specialite) {
        this.specialite = specialite;
    }

    //methode
    @Override
    public String toString() {
        return this.grade.name().toLowerCase().replace('_', ' ') + " " + super.getNom() + " " + super.getPrenom();
    }
}
