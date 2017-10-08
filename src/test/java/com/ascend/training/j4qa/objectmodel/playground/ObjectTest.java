package com.ascend.training.j4qa.objectmodel.playground;

import com.ascend.training.j4qa.objectmodel.*;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ObjectTest {

    public int incrementByOne(int i) {
        return ++i;
    }

    @Test
    public void passByValuePlay() {

        int original = 5;
        int after = incrementByOne(original);
        original += 5;

        assertEquals(original, 10);
        assertEquals(after, 6);
    }

    @Test
    public void referencePlay() {
        Box b = new Box();

        // Initiate Toys
        Barbie barbie = new Barbie();
        Lego lego = new Lego();
        PlayDoh playDoh = new PlayDoh();
        Sylvanian sylvanian = new Sylvanian();

        // Add toys to the box
        b.putToy(barbie);
        b.putToy(lego);
        b.putToy(playDoh);
        b.putToy(sylvanian);
        assertEquals(Arrays.asList("Barbie", "Lego", "Play-Doh", "Sylvanian Families"), b.getToyList());

        // Change the name of the toy
        barbie.setName("Elsa");
        assertEquals(Arrays.asList("Elsa", "Lego", "Play-Doh", "Sylvanian Families"), b.getToyList());
    }

    @Test
    public void stillPassByValue() {
        Box b = new Box();
        b.putToy(new Barbie());
        addToExistingBox(b, new Lego());

        // We pass a reference to the Box object to the method
        // That method use the same box we initialize here; so,
        // it should contain 2 Toys
        assertEquals(2, b.getNumberOfToys());
    }

    @Test
    public void andThisIsAlsoPassByValue() {
        Box b = new Box();
        b.putToy(new Barbie());
        Box anotherBox = addToNewBox(b, new Lego());

        assertEquals(1, b.getNumberOfToys());
        assertEquals(1, anotherBox.getNumberOfToys());

        // Box b should contain Barbie and anotherBox contain Lego
        assertEquals(Arrays.asList("Barbie"), b.getToyList());
        assertEquals(Arrays.asList("Lego"),   anotherBox.getToyList());

    }


    public Box addToExistingBox(Box b, Toy t) {
        b.putToy(t);
        return b;
    }

    public Box addToNewBox(Box b, Toy t) {
        b = new Box();
        b.putToy(t);
        return b;
    }


}
