package entities;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Section {
    private static String nom;
    private static LocalDate dateCreation;
    private static LocalDate dateFin;
    private static List<Militaire> listePersonelle = new ArrayList<>();

    public Section(String nom, LocalDate dateCreation, LocalDate dateFin) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.dateFin = dateFin;
    }

    /**
     * Ajoute un membre à la section
     */
    public static void ajouterMembre(){
        //parametre du militaire
        System.out.println("Nom :");
        String nom = LecureConsole.lectureChoisString();
        System.out.println("Prenom :");
        String prenom = LecureConsole.lectureChoisString();
        System.out.println("Grade :");
        Grades grade = Grades.choisGrade();
        System.out.println("Matricule :");

        int matricule = LecureConsole.lectureChoisInt();

        //ajouter le militair dans la liste
        listePersonelle.add(new Militaire(nom, prenom, grade, matricule));
    }
    /**
     * Ajoute un membre à la section
     * @param militaire
     */
    public static void ajouterMembre(Militaire militaire){
        listePersonelle.add(militaire);
    }



    /**
     * Supprime un membre de la section
     */
    public static void supprimerMembreSection(){

        AffichageConsole.printListe(("Section " + nom + " :").toString(), listePersonelle);

        System.out.println("Choisir un membre à supprimer :");

        int index = LecureConsole.lectureChoisInt(1, listePersonelle.size());

        listePersonelle.remove(index-1);
    }

    @Override
    public String toString() {
        return "Section{" +
                "nom='" + nom + '\'' +
                ", dateCreation=" + dateCreation +
                ", dateFin=" + dateFin +
                ", nbMembre=" + listePersonelle +
                '}';
    }

//    private long getNombreJours() {
//        long diffInMillies = Math.abs(dateFin.getTime() - dateCreation.getTime());
//        return diffInMillies / (24 * 60 * 60 * 1000);
//    }

    public void getTempRestant(){
//        System.out.println("Il reste " + dateFin.minus + "/" + getNombreJours() + " jours avant la fin.");
    }


}
