package com.song.algo.chap01;

public class MinMaxExercise {
    //Q1. 네 값의 최대값을 구하는 max4 메서드를 작성하세요
    static int max4 (int a, int b, int c, int d) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    // Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요
    static int min3 (int a, int b, int c) {
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;

        return min;
    }

    // Q3 . 네 값의 최소값을 구하는 min4 메서드를 작성하세요
    static int min3(int a, int b, int c, int d) {
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        if(min > d) min = d;

        return min;
    }


    public static void main(String[] args) {
        int result = max4(10,100,1000,1999);
        System.out.println(" Max 값은 : " + result);

        int min = min3(100, -100, -9999);
        System.out.println("Min 값은 : " + min);

        int min2 = min3(1, -1000, -99, -99999);
        System.out.println("4개 값중 최솟값은 : " + min2);
    }
}
