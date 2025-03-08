package models.facades;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.specialites.Arme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FacadeModelImpl implements FacadeModel {

    List<Stage> stages = new ArrayList<>();
    List<Grade_AdT> gradesAdt = Arrays.asList(Grade_AdT.values());

    @Override
    public Stage recupererStage(int choix) {
        return stages.get(choix);
    }

    @Override
    public void ajouterStage(Stage stage) {
        stages.add(stage);
    }

    @Override
    public Grade_AdT recupererGradesAdt(int choix) {
        return Grade_AdT.values()[choix];
    }

    @Override
    public Arme recupererArme(int choix) {
        return Arme.values()[choix];
    }

    @Override
    public void ajouterStagiaireDunStage(Stage stage, Militaire militaire) {
        //stage.supprimerMiltaire(militaire);
    }

    @Override
    public void supprimerStagiaireDunStage(Stage stage, int choix) {
        stage.supprimerMiltaire(stage.getSection().get(choix));

    }


    @Override
    public List<Stage> recupererStages() {
        return Collections.unmodifiableList(this.stages);
    }

}
