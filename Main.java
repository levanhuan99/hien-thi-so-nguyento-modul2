package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("nhap so luong so  nguyen to: ");
        int number;
        number=input.nextInt();
        int amount=0;
        int N=2;
        while (amount != number){
            if (check(N)){

                amount++;
                System.out.println(N);
            }
            N++;
        }

    }
    public static boolean check(int number){
        boolean flag=true;
        if (number<2) flag=false;

        for (int i=2; i<=Math.sqrt(number); i++){
            if (number%i ==0 && number>2){
                flag=false;
            }
        }
        return flag;
    }
}
//không biết sai ở đâu?
//bài kiểm tra số nguyên tố
