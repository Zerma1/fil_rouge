package entities;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;
import entities.grades.Grades;
import entities.armee.Militaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Section {
    private static String nom;
    private static LocalDate dateCreation;
    private static LocalDate dateFin;
    private static List<Militaire> listePersonelle = new ArrayList<>();

    //CONSTRUCTEUR
    public Section(String nom, LocalDate dateCreation, LocalDate dateFin) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.dateFin = dateFin;
    }
    public Section(String nom) {
        this.nom = nom;
        this.dateCreation = LecureConsole.lectureDate("Date de creation :");
        this.dateFin = LecureConsole.lectureDate("Date de fin :");
    }

    //GETTERS
    /**
     * affiche le temps restant avant la fin de la section
     */
    public void getTempRestant(){
        long joursRestants = java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(), dateFin);
        long joursTotal = java.time.temporal.ChronoUnit.DAYS.between(dateCreation, dateFin);
        System.out.println("Il reste " + joursRestants + " jours sur " + joursTotal + " jours avant la fin.");
    }

    //SETTER

    //METHODE
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
        Grades grade = Grades.setGrade();
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

    //OVERRIDE & SURCHARGE
    @Override
    public String toString() {
        return "Section{" +
                "nom='" + nom + '\'' +
                ", dateCreation=" + dateCreation +
                ", dateFin=" + dateFin +
                ", nbMembre=" + listePersonelle +
                '}';
    }

}
