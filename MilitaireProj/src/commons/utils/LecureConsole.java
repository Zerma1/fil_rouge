package commons.utils;

import java.time.LocalDate;

import static commons.utils.readPrimitif.readInt;
import static commons.utils.readPrimitif.readString;

public class LecureConsole {

    /**
     * Lecture d'un Integer compris choix < index1 || choix > index2
     * verifie que la saisie est bien un entier
     *
     * @param index1
     * @param index2
     * @return
     */
    public static int lectureChoisInt(final int index1, final int index2) {

        int choix = -1;

        boolean boucle = true;

        do{
            boucle = false;

            choix = readInt();


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

        int choix = -1;

        boolean boucle = true;

        do{
            boucle = false;

            choix = readInt();


            if (choix<=0){
                System.out.println("Erreur de saisie, veuillez recommencer :");
                boucle = true;
            }


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
        String str = "";
        boolean boucle = true;

        do {
            boucle = false;

            str = readString();

            if (str.isEmpty()) {
                System.out.println("Erreur de saisie," + str + "n'est pas une entrée valide veuillez recommencer :");
                boucle = true;
            }
        }while (boucle);

        return str;
    }
    /**
     * Lecture d'un String
     * verifie que la saisie n'est pas vide
     *
     * @param texte
     * @return String
     */
    public static String lectureChoisString(String texte)
    {
        System.out.println(texte);
        String str = "";
        boolean boucle = true;

        do {
            boucle = false;

            str = readString();

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
        int annee = readInt();
        System.out.println("Entrez le mois :");
        int mois = readInt();
        System.out.println("Entrez le jour :");
        int jour = readInt();
        return LocalDate.of(annee, mois, jour);
    }
}
