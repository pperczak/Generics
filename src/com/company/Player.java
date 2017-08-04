package com.company;

/**
 * Created by PLPK on 04.08.2017.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
