package com.company;

public class Proceeding extends Document{
    String designation;
    String dateSeminaire;
    String nomInstitution;
    int nombreExemplaire;
//region getters et setters
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDateSeminaire() {
        return dateSeminaire;
    }

    public void setDateSeminaire(String dateSeminaire) {
        this.dateSeminaire = dateSeminaire;
    }

    public String getNomInstitution() {
        return nomInstitution;
    }

    public void setNomInstitution(String nomInstitution) {
        this.nomInstitution = nomInstitution;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }
//endregion
}
