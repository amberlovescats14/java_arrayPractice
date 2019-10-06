package com.amber;

import java.util.Scanner;

public class UserInputArr {
//    public int[] myIntegers = getIntegers(5);





    public int[] getIntegers(int number){
        Scanner scan = new Scanner(System.in);
        int[] values = new int[number];
        for(int i=0; i<values.length; i++){
            System.out.print("Please enter int for index [" + i + "]: ");
            values[i] = scan.nextInt();
        }
        return values;

    }
    public void count(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count += arr[i];
        }
        System.out.println(count);
    }



}
