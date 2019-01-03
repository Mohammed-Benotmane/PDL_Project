package com.company;

import java.util.ArrayList;

public class Bibliotheque {
    static ArrayList<Document> disponible = new ArrayList<>();
    static ArrayList<Document> emprunter = new ArrayList<>();

    public void modifier(Document document, int nombreDeDocument) {
        int temp;
        for (int i = 0; i < disponible.size(); i++) {
            if (disponible.get(i).equals(document)) {
                temp = disponible.get(i).getNombreExemplaire() + nombreDeDocument;
                disponible.get(i).setNombreExemplaire(temp);
                System.out.println("le nombre d'exemplaire a bien été modifier");
                break;
            }
        }
    }

    public void consulter() {
        for (int j = 0; j < disponible.size(); j++) {
            System.out.println("1-" + disponible.get(j).getTitre());
        }
    }
}