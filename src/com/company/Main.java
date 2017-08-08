package com.company;

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

        /* //tak nie wolno bo T extends Player, a string nie jest playerem, pozbywamy sie problemu z castowaniem w klasie Team :)
        Team<String> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer("no-one");
        */

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);


        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");

        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Freemantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,5,7);



        System.out.println(hawthorn.getName()+ " rank is: "+hawthorn.ranking());
        System.out.println(fremantle.getName()+ " rank is: "+fremantle.ranking());
        System.out.println(adelaideCrows.getName()+ " rank is: "+adelaideCrows.ranking());

        //celowy blad demonstracyjny czego nie wolno
        //hawthorn.matchResult(baseballTeam,7,8);


        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(adelaideCrows.compareTo(fremantle));
        System.out.println(fremantle.compareTo(adelaideCrows));

        //Twórczosc własna, niekursowa ;-)
        System.out.println("===========================");
        Pair<Double> la1 = new Pair<>();

        System.out.println(la1.getFirst()+ " "+ la1.getSecondl());

        la1.setFirst(6.66);
        la1.setSecondl(4D);


        System.out.println(la1.getFirst()+ " "+ la1.getSecondl());

        Pair<String> la2 = new Pair<>("Andrzej","Dupa");

        System.out.println(la2.getFirst()+ " "+ la2.getSecondl());

    }

}
