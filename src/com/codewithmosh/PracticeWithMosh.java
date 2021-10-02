package com.codewithmosh;

import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

public class PracticeWithMosh {
    public static void main(String[] args) {
        String [] peter = new String[5];
        int [] myNumbers = new int[5];
        boolean [] isOn = new boolean[5];

        int [] myNumbers2 = {4,2,3,1,5,6,7,10,9,8,11,15,13,14,11};

        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(myNumbers2));

        Arrays.sort(myNumbers2);

        System.out.println(myNumbers2.length);
        System.out.println(Arrays.toString(myNumbers2));

        System.out.println(Arrays.toString(peter));
        System.out.println(Arrays.toString(myNumbers));
        System.out.println(Arrays.toString(isOn));



    }
}
