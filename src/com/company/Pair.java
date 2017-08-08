package com.company;

/**
 * Created by PLPK on 04.08.2017.
 */
public class Pair<T> {
    private T first;
    private T secondl;

    public Pair(T first, T secondl) {
        this.first = first;
        this.secondl = secondl;
    }

    public Pair() {
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecondl() {
        return secondl;
    }

    public void setSecondl(T secondl) {
        this.secondl = secondl;
    }
}
