package com.song.algo.chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구하는 프로그램을 실행합니다.");
        System.out.println("프로그램을 실행하기위해 n값을 입력해주세여");
        int num = sc.nextInt();
        System.out.print("입력하신 n의 값은 : " + num + "입니다.");

        int sum = 0;
        int initNum = 1;
        while( initNum <= num) {
            sum += initNum;
            initNum++;
            System.out.println("initNum 값이 1씩증가하는 지 확인 : " + initNum);
        }
        System.out.println("1부터 " + num + "까지의 합은 : " + sum + "입니다");
        System.out.println("initNum : " + initNum);
    }

}
