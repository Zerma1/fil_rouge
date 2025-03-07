package models.entities.armees;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.references.grades.Grade_AAE;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.grades.Grade_MN;
import models.entities.references.specialites.Arme;
import models.entities.references.specialites.SpecialiteAAE;
import models.entities.references.specialites.SpecialiteMN;

import java.time.LocalDate;

public final class FactoryMilitair {

    private FactoryMilitair(){}

    public static Militaire creerMarin(String nom, String prenom, Grade_MN grade, SpecialiteMN specialite){
        return new Marin(nom, prenom, grade, specialite);
    }
    public static Militaire creerTerrien(String nom, String prenom, Grade_AdT grade, Arme specialite){

        return new Terrien(nom, prenom, grade, specialite);
    }
    public static Militaire creerAvia(String nom, String prenom, Grade_AAE grade, SpecialiteAAE specialite){

        return new Aviateur(nom, prenom, grade, specialite);
    }

    public static Stage creerStage(String nom, LocalDate debut, LocalDate fin){
        return new Stage(nom,debut,fin);
    }

}
