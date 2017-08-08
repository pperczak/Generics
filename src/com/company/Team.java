package com.company;

import java.util.ArrayList;

/**
 * Created by PLPK on 04.08.2017.
 */
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;

    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {

        if (members.contains(player)) {
            System.out.println("Player "+ player.getName()+" is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println("Player "+ player.getName()+" added to the team "+ this.name);
        }
        return true;

    }
    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent , int ourScore, int theirScore) {

        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        }else if (ourScore == theirScore) {
            tied++;
            message = " drew with";
        }else {
            lost++;
            message = " lost to ";
        }
        played++;

        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking() {
        return (this.won*2 + this.tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }else {
            return 0;
        }
    }
}
