package commons.utils;

import java.time.LocalDate;
import java.util.Scanner;


public class LecureConsole {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Lecture d'un Integer compris choix < index1 || choix > index2
     * verifie que la saisie est bien un entier
     *
     * @param index1
     * @param index2
     * @return
     */
    public static int lectureChoisInt(final int index1, final int index2) {
//        System.out.println("lectureChoisInt(final int index1, final int index2)");
        int choix = -1;

        boolean boucle = true;

        do{
            boucle = false;

            choix = scanner.nextInt();

            if (choix < index1 || choix > index2){
                System.out.println("Erreur de saisie, veuillez recommencer :");
                boucle = true;
            }
        }while (boucle);

        return choix;
    }

    /**
     * Lecture d'un Integer
     * verifie que la saisie est bien un entier
     *
     * @return choix
     */
    public static int lectureChoisInt() {
//        System.out.println("lectureChoisInt()");
        int choix = -1;

        boolean boucle = true;

        do{
            boucle = false;

            choix = scanner.nextInt();

        }while (boucle);

        return choix;
    }
    /**
     * Lecture d'un String
     * verifie que la saisie n'est pas vide
     *
     * @return String
     */
    public static String lectureChoisString()
    {
//        System.out.println("lectureChoisString()");
        String str = "";
        boolean boucle = true;

        do {
            boucle = false;

            str = scanner.next();

            if (str.isEmpty()) {
                System.out.println("Erreur de saisie," + str + "n'est pas une entrée valide veuillez recommencer :");
                boucle = true;
            }
        }while (boucle);

        return str;
    }

    public static LocalDate lectureDate(String text) {
        System.out.println(text);
        System.out.println("Entrez l'année :");
        int annee = lectureChoisInt();
        System.out.println("Entrez le mois :");
        int mois = lectureChoisInt();
        System.out.println("Entrez le jour :");
        int jour = lectureChoisInt();
        return LocalDate.of(annee, mois, jour);
    }
}
