package models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stage {

    private String nomStage;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    private List<Militaire> section = new ArrayList<>();

    public Stage(String nomStage, LocalDate dateDebut, LocalDate dateFin) {
        setNomStage(nomStage);
        setDateDebut(dateDebut);
        setDateFin(dateFin);
    }

    public String getNomStage() {
        return nomStage;
    }
    private void setNomStage(String nomStage) {
        this.nomStage = nomStage;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }
    private void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }
    private void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public void ajouterMilitaire(Militaire militaire) {
        this.section.add(militaire);
    }

    public void supprimerMiltaire(Militaire militaire) {
        this.section.remove(militaire);
    }

    public List<Militaire> getSection() {
        return Collections.unmodifiableList(section);
    }

}
