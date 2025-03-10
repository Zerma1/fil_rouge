package models.entities;

import models.entities.armees.Aviateur;
import models.entities.armees.Marin;
import models.entities.armees.Terrien;
import models.entities.references.grades.Grade_AAE;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.grades.Grade_MN;
import models.entities.references.specialites.Arme;
import models.entities.references.specialites.SpecialiteAAE;
import models.entities.references.specialites.SpecialiteMN;

import java.time.LocalDate;

public final class EntitiesFactory {

    private EntitiesFactory() {}

    public static Stage creerStage(String nom, LocalDate debut, LocalDate fin) {
        return new Stage(nom, debut, fin);
    }

    public static Militaire createAviateur(String nom, String prenom, Grade_AAE grade, SpecialiteAAE specialite) {
        return new Aviateur(nom,prenom,grade,specialite);
    }

    public static Militaire createMarin(String nom, String prenom, Grade_MN grade, SpecialiteMN specialite) {
        return new Marin(nom,prenom,grade, specialite);
    }

    public static Militaire createTerrien(String nom, String prenom, Grade_AdT grade, Arme arme) {
        return new Terrien(nom,prenom,grade,arme);
    }

}
