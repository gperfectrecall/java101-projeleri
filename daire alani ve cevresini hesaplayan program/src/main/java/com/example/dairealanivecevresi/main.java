package com.example.dairealanivecevresi;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double r, pi = 22/7.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        double alan = pi*r*r;
        double cevre = 2*pi*r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);


    }
}
