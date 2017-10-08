package com.ascend.training.j4qa.basicsyntax.playground;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopTest {

    @Test
    public void forPlay() {
        // Normal for loop
        for (int i = 0; i < 5; i++) {
            System.out.format("Normal For Loop: Iteration %d%n", i);
        }

        // infinite loop
        int count = 0;// infinite loop
        for (;;) {
            System.out.format("Infinite For Loop: Iteration %d%n", count);
            if (++count == 5) break;
        }

        // for each loop
        int[] a = {0, 1, 2, 3, 4};
        for (int i : a) {
            System.out.format("For Each Loop: Iteration %d%n", i);
        }

    }

    @Test
    public void whilePlay() {
        int count = 0;
        while (count < 5) {
            System.out.format("While Loop: Iteration %d%n", count);
            count++;
        }
    }

    @Test
    public void doWhilePlay() {
        int count = 0;
        do {
            System.out.format("Do While Loop: Iteration %d%n", count);
            count++;
        } while (count < 5);
    }

    @Test
    public void iteratorPlay() {
        List<String> list =  Arrays.asList("Brixton", "Camden", "Dalston", "Edgware", "Finchley");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.format("Iterator Loop: %s%n", itr.next());
        }
    }

    @Test
    public void streamPlay() {
        List<String> list =  Arrays.asList("Brixton", "Camden", "Dalston", "Edgware", "Finchley");
        list.forEach(item -> System.out.format("Stream Loop: %s%n", item));
    }
}
