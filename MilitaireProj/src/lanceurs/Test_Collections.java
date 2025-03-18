package lanceurs;

import models.entities.Personne;

import java.util.*;

public class Test_Collections {

    public static void main(String[] args) {

        Map<String,Personne> mapPersonnes = new HashMap<>();

        mapPersonnes.put("Clef 01",new Personne("John","GROS"));

        System.out.println(mapPersonnes.get("Clef 01"));



//        Collection<Personne> personnes = new ArrayList<>();
//
//        personnes.add(new Personne("John", "Doe"));
//        personnes.add(new Personne("Jane", "Doe"));
//        personnes.add(new Personne("Jack", "Doe"));
//        personnes.add(new Personne("Jack", "Doe"));
//
//        for(Personne personne : personnes) {
//            System.out.println(personne);
//        }


    }

}
