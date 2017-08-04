package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //w wersjach Javy ponize 1.5 czy 1.6 tylko tak definiowało się ArrayListy, bez typów generycznych, bez diamondów.
        //powodowało to dużo problemów.
        //ArrayList itemssss = new ArrayList();

        /*
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        //items.add("tim"); //heh, tak nie wolno teraz :)
        items.add(3);
        items.add(4);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
        */

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        baseballTeam.addPlayer(pat);

        Team<String> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer("no-one");






        lalala<Double> la1 = new lalala<>();

        System.out.println(la1.getFirst()+ " "+ la1.getSecondl());

        la1.setFirst(6.66);
        la1.setSecondl(4D);


        System.out.println(la1.getFirst()+ " "+ la1.getSecondl());

        lalala<String> la2 = new lalala<>("Andrzej","Dupa");

        System.out.println(la2.getFirst()+ " "+ la2.getSecondl());

    }

}
