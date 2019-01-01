package com.company;

public class Livre extends Document {
    String[] auteurNoms;
    String editorNom;
    String dateEdition;
    int nombreDeVolume, nombreExemplaire;

    public Livre(String reference, String titre, String resume, String[] motsCles, String[] auteurNoms, String editorNom, String dateEdition, int nombreDeVolume, int nombreExemplaire) {
        super(reference, titre, resume, motsCles,nombreExemplaire);
        this.auteurNoms = auteurNoms;
        this.editorNom = editorNom;
        this.dateEdition = dateEdition;
        this.nombreDeVolume = nombreDeVolume;
    }

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

    //endregion

    public void empruntLivre() {
        for (int i = 0; i < Bibliotheque.disponible.size(); i++) {
            if (reference.matches(Bibliotheque.disponible.get(i).getReference())) {
                if (nombreExemplaire > 0) {
                    nombreExemplaire--;
                    Bibliotheque.emprunter.add(Bibliotheque.disponible.get(i));
                    System.out.println("Le livre " + titre + " a bien été emprunté.");
                } else {
                    System.out.println("Le livre " + titre + " est indisponible.");
                }
                break;
            }
        }
    }

    public void restituerLivre(){
        for(int i=0;i<Bibliotheque.emprunter.size();i++){
            if(reference.matches(Bibliotheque.emprunter.get(i).getReference())){
                Bibliotheque.emprunter.remove(i);
                System.out.println("Le livre "+ titre + "à bien été restituer");
                break;
            }
        }

        for(int j=0;j<Bibliotheque.disponible.size();j++){
            if(reference.matches(Bibliotheque.disponible.get(j).getReference())){
                nombreExemplaire++;
                break;
            }
        }
    }
}
