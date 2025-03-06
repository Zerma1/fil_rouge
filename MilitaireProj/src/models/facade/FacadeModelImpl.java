package models.facade;

import models.entities.Stage;

import java.util.ArrayList;
import java.util.List;

public class FacadeModelImpl implements FacadeModel{

    List<Stage> stages = new ArrayList<>();

    @Override
    public Stage recupererStage(int choixStage) {
        return stages.get(choixStage);
    }

    @Override
    public void ajouterStage(Stage stage) {

    }
}
