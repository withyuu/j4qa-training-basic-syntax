package com.ascend.training.j4qa.basicsyntax.playground;

import com.ascend.training.j4qa.basicsyntax.phone.HuaweiFactory;
import com.ascend.training.j4qa.basicsyntax.phone.HuaweiP9;
import com.ascend.training.j4qa.basicsyntax.phone.SmartphoneInterface;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ClassTest {

    @Test
    public void newObjectPlay() {
        // Not recommended
        HuaweiP9 yuuPhone = new HuaweiP9();

        // Better
        SmartphoneInterface gigPhone = new HuaweiP9();
    }

    @Test
    public void methodCall() {
        SmartphoneInterface yuuPhone = new HuaweiP9();
        System.out.println(yuuPhone.getModel());
    }

    @Test
    public void staticMethodCall() {
        SmartphoneInterface myNewPhone = HuaweiFactory.createSmartPhone("P9");
        System.out.println(myNewPhone.getModel());
    }

    @Test
    public void anonymousInnerClass() {
        List<String> countryList = Arrays.asList("Thailand", "United States", "England", "Korea");
        Collections.sort(countryList);
        assertEquals(Arrays.asList("England", "Korea", "Thailand", "United States"), countryList);

        Collections.sort(countryList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // shorter words come first
                return o1.length() - o2.length();
            }
        });
        assertEquals(Arrays.asList("Korea", "England", "Thailand", "United States"), countryList);
    }

    @Test
    public void lambdaPlay() {
        List<String> countryList = Arrays.asList("Thailand", "United States", "England", "Korea");
        Collections.sort(countryList);
        assertEquals(Arrays.asList("England", "Korea", "Thailand", "United States"), countryList);

        Collections.sort(countryList, (o1, o2) -> o1.length() - o2.length());
        assertEquals(Arrays.asList("Korea", "England", "Thailand", "United States"), countryList);
    }

}
