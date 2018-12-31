package com.company;

public class Livre extends Document{
    String[] auteurNoms;
    String editorNom;
    String dateEdition;
    int nombreDeVolume,nombreExemplaire;
//region getters et setters
    public String[] getAuteurNoms() {
        return auteurNoms;
    }

    public void setAuteurNoms(String[] auteurNoms) {
        this.auteurNoms = auteurNoms;
    }

    public String getEditorNom() {
        return editorNom;
    }

    public void setEditorNom(String editorNom) {
        this.editorNom = editorNom;
    }

    public String getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(String dateEdition) {
        this.dateEdition = dateEdition;
    }

    public int getNombreDeVolume() {
        return nombreDeVolume;
    }

    public void setNombreDeVolume(int nombreDeVolume) {
        this.nombreDeVolume = nombreDeVolume;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }
    //endregion


}
