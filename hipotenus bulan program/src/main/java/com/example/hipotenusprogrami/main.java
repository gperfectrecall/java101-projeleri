package com.example.hipotenusprogrami;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik açıyı oluşturan kenarlardan birini giriniz: ");
        a = input.nextDouble();

        System.out.println("Dik açıyı oluşturan diğer kenarı giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("Hipotenüs uzunluğu: " + c);
    }
}
