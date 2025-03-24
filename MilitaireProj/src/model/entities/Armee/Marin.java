package model.entities.Armee;

import model.entities.Militaire;
import model.entities.exceptions.EntityException;
import model.entities.references.GradeMarin;
import model.entities.references.SpecialiteMN;

public class Marin extends Militaire {
    //attributes
    private GradeMarin grade;
    private SpecialiteMN specialite;

    //constructeurs

    public Marin(String nom, String prenom, long nid, GradeMarin grade, SpecialiteMN specialite) throws EntityException {
        super(nom, prenom, nid);
        this.setGrade(grade);
        this.setSpecialite(specialite);
    }


    //get & set
    public GradeMarin getGrade() {
        return grade;
    }

    public void setGrade(GradeMarin grade) {
        this.grade = grade;
    }

    public SpecialiteMN getSpecialite() {
        return specialite;
    }

    public void setSpecialite(SpecialiteMN specialite) {
        this.specialite = specialite;
    }

    //methode
    @Override
    public String toString() {
        return this.grade.name().toLowerCase().replace('_', ' ') + " " + super.getNom() + " " + super.getPrenom();
    }
}
