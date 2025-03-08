package lanceurs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestDate {

    public static final int NB_NOEL_A_AFFICHER = 18;

    public static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy : EEEE dd MMMM");

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int annee = date.getYear();
        date = LocalDate.of(annee, 12, 25);

        afficherBanniere();

        for (int i = 0; i < NB_NOEL_A_AFFICHER; i++) {
            System.out.printf("Date de Noël : %s%n", date.format(dateFormat));
            date = date.plusYears(1);
        }
    }

    private static void afficherBanniere() {
        System.out.println("Afficher le jour de la semaine correspondant aux " + NB_NOEL_A_AFFICHER + "prochaines noël");
    }
}
