package com.company;

import java.util.ArrayList;

/**
 * Created by PLPK on 04.08.2017.
 */
public class Team<T> {
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
            System.out.println("Player "+ ((Player)player).getName()+" is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println("Player "+ ((Player) player).getName()+" added to the team "+ this.name);
        }
        return true;

    }
    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        }else if (ourScore == theirScore) {
            tied++;
        }else {
            lost++;
        }
        played++;

        if (opponent != null) {
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking() {
        return (this.won*2 + this.tied);
    }
}
