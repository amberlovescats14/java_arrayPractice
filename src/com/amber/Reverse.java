package com.amber;

public class Reverse {


    public int sortDesc(final int num) {
        byte starting = 0;
        String str = Integer.toString(num);
        String[] numArr = str.split("");
        String[] numArr2 = new String[numArr.length];
        for (int i = numArr.length - 1; i >= 0; i--) {
            numArr2[starting] = numArr[i];
            starting++;
        }
        String joining = String.join("", numArr2);
        return Integer.parseInt(joining);
    }
}
