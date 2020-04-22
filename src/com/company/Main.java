package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("write x number: ");
            int x = in.nextInt();


            System.out.print("write y number: ");
            int y = in.nextInt();


            System.out.print("write z number: ");
            int z = in.nextInt();

            int ari = (x + y + z) / 3 ;
        System.out.println(ari);
            int fme = ari / 2;
            if (fme > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}

