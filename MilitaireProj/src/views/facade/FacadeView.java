package views.facade;

import models.entities.Militaire;
import models.entities.Stage;

import java.util.List;

public interface FacadeView {

    int choixMenu(int min, int max);

    void afficherMenu(List<String> menu);

    void afficherSection(Stage stage);

}
