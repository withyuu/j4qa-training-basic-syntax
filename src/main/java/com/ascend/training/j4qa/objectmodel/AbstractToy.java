package com.ascend.training.j4qa.objectmodel;

public abstract class AbstractToy implements Toy {

    protected int timePlayed = 0;

    protected String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return (name == null)? getClass().getSimpleName() : name;
    }

    @Override
    public int getTimePlayed() {
        return timePlayed;
    }

    @Override
    public void play() {
        System.out.println("I'm playing " + this.getName());

    }
}
