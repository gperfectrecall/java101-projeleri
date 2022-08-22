package com.example.manavkasa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double armut = 2.14, arm,
                elma = 3.67, elm,
                domates = 1.11, dom,
                muz = 0.95, mu,
                patlican = 5, pat,
                toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo? :");
        arm = input.nextDouble();

        System.out.println("Elma kaç kilo? :");
        elm = input.nextDouble();

        System.out.println("Domates kaç kilo? :");
        dom = input.nextDouble();

        System.out.println("Muz kaç kilo? :");
        mu = input.nextDouble();

        System.out.println("Patlıcan kaç kilo? :");
        pat = input.nextDouble();

        toplam = armut*arm + elma*elm + domates*dom + muz*mu + patlican*pat;
        System.out.println("Toplam tutar: " + toplam + " TL");

    }
}
