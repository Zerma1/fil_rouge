package lanceurs;

import models.entities.Stage;
import models.facade.FacadeModel;
import models.facade.FacadeModelImpl;
import presenteurs.Presenteur;
import views.facade.FacadeView;
import views.facade.FacadeViewImpl;

import java.time.LocalDate;

public class PreProduction {

    public static void main(String[] args){
        FacadeModel model = new FacadeModelImpl();
        FacadeView view = new FacadeViewImpl();

        Presenteur presenteur = new Presenteur(view, model);

        presenteur.start();
    }

    public static void initStagePO85() {
        LocalDate debut = LocalDate.of(2024,12,02);
        LocalDate fin = LocalDate.of(2025,12,02);

        Stage PO85 = Factory.creerStage("PO85, debut, fin");

        //TODOO : creer stagier

    }
}
