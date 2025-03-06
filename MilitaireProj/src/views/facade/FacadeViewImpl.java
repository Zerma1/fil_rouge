package views.facade;

import models.entities.Militaire;
import models.entities.Stage;
import views.utils.ADC_Ptaczala.AffichageConsole;
import views.utils.ADC_Ptaczala.LectureConsole;

import java.util.List;


public class FacadeViewImpl implements FacadeView {

    @Override
    public int choixMenu(int min, int max) {
        return LectureConsole.lectureChoixInt(min, max);
    }

    @Override
    public void afficherMenu(List<String> menu) {
        AffichageConsole.afficherMenuSimple(menu);
    }

    @Override
    public void afficherSection(Stage stage) {
        for(Militaire militair : stage.getSection()){
            System.out.println(militair);
        }
    }


}
