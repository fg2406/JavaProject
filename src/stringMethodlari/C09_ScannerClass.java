package stringMethodlari;

import java.util.Scanner;

public class C09_ScannerClass {

    public static void main(String[] args) {

    //kullanicdan herhangi bir data almak  icin kullanilir


    Scanner input=new Scanner(System.in);

    String isim=input.next();
    System.out.println("isminizi giriniz");
    System.out.println("isminiz"+isim);

    int sayi= input.nextInt();
    System.out.println("bir sayi girin");
    System.out.println(sayi);



    }





}
