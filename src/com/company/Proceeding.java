package com.company;

public class Proceeding extends Document{
    String designation;
    String dateSeminaire;
    String nomInstitution;

    public Proceeding(String reference, String titre, String resume, String[] motsCles, String designation, String dateSeminaire, String nomInstitution, int nombreExemplaire) {
        super(reference, titre, resume, motsCles, nombreExemplaire);
        this.designation = designation;
        this.dateSeminaire = dateSeminaire;
        this.nomInstitution = nomInstitution;
    }

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

//endregion
}
