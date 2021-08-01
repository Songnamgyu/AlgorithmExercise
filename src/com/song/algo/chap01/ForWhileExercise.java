package com.song.algo.chap01;

import java.util.Scanner;

public class ForWhileExercise {

    public static void question1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 더할 n의 값을 설정해주세요");
        int n = sc.nextInt();
        System.out.println("n의 값은 : " + n);
        int sum = 0;
        for( int i = 1; i <= n ; i++){
            sum += i;
            if(i  < n) {
                System.out.print(i + "+");
            }
            else {
                System.out.print(i);
            }
            }
        System.out.println("=" + sum);
    }
    public static void questionGaus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 더할 n의 값을 설정해주세요");
        int n = sc.nextInt();
        System.out.println("n의 값은 : " + n);
        int sum = 0;
        int i = 1;
        sum = (i + n) *(n/2) + (n % 2 == 1 ? (n + 1 / 2) : 0);
        System.out.println("Gaous Sum : " + sum);
    }

    public static int sumOf(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번쨰 정수를 입력해주세요");
        a = sc.nextInt();
        System.out.println("두번째 정수를 입력해주세요 ");
        b = sc.nextInt();
        int sum =0;
        if( a >= b) {
            for(int i = b; b <= a ; b++){
                sum += b;
            }
            System.out.println(" 총 합은 : " + sum);
        }
        else if( b >= a){
            for(int i = a; a <= b; a++){
                sum += a;
            }
            System.out.println(" 총 합은 : " + sum);
        }
        return sum;
    }


    // 답안
    static int sumof(int a, int b) {
        int min; // a, b의 작은 쪽의 값
        int max; // a, b의 큰 쪽의 값

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        int sum = 0; // 합
        for (int i = min; i <= max; i++)
            sum += i;
        return (sum);
    }
    public static void main(String[] args) {
//        question1();
//        questionGaus();
          sumOf(4,5);
    }
}
