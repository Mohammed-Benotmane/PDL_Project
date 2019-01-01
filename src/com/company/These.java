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

    public void empruntThese() {
        for (int i = 0; i < Bibliotheque.disponible.size(); i++) {
            if (reference.matches(Bibliotheque.disponible.get(i).getReference())) {
                if (nombreExemplaire > 0) {
                    nombreExemplaire--;
                    Bibliotheque.emprunter.add(Bibliotheque.disponible.get(i));
                    System.out.println("La thèse " + titre + " a bien été emprunté.");
                } else {
                    System.out.println("La thèse " + titre + " est indisponible.");
                }
                break;
            }
        }
    }

    public void restituerLivre(){
        for(int i=0;i<Bibliotheque.emprunter.size();i++){
            if(reference.matches(Bibliotheque.emprunter.get(i).getReference())){
                Bibliotheque.emprunter.remove(i);
                System.out.println("Le These "+ titre + "à bien été restituer");
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