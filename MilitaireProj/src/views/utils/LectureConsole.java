package views.utils;

import java.util.Scanner;

public class LectureConsole {

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
    public static int lectureChoixInt(final int index1, final int index2){
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

    public static String lectureChaineCaracteres(){
        return lectureClavier.next();
    }

    public static String lectureChaineCaracteres(final String entete){
        System.out.print(entete);
        return lectureClavier.next();
    }
}
