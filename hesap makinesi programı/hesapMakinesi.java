import java.util.Scanner;
public class hesapMakinesi {

    public static void main(String[] args) {

        double n1, n2;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        n1 = input.nextDouble();

        System.out.println("Diğer sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("Toplama için: 1\nÇıkarma için: 2\nÇarpma için: 3\nBölme için: 4 sayısını giriniz: ");
        select = input.nextInt();
                if (select > 4 || select < 1){
                    System.out.println("Yanlış seçim yaptınız. Lütfen yapmak istediğiniz işlemin numarasını giriniz.");
                }else{
        switch (select){
            case 1:
                System.out.println("Sonuç: " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç: " +(n1-n2));
                break;
            case 3:
                System.out.println("Sonuç: " + (n1*n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Sonuç: " + (n1 / n2));
                }else{
                    System.out.println("Bir sayı 0'a bölünemez.");
                    }
                break;
        }}
    }
}
