package com.example.vkihesaplama;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double boy, kilo, vki;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz (Ör: 1,75): ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz (Ör: 72,5): ");
        kilo = input.nextDouble();

        vki = kilo / Math.pow(boy, 2);
        System.out.println("Vücut kitle indeksiniz: " + vki);

        System.out.print(vki<16 ? "WHO tarafından aşırı zayıf olarak sınıflandırılıyorsunuz" : "");
        System.out.print(vki>=16 && vki<17 ? "WHO tarafından orta derecede zayıf olarak sınıflandırılıyorsunuz" : "");
        System.out.print(vki>=17 && vki<18.5 ? "WHO tarafından hafif zayıf olarak sınıflandırılıyorsunuz" : "");
        System.out.print(vki>=18.5 && vki<25 ? "WHO tarafından normal kilolu olarak sınıflandırılıyorsunuz" : "");
        System.out.print(vki>=25 && vki<30 ? "WHO tarafından kilolu (obez öncesi) olarak sınıflandırılıyorsunuz" : "");
        System.out.print(vki>=30 && vki<35 ? "WHO tarafından 1. sınıf obez olarak sınıflandırılıyorsunuz" : "");
        System.out.print(vki>=35 && vki<40 ? "WHO tarafından 2. sınıf obez olarak sınıflandırılıyorsunuz" : "");
        System.out.print(vki>=40 ? "WHO tarafından 3. sınıf obez olarak sınıflandırılıyorsunuz" : "");
    }
}
