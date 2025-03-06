package views.utils.Perso;

import java.util.Scanner;

public class utilRead {
    private static final Scanner lectureClavier = new Scanner(System.in);

    /**
     * Lecture d'un entier compris entre index1 et index2 inclus. Cette méthode est,
     * notamment utile lors de la sélection d'une option dans un menu. L'option est
     * retournée si la valeur saisie est comprise entre index1 et index2. Si ce
     * n'est pas le cas, le message "Choix invalide" est affiché, et la méthode
     * attend une nouvelle saisie.
     *
     * @param index1
     * @param index2
     * @return l'option saisie
     */
    public static int readInt(final int index1, final int index2){
        int choix;
        boolean boucle = false;
        do{
            choix = lectureClavier.nextInt();

            if(choix < index1 || choix > index2){
                boucle = true;
                System.out.println("Veuillez choisir un valeur valide");
            }
        }while(boucle);

        return choix;
    }
    public static int readInt(){
        int choix;
        boolean boucle = false;

        choix = lectureClavier.nextInt();

        return choix;
    }

    public static String ReadString(){
        return lectureClavier.next();
    }
    public static String ReadString(final String entete){
        System.out.print(entete);
        return lectureClavier.next();
    }

    public static String readString(){
        return lectureClavier.nextLine();
    }

    /*
    */
    public static Boolean ReadBoolean(String libelle){
        boolean resultat = false;

        System.out.println(String.format("%s (oui/non) : ", libelle));
        String reponse = readString().toUpperCase();
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
                utilPrint.printErreur("La valeur saisie n'est pas valide");
                ReadBoolean(libelle);
                break;
        }

        return resultat;
    }
}

