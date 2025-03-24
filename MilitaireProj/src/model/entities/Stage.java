package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stage extends AbstractEntity {

    //attributes
    private List<Militaire> listMilitaire = new ArrayList<>();
    private String nom;
    private LocalDate dateDebutStage;
    private LocalDate dateFinStage;

    //constructeurs
    public Stage(LocalDate dateDebutStage, LocalDate dateFinStage, String nomStage) {
        this.setDateDebutStage(dateDebutStage);
        this.setDateFinStage(dateFinStage);
        this.setNom(nomStage);
    }

    //get & set
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Militaire> getListMilitaire() {
        return Collections.unmodifiableList(listMilitaire);
    }

    private void setListMilitaire(List<Militaire> listMilitaire) {
        this.listMilitaire = listMilitaire;
    }

    public LocalDate getDateDebutStage() {
        return dateDebutStage;
    }

    public void setDateDebutStage(LocalDate dateDebutStage) {
        this.dateDebutStage = dateDebutStage;
    }

    public LocalDate getDateFinStage() {
        return dateFinStage;
    }

    private void setDateFinStage(LocalDate dateFinStage) {
        this.dateFinStage = dateFinStage;
    }

    //methode
    public void addMilitaire(Militaire militaire) {
        listMilitaire.add(militaire);
    }

    public void removeMilitaire(Militaire militaire) {
        listMilitaire.remove(militaire);
    }

    public long nbJourAvantFin() {
        return this.dateFinStage.toEpochDay() - LocalDate.now().toEpochDay();
    }

    public String afficherNbJourAvantFin() {
        return "Il reste " + this.nbJourAvantFin() + " jours avant la fin du stage.\n";
    }
}