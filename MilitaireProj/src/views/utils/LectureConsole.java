package views.utils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * Cette classe encapsule la classe Scanner. Elle offre les services utiles à la
 * lecture des informations saisies par l'utilisateur.
 *
 * @author PDI
 * @version 1.0
 */

public final class LectureConsole {

    private static final Scanner lectureClavier = new Scanner(System.in);

    private LectureConsole() {
        super();
    }

    /**
     * Lecture d'un entier compris entre index1 et index2 inclus. Cette méthode est,
     * notamment utile lors de la sélection d'une option dans un menu. L'option est
     * retournée si la valeur saisie est comprise entre index1 et index2. Si ce
     * n'est pas le cas, le message "Choix invalide" est affiché, et la méthode
     * attend une nouvelle saisie.
     *
     * @param index1 option la plus petite du menu.
     * @param index2 option la plus grande du menu.
     * @return l'option saisie.
     */
    public static int lectureChoixInt(final int index1, final int index2) {
        String message = "Choix invalide";
        int choix = -1;
        boolean boucle = true;
        do {
            boucle = false;
            try {
                String choixString = lectureClavier.nextLine();
                choix = Integer.parseInt(choixString);
                if (choix < index1 || choix > index2)
                    throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println(message);
                boucle = true;
            }
        } while (boucle);

        return choix;
    }

    /**
     * Lecture d'une chaine de caractère.
     *
     * @return chaine de caractère saisie.
     */
    public static String lectureChaineCaracteres() {
        return lectureClavier.nextLine();
    }

    /**
     * Lecture d'une chaine de caractère.
     *
     * @param entete message affiché avant la saisie.
     * @return Chaine de caractère saisie.
     */
    public static String lectureChaineCaracteres(final String entete) {
        AffichageConsole.afficherMessageSansSautLigne(entete);
        return lectureChaineCaracteres();
    }

    /**
     * Lecture d'un double. Si la valeur saisie n'est pas un double, le message
     * "Choix invalide" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @return le double.
     */
    public static double lectureDouble() {
        double retour = -1;
        boolean boucle = true;
        do {
            boucle = false;
            try {
                String chaine = lectureClavier.nextLine();
                retour = Double.parseDouble(chaine);
            } catch (NumberFormatException e) {
                System.out.println("Choix invalide");
                boucle = true;
            }
        } while (boucle);

        return retour;
    }

    /**
     * Lecture d'un double. Si la valeur saisie n'est pas un double, le message
     * "Choix invalide" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @param entete Libellé affiché avant la saisie.
     * @return le double.
     */
    public static double lectureDouble(final String entete) {
        AffichageConsole.afficherMessageSansSautLigne(entete);
        return lectureDouble();
    }

    /**
     * Lecture d'un BigDecimal. Si la valeur saisie n'est pas un réel, le message
     * "Choix invalide" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @return Le BigDecimal correspondant à la saisie.
     */
    public static BigDecimal lectureBigDecimal() {
        BigDecimal retour = null;
        boolean boucle = true;
        do {
            boucle = false;
            try {
                String chaine = lectureClavier.nextLine();
                retour = new BigDecimal(chaine);
            } catch (NumberFormatException e) {
                System.out.println("Choix invalide");
                boucle = true;
            }
        } while (boucle);

        return retour;
    }

    /**
     * Lecture d'un BigDecimal. Si la valeur saisie n'est pas un réel, le message
     * "Choix invalide" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @param entete Libellé affiché avant la saisie.
     * @return Le BigDecimal correspondant à la saisie.
     */
    public static BigDecimal lectureBigDecimal(final String entete) {
        AffichageConsole.afficherMessageSansSautLigne(entete);
        return lectureBigDecimal();
    }

    /**
     * Lecture d'une date au format correspondant au pattern. La syntaxe de pattern
     * correspond à la description faite dans la java doc de
     * {@link SimpleDateFormat}. Si la date saisie n'est pas valide, le
     * message "Date erronée" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @param pattern Représentation de la date souhaitée selon la description
     *                {@link SimpleDateFormat}.
     * @return La date
     * @see SimpleDateFormat
     */
    public static Date lectureDate(final String pattern) {
        SimpleDateFormat formater = new SimpleDateFormat(pattern);
        String dateString;
        Date dateJour = new Date();
        Date date = dateJour;
        boolean dateValide;
        do {
            try {
                dateValide = true;
                dateString = lectureClavier.nextLine();
                formater.setLenient(false);
                date = formater.parse(dateString);
            } catch (ParseException e) {
                System.out.println("Date erronée");
                dateValide = false;
            }
        } while (!dateValide);

        return date;
    }

    /**
     * Lecture d'une date au format correspondant au pattern. La syntaxe de pattern
     * correspond à la description faite dans la java doc de
     * {@link SimpleDateFormat}. Si la date saisie n'est pas valide, le
     * message "Date erronée" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @param entete  Libellé affiché avant la saisie.
     * @param pattern Représentation de la date souhaitée selon la description
     *                {@link SimpleDateFormat}.
     * @return La date
     * @see SimpleDateFormat
     */
    public static Date lectureDate(final String entete, final String pattern) {
        AffichageConsole.afficherMessageSansSautLigne(entete);
        return lectureDate(pattern);
    }

    /**
     * Lecture d'une date au format correspondant au pattern. La syntaxe de pattern
     * correspond à la description faite dans la java doc de
     * {@link SimpleDateFormat}. Si la date saisie n'est pas valide, le
     * message "Date erronée" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @param pattern Représentation de la date souhaitée selon la description
     *                {@link SimpleDateFormat}.
     * @return La date de type LocalDate
     * @see SimpleDateFormat
     */
    public static LocalDate lectureLocalDate(final String pattern) {

        String dateString;
        LocalDate date = null;
        boolean dateValide;
        do {
            try {
                dateValide = true;
                dateString = lectureClavier.nextLine();
                date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern(pattern));
            } catch (DateTimeParseException e) {
                System.out.println("Date erronée");
                dateValide = false;
            }
        } while (!dateValide);

        return date;
    }

    /**
     * Lecture d'une date au format correspondant au pattern. La syntaxe de pattern
     * correspond à la description faite dans la java doc de
     * {@link SimpleDateFormat}. Si la date saisie n'est pas valide, le
     * message "Date erronée" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @param entete  Libellé affiché avant la saisie.
     * @param pattern Représentation de la date souhaitée selon la description
     *                {@link SimpleDateFormat}.
     * @return La date de type LocalDate
     * @see SimpleDateFormat
     */
    public static LocalDate lectureLocalDate(final String entete, final String pattern) {
        AffichageConsole.afficherMessageSansSautLigne(entete);
        return lectureLocalDate(pattern);
    }

    /**
     * Lecture d'un entier. Si la valeur saisie n'est pas un entier, le message
     * "Choix invalide" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @return l'entier saisi.
     */
    public static int lectureEntier() {
        int retour = -1;
        boolean boucle = true;
        do {
            boucle = false;
            try {
                String chaine = lectureClavier.nextLine();
                retour = Integer.parseInt(chaine);
            } catch (NumberFormatException e) {
                System.out.println("Choix invalide");
                boucle = true;
            }
        } while (boucle);

        return retour;
    }

    /**
     * Lecture d'un entier. Si la valeur saisie n'est pas un entier, le message
     * "Choix invalide" est affiché, et la méthode attend une nouvelle saisie.
     *
     * @param entete chaine affichée avant la saisie.
     * @return l'entier saisi.
     */
    public static int lectureEntier(String entete) {
        AffichageConsole.afficherMessageSansSautLigne(entete);
        return lectureEntier();
    }

    /**
     * Lit une chaine de caractères et la transforme en booléen. Si la chaine saisie
     * est OUI ou O alors true est retourné. Si la chaine saisie est NON ou N alors
     * false est retourné. Si la chaine saisie est une autre valeur, le message "La
     * valeur saisie n'est pas valide" est affiché et une nouvelle saisie est
     * demandée.
     *
     * @param libelle libellé affiché avant la demande de saisie.
     * @return true si la réponse saisie est "OUI" ou "O" et false si la réponse est
     * "NON" ou "N".
     */
    public static boolean lectureBoolean(String libelle) {
        boolean resultat = false;

        AffichageConsole.afficherMessageSansSautLigne(String.format("%s (oui/non) : ", libelle));
        String reponse = LectureConsole.lectureChaineCaracteres().toUpperCase();
        switch (reponse) {
            case "OUI":
                resultat = true;
                break;
            case "O":
                resultat = true;
                break;
            case "NON":
                resultat = false;
                break;
            case "N":
                resultat = false;
                break;
            default:
                AffichageConsole.afficherErreur("La valeur saisie n'est pas valide");
                lectureBoolean(libelle);
                break;
        }

        return resultat;
    }

}
