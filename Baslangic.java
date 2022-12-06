package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        /*  Soru-10 Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle
        göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Kilo (kg) / Boy(m) * Boy(m)
        */
        double height,weight,bmi;
        Scanner i = new Scanner(System.in);

        System.out.print("Boyunuz : ");
        height = i.nextDouble();
        System.out.print("Kilonuz : ");
        weight = i.nextDouble();

        bmi = weight/(height*height);
        System.out.print("Vucut kitle indeksiniz : " + bmi);

    }
}
