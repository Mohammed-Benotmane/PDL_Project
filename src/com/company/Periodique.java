package com.company;

public class Periodique extends Document{
    String nomEditeur;
    int numeroEdition;
    String dateApparition;
    int nombreExemplaire;

    public Periodique(String reference, String titre, String resume, String[] motsCles, String nomEditeur, int numeroEdition, String dateApparition, int nombreExemplaire) {
        super(reference, titre, resume, motsCles);
        this.nomEditeur = nomEditeur;
        this.numeroEdition = numeroEdition;
        this.dateApparition = dateApparition;
        this.nombreExemplaire = nombreExemplaire;
    }

    //region getters et setters
    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public int getNumeroEdition() {
        return numeroEdition;
    }

    public void setNumeroEdition(int numeroEdition) {
        this.numeroEdition = numeroEdition;
    }

    public String getDateApparition() {
        return dateApparition;
    }

    public void setDateApparition(String dateApparition) {
        this.dateApparition = dateApparition;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }
//endregion

}
