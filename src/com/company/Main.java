package com.company;

public class Main {

    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        String[] motCle={"mot1","mot2","mot3","mot4"};
        String[] auteur={"auteur1","auteur2","autour3"};

        Livre livre1 = new Livre("ref1","livre1","resume1",motCle,auteur,"editeur1","01/05/2010",2,2);
        Livre livre2 = new Livre("ref2","livre2","resume2",motCle,auteur,"editeur2","11/12/2014",2,3);
        Livre livre3 = new Livre("ref3","livre3","resume3",motCle,auteur,"editeur3","21/08/2007",2,4);
        Livre livre4 = new Livre("ref4","livre4","resume4",motCle,auteur,"editeur4","14/09/1998",2,5);
        Livre livre5 = new Livre("ref5","livre5","resume5",motCle,auteur,"editeur5","21/10/2001",2,2);

        Periodique periodique1 = new Periodique("ref6","periodique1","resume6",motCle,"editeur6",12,"25/07/1999",3);
        Periodique periodique2 = new Periodique("ref7","periodique2","resume7",motCle,"editeur7",10,"09/11/2001",1);
        Periodique periodique3 = new Periodique("ref8","periodique3","resume8",motCle,"editeur8",11,"11/05/2018",4);
        Periodique periodique4 = new Periodique("ref9","periodique4","resume9",motCle,"editeur9",18,"30/03/2008",5);

        Bibliotheque.disponible.add(livre1);
        Bibliotheque.disponible.add(livre2);
        Bibliotheque.disponible.add(livre3);
        Bibliotheque.disponible.add(livre4);
        Bibliotheque.disponible.add(livre5);
        Bibliotheque.disponible.add(periodique1);
        Bibliotheque.disponible.add(periodique2);
        Bibliotheque.disponible.add(periodique3);
        Bibliotheque.disponible.add(periodique4);

        //bibliotheque.consulter();
        //bibliotheque.modifier(livre1,5);
        livre1.empruntLivre();

        livre1.restituerLivre();
    }
}
