package model.entities;

import model.entities.Armee.Aviateur;
import model.entities.Armee.Marin;
import model.entities.Armee.Terrien;
import model.entities.exceptions.EntityException;
import model.entities.exceptions.FactoryException;
import model.entities.references.*;

import java.time.LocalDate;

public class FactoryMilitaire {
    private FactoryMilitaire() {
    }

    public final static Militaire creerTerrien(String nom, String prenom, long nid, GradeTerrien grade, Arme arme) throws FactoryException {

        try {
            return new Terrien(nom, prenom, nid, grade, arme);
        } catch (EntityException e) {
            throw new FactoryException(e.getMessage());
        }
    }

    public final static Militaire creerMarin(String nom, String prenom, long nid, GradeMarin grade, SpecialiteMN specialite) throws FactoryException {
        try {

            return new Marin(nom, prenom, nid, grade, specialite);
        } catch (EntityException e) {
            throw new FactoryException(e.getMessage());
        }
    }

    public final static Militaire creerAviateur(String nom, String prenom, long nid, GradeAviateur grade, SpecialiteAAE specialite) throws FactoryException {
        try {

            return new Aviateur(nom, prenom, nid, grade, specialite);
        } catch (EntityException e) {
            throw new FactoryException(e.getMessage());
        }
    }

    public final static Stage creerStage(LocalDate dateDebutStage, LocalDate dateFinStage, String nomStage) {

        return new Stage(dateDebutStage, dateFinStage, nomStage);

    }
}
