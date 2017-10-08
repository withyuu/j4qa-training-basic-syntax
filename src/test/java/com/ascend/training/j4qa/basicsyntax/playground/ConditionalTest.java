package com.ascend.training.j4qa.basicsyntax.playground;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionalTest {

    @Test
    public void ifPlay() {
        assertEquals(true, isLeapYear(1992));
        assertEquals(false, isLeapYear(1900));
        assertEquals(true, isLeapYear(2000));
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void switchPlay() {
        char grade = 'C';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                throw new IllegalArgumentException("Invalid Grade");
        }
        System.out.println("Your grade is " + grade);
    }

}
