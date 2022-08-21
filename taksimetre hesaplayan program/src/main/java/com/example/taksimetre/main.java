package com.example.taksimetre;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // taksimetre km başına 2.20 TL tutmaktadır.
        // minimum ödenecek tutar: 20 TL
        // taksimetre açılış ücreti: 10 TL
        int km;
        double perKm = 2.20, toplam, acilis = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("KM değerini giriniz: ");
        km = input.nextInt();

        toplam = acilis + km*perKm;

        toplam = (toplam < 20) ? 20 : toplam;

        System.out.println("Toplam ücret: " + toplam + " TL");


    }
}
