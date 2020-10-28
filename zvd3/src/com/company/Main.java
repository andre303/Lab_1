package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a,b,c;
        System.out.print("1 аргумент:");
        a = in.nextLine();
        System.out.print("2 аргумент:");
        b = in.nextLine();
        System.out.print("3 аргумент:");
        c = in.nextLine();
        System.out.println("1 аргумент:"+a+"\n2 аргумент:"+b+"\n3 аргумент:"+c);
    }
}
