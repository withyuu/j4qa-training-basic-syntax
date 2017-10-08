package com.ascend.training.j4qa.objectmodel;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box {

    private List<Toy> collection;

    public Box() {
        collection = new ArrayList<>();
    }

    public void putToy(Toy toy) {
        collection.add(toy);
    }

    public Toy getToy(int index) {
        return collection.get(index);
    }

    public List<String> getToyList() {
        return collection.stream().map(t -> t.getName()).collect(Collectors.toList());
    }

    public int getNumberOfToys() {
        return this.collection.size();
    }

}
