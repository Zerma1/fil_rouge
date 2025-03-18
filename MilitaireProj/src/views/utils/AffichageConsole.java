package views.utils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

/**
 * Cette classe utilitaire propose diverses méthodes d'affichage sur console.
 *
 * @author PDI
 */
public final class AffichageConsole {

    public static final char AFFICHAGE_COIN_MENU = '+';
    public static final char AFFICHAGE_LIGNE_HORIZONTALE = '-';
    public static final char AFFICHAGE_LIGNE_VERTICALE = '|';
    public static final String PATTERN_DATE_PAR_DEFAUT = "dd/MM/yyyy";


    private AffichageConsole() {
    }

    /**
     * Méthode affichant sur la console le message demandé. Après l'affichage un
     * retour à la ligne est envoyé.
     *
     * @param msg Message à afficher.
     */
    public static void afficherMessageAvecSautLigne(final String msg) {
        System.out.println(msg);
    }

    /**
     * Méthode affichant sur la console le message demandé sans retour à la
     * ligne.
     *
     * @param msg Message afficher
     */
    public static void afficherMessageSansSautLigne(final String msg) {
        System.out.print(msg);
    }

    /**
     * Méthode affichant un message d'erreur précédé par la chaine 'Erreur :'.
     *
     * @param msg message d'erreur à afficher.
     */
    public static void afficherErreur(final String msg) {
        final String message = String.format("Erreur : %s", msg);
        AffichageConsole.afficherMessageAvecSautLigne(message);
    }

    /**
     * Affiche une date sur la console selon de pattern indiqué.
     * Si le pattern est invalide, la date sera affichée selon le pattern defini
     * par défaut.
     * La date est affichée sans retour à la ligne.
     *
     * @param date    date à afficher.
     * @param pattern format d'affichage de la date.
     */
    public static void afficherDate(final Date date, final String pattern) {
        SimpleDateFormat sdf;
        try {
            sdf = new SimpleDateFormat(pattern);
        } catch (IllegalArgumentException e) {
            sdf = new SimpleDateFormat(PATTERN_DATE_PAR_DEFAUT);
        }

        if (!Objects.isNull(date)) {
            System.out.println(sdf.format(date));
        }
    }

    /**
     * Affiche une date sur la console selon de pattern indiqué et ajoute un saut de ligne après.
     * Si le pattern est invalide, la date sera affichée selon le pattern defini
     * par défaut.
     *
     * @param date    date à afficher.
     * @param pattern format d'affichage de la date.
     */
    public static void afficherDateAvecSautDeLigne(final Date date, final String pattern) {
        AffichageConsole.afficherDate(date, pattern);
        AffichageConsole.afficherMessageAvecSautLigne("");
    }

    /**
     * Méthode affichant le tableau de String en paramètre sous la forme d'un
     * menu simple.
     * <pre>
     * 1 - première option
     * 2 - deuxième option
     * 3 - troisième option.
     * CHOIX :
     * </pre>
     * Les options sont affichées en minuscules.
     *
     * @param options List de chaînes de caractères à traiter.
     */
    public static void afficherMenuSimple(final List<String> options) {
        for (int i = 0; i < options.size(); i++) {
            AffichageConsole
                    .afficherMessageAvecSautLigne(String.format("%2d - %s", i + 1, options.get(i).toLowerCase()));
        }
        AffichageConsole.afficherChoix("CHOIX");

    }

    /**
     * Méthode affichant le tableau de String en paramètre sous la forme d'un
     * menu simple.
     * <pre>
     * 4 - première option
     * 8 - deuxième option
     * 50 - troisième option.
     * CHOIX :
     * </pre>
     * Les options sont affichées en minuscules.
     *
     * @param options Map contenant en clé le numéro de l'option et en valeur la
     *                chaîne de caractères de l'option.
     */
    public static void afficherMenuSimple(final Map<Integer, String> options) {

        for (Entry<Integer, String> option : options.entrySet()) {
            if (!option.getKey().equals(0)) {
                AffichageConsole.afficherMessageAvecSautLigne(String.format("%2d - %s", option.getKey(), option.getValue().toLowerCase()));
            }
        }
        if (options.containsKey(0)) {
            AffichageConsole.afficherMessageAvecSautLigne(String.format(" 0 - %s", options.get(0).toLowerCase()));
        }
        AffichageConsole.afficherChoix("CHOIX");

    }

    /**
     * Méthode affichant le tableau de String en paramètre sous la forme d'un
     * menu simple de la forme.
     * <pre>
     * 1 - première option
     * 2 - deuxième option
     * 3 - troisième option
     * 0 - sortir
     * CHOIX :
     * </pre>
     * Les options sont affichées en minuscules.
     *
     * @param options       Tableau de chaînes de caractères à traiter.
     * @param libelleSortie Libelle à écrire en regard de l'option de sortie 0.
     */
    public static void afficherMenuSimpleAvecOptionSortie(final List<String> options, final String libelleSortie) {
        for (int i = 0; i < options.size(); i++) {
            AffichageConsole
                    .afficherMessageAvecSautLigne(String.format("%2d - %s", i + 1, options.get(i).toLowerCase()));
        }
        AffichageConsole.afficherMessageAvecSautLigne(String.format(" 0 - %s", libelleSortie));
        AffichageConsole.afficherChoix("CHOIX");
    }

    /**
     * Méthode affichant le tableau de String en paramètre sous la forme d'un menu
     * entouré (voir détail).
     *
     * <pre>
     * +-------- Nom du menu --------+
     * | 1 - première option         |
     * | 2 - deuxième option         |
     * | 3 - troisième option        |
     * | 0 - sortir                  |
     * +-----------------------------+
     * CHOIX :
     * </pre>
     * Les options sont affichées en minuscules.
     *
     * @param options Liste de chaînes de caractères à traiter.
     * @param nomMenu Libellé du menu.
     */
    public static void afficherMenuEntoureAvecOptionSortie(final List<String> options, final String nomMenu) {
        int nombreMaxCaracteres = AffichageConsole.chercherNombreMaxiCaracteresChaines(options);
        if (nomMenu.length() > nombreMaxCaracteres) {
            nombreMaxCaracteres = nomMenu.length();
        }
        int longueurLigne = nombreMaxCaracteres + 6 + 6;
        AffichageConsole.afficherTitreMenuEntoure(nomMenu, longueurLigne);
        for (int i = 0; i < options.size(); i++) {
            AffichageConsole.afficherOptionEntouree(i + 1, options.get(i), longueurLigne);
        }
        AffichageConsole.afficherOptionEntouree(0, "sortir", longueurLigne);
        AffichageConsole.afficherBasMenuEntoure(longueurLigne);
        AffichageConsole.afficherChoix("CHOIX");
    }

    /**
     * Méthode affichant le tableau de String en paramètre sous la forme d'un
     * entouré (voir détail).
     * Les options sont affichées en minuscules.
     * Si la Map contient une clé à "0", cette option est alors affichée en fin du menu.
     * <pre>
     * +-------- Nom du menu --------+
     * | 1 - première option         |
     * | 2 - deuxième option         |
     * | 3 - troisième option        |
     * | 0 - sortir                  |
     * +-----------------------------+
     * CHOIX :
     * </pre>
     *
     * @param options Liste de chaînes de caractères à traiter.
     * @param nomMenu Libellé du menu.
     */
    public static void afficherMenuEntoure(final Map<Integer, String> options, final String nomMenu) {
        int nombreMaxCaracteres = AffichageConsole.chercherNombreMaxiCaracteresChaines(new ArrayList<>(options.values()));
        if (nomMenu.length() > nombreMaxCaracteres) {
            nombreMaxCaracteres = nomMenu.length();
        }
        int longueurLigne = nombreMaxCaracteres + 6 + 6;
        AffichageConsole.afficherTitreMenuEntoure(nomMenu, longueurLigne);
        for (Entry<Integer, String> option : options.entrySet()) {
            if (option.getKey() != 0) {
                AffichageConsole.afficherOptionEntouree(option.getKey(), option.getValue(), longueurLigne);
            }
        }
        if (options.containsKey(0)) {
            AffichageConsole.afficherOptionEntouree(0, options.get(0), longueurLigne);
        }
        AffichageConsole.afficherBasMenuEntoure(longueurLigne);
        AffichageConsole.afficherChoix("CHOIX");
    }

    /**
     * Méthode affichant le libellé en paramètre sans retour à la ligne de la façon, "libelle : ".
     *
     * @param libelle
     */
    private static void afficherChoix(final String libelle) {
        System.out.printf("%s : ", libelle);
    }

    /**
     * Méthode recherchant la chaîne la plus longue affiche le bas du menud'une liste de String.
     *
     * @param lstChaine Collection de chaînes.
     * @return nombre de caractères composant la chaîne la plus longue.
     */
    private static int chercherNombreMaxiCaracteresChaines(final List<String> lstChaine) {
        int nombreMax = 0;
        for (String chaine : lstChaine) {
            if (chaine.length() > nombreMax) {
                nombreMax = chaine.length();
            }
        }
        return nombreMax;
    }

    /**
     * Méthode destinée aux menus console entourés; elle affiche le titre du menu.
     * <pre>
     * +-------- Nom du menu --------+
     * </pre>
     *
     * @param nomMenu
     * @param longueurLigne affiche le bas du menu
     */
    private static void afficherTitreMenuEntoure(final String nomMenu, final int longueurLigne) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFFICHAGE_COIN_MENU);
        int nombreCaracteresHorizontal = ((longueurLigne - nomMenu.length()) / 2) - 1;
        sb.append(AffichageConsole.ligneDeCarateresHorizontaux(nombreCaracteresHorizontal,
                AFFICHAGE_LIGNE_HORIZONTALE));
        sb.append(String.format(" %s ", nomMenu));
        sb.append(AffichageConsole.ligneDeCarateresHorizontaux(nombreCaracteresHorizontal,
                AFFICHAGE_LIGNE_HORIZONTALE));
        sb.append(AFFICHAGE_COIN_MENU);
        System.out.println(sb);
    }

    /**
     * Méthode destinée aux menus console entourés; elle affiche une option.
     * <pre>
     * | 1 - première option         |
     * </pre>
     *
     * @param numeroOption  numéro de l'option (1 dans l'exemple).
     * @param option        affiche le bas du menu
     *                      libellé de l'option.
     * @param longueurLigne
     */
    private static void afficherOptionEntouree(final int numeroOption, final String option, final int longueurLigne) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFFICHAGE_LIGNE_VERTICALE);
        sb.append(String.format(" %2d - %s", numeroOption, option));
        int nombreCaracteresHorizontal = longueurLigne - (6 + option.length());
        sb.append(AffichageConsole.ligneDeCarateresHorizontaux(nombreCaracteresHorizontal, ' '));
        sb.append(AFFICHAGE_LIGNE_VERTICALE);
        System.out.println(sb);
    }

    /**
     * Méthode destinée aux menus console entourés; elle affiche le bas du menu.
     * <pre>
     * +-----------------------------+
     * </pre>
     *
     * @param longueurLigne
     */
    private static void afficherBasMenuEntoure(final int longueurLigne) {
        String sb = AFFICHAGE_COIN_MENU +
                AffichageConsole.ligneDeCarateresHorizontaux(longueurLigne, AFFICHAGE_LIGNE_HORIZONTALE) +
                AFFICHAGE_COIN_MENU;
        System.out.println(sb);
    }

    /**
     * Méthode destinée aux menus console entourés; elle permet d'afficher un nombre consécutif de caractères.
     * Cette méthode est utile pour afficher une liste de blanc à droite du libellé d'une option.
     *
     * @param nombreCaracteres
     * @param caractere
     * @return
     */
    private static String ligneDeCarateresHorizontaux(final int nombreCaracteres, final char caractere) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nombreCaracteres; i++) {
            sb.append(caractere);
        }
        return sb.toString();
    }

}
