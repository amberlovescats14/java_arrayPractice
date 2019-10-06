package com.amber;

import java.util.Arrays;

public class Binary {
    private static int key = 5;
    int[] odds = {1, 3, 5, 7};

    public void binary(){
        System.out.println(Arrays.binarySearch(odds, key));
    }

}
