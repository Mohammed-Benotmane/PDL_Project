package com.company;

public class Document {
    String reference;
    String titre;
    String resume;
    String[] motsCles;
    int nombreExemplaire;

    public Document(String reference, String titre, String resume, String[] motsCles,int nombreExemplaire) {
        this.reference = reference;
        this.titre = titre;
        this.resume = resume;
        this.motsCles = motsCles;
        this.nombreExemplaire = nombreExemplaire;
    }

    //region getters et setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String[] getMotsCles() {
        return motsCles;
    }

    public void setMotsCles(String[] motsCles) {
        this.motsCles = motsCles;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }

    //endregion

}
