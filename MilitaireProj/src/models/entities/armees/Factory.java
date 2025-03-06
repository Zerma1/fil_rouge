package models.entities.armees;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.references.grades.Grade_MN;
import models.entities.references.specialites.SpecialiteMN;

public final class Factory {

    private Factory(){}

    public static Militaire creerMarin(String nom, String prenom, Grade_MN grade, SpecialiteMN specialite){

        return new Marin(nom, prenom, grade, specialite);
    }

    public static Stage creerStage()

}
