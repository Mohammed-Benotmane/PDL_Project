package com.company;

public class These extends Document{
    String nomEditeur;
    String dateSoutenance;
    String lieuSoutenance;
    int nombreExemplaire;

    public These(String reference, String titre, String resume, String[] motsCles, String nomEditeur, String dateSoutenance, String lieuSoutenance, int nombreExemplaire) {
        super(reference, titre, resume, motsCles);
        this.nomEditeur = nomEditeur;
        this.dateSoutenance = dateSoutenance;
        this.lieuSoutenance = lieuSoutenance;
        this.nombreExemplaire = nombreExemplaire;
    }

    //region getters et setters
    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public String getDateSoutenance() {
        return dateSoutenance;
    }

    public void setDateSoutenance(String dateSoutenance) {
        this.dateSoutenance = dateSoutenance;
    }

    public String getLieuSoutenance() {
        return lieuSoutenance;
    }

    public void setLieuSoutenance(String lieuSoutenance) {
        this.lieuSoutenance = lieuSoutenance;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }
//endregion
}
