package com.amber;

public class Main {
    public static void main(String[] args) {
        int[] myIntArr = new int[10];
        myIntArr[0] = 50;
//--------
        int[] secondArr = {1,2,3,4,5};
        System.out.println(secondArr[0]);
//---------
        int[] forLoopArr = new int[10];
        for(int i=0; i<forLoopArr.length; i++){
            forLoopArr[i] = i*10;
        }
        for(int i=0; i<forLoopArr.length; i++) {
            System.out.println(forLoopArr[i]);
        }
//---------

    }
}
