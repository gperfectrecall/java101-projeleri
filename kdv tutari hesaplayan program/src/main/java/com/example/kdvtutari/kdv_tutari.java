package com.example.kdvtutari;
import java.util.Scanner;

public class kdv_tutari {
    public static void main(String[] args) {
        double ilkfiyat, kdvorani;
        Scanner input = new Scanner(System.in);
        System.out.println("Vergisiz fiyatı giriniz: ");
        ilkfiyat = input.nextDouble();

        System.out.println("KDV oranını örnekteki gibi giriniz (Ör: %18 KDV için 18 giriniz): ");
        kdvorani = input.nextDouble();

        System.out.println("KDV'siz Fiyat: " + ilkfiyat + " TL");
        System.out.println("KDV Oranı: % "  + kdvorani);

        double kdvtutari = ilkfiyat * kdvorani/100;
        System.out.println("KDV Tutarı: " + kdvtutari +" TL");

        double kdvlifiyat = ilkfiyat + kdvtutari;
        System.out.println("KDV'li Ürün Fiyatı: " + kdvlifiyat + " TL");

    }
}
