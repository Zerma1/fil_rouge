package entities;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Section {
    private static String nom;
    private static LocalDate dateCreation;
    private static LocalDate dateFin;
    private static List<Militaire> listePersonelle = new ArrayList<>();
    private static Militaire chefSection;

    //CONSTRUCTEURS
    public Section(String nom, LocalDate dateCreation, LocalDate dateFin) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.dateFin = dateFin;
    }
    public Section(String nom, LocalDate dateCreation, LocalDate dateFin, List<Militaire> listePersonelle) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.dateFin = dateFin;
        this.listePersonelle = listePersonelle;
    }

    //GETTERS
    public String getNom() {
        return nom;
    }
    public LocalDate getDateCreation() {
        return dateCreation;
    }
    public LocalDate getDateFin() {
        return dateFin;
    }
    public List<Militaire> getListePersonelle() {
        return Collections.unmodifiableList(listePersonelle);
//        return listePersonelle;
    }
    public Militaire getChefSection() {
        return chefSection;
    }

    //SETTERS
    private void setNom(String nom) {
        this.nom = nom;
    }
    private void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
    private void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
    private void setListePersonelle(List<Militaire> listePersonelle) {
        this.listePersonelle = listePersonelle;
    }
    private void setChefSection(Militaire chefSection) {
        this.chefSection = chefSection;
    }

    //METHODES
    /**
     * Ajoute un membre à la section
     * Demande les parametres de creation d'un Militaire
     * Ajoute le militaire à la liste
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
     * ajoute le militaire à la liste
     */
    public static void ajouterMembre(Militaire militaire){
        listePersonelle.add(militaire);
    }
    /**
     * Ajoute un membre à la section
     * @param nom
     * @param prenom
     * @param grade
     * @param matricule
     * ajoute le militaire à la liste
     */
    public static void ajouterMembre(String nom, String prenom, Grades grade, int matricule) {
        listePersonelle.add(new Militaire(nom, prenom, grade, matricule));
    }
    /**
     * Ajoute une liste de membre à la section
     * @param listePersonelle
     * ajoute la liste de militaire à la liste
     */
    public static void ajouterMembre(List<Militaire> listePersonelle) {
        listePersonelle.addAll(listePersonelle);
    }

    /**
     * Supprime un membre de la section
     * Affiche la liste des membres
     * demande de choisir un membre à supprimer
     * supprime le membre
     */
    public static void supprimerMembreSection(){
        //afficher la liste des membres
        AffichageConsole.printListe(("Section " + nom + " :").toString(), listePersonelle);

        //choisir un membre à supprimer
        System.out.println("Choisir un membre à supprimer :");

        int index = LecureConsole.lectureChoisInt(1, listePersonelle.size());

        //supprimer le membre
        listePersonelle.remove(index-1);
    }
    /**
     * Supprime un membre de la section
     * @param militaire
     * supprime le militaire de la liste
     */
    public static void supprimerMembreSection(Militaire militaire){
        listePersonelle.remove(militaire);
    }
    /**
     * Supprime un membre de la section
     * @param liste
     * supprime la listePersonelle de la liste
     */
    public void supprimerMembreSection(List<Militaire> liste){
        listePersonelle.removeAll(liste);
    }

    /**
     * Designe un chef de section
     * Affiche la liste des membres
     * demande de choisir un membre à designer
     * designe le membre
     */
    public void designerChefSection(){
        if(chefSection != null){
            System.out.println("Le chef de section est déjà désigné.");
            return;
        }else {
            AffichageConsole.printListe("Choisir un chef de section", listePersonelle);
            int index = LecureConsole.lectureChoisInt(1, listePersonelle.size());
            chefSection = listePersonelle.get(index-1);
        }

    }

    /**
     * Affiche les membres de la section
     */
    public void afficherSection() {
        AffichageConsole.printListe("Section " + nom + " :", listePersonelle);
    }




    public void getTempRestant(){
        long joursRestants = java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(), dateFin);
        long joursTotal = java.time.temporal.ChronoUnit.DAYS.between(dateCreation, dateFin);
        System.out.println("Il reste " + dateFin.minusDays(joursRestants) + "/" + joursTotal + " jours avant la fin.");
    }



    //OVERIDE
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
