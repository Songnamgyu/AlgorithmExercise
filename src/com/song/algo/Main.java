package com.song.algo;

import java.util.Scanner;

public class Main {

    // 최대값을 구하는 공식 2
    public static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }
    public static void main(String[] args) {

      int result = max3(6, 8 , 10);
        System.out.println(result);

        // 최대 값 구하는 방식 1 (비 추천)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("3개의 정수값을 입력해주세요");
//        System.out.println("=======================");
//        System.out.println("첫번 째 정수를 입력해주세요");
//        int num1 = sc.nextInt();
//        System.out.println("두번 째 정수를 입력해주세요");
//        int num2 = sc.nextInt();
//        System.out.println("세번 째 정수를 입력해주세요");
//        int num3 = sc.nextInt();
//
//        int max = num1;
//        if(num2 > max ) max = num2;
//        if(num3 > max) max = num3;
//        System.out.print("세 정수중 최대값은 : " + max);
//

    }
}
