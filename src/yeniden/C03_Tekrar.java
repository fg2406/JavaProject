package yeniden;

import java.util.Scanner;

public class C03_Tekrar {

    /*
     * SORU 3
     *
     * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
     * ve vucut kutle endeksini bulun.
     * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
     *
     * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
     *
     * Ornek : Input : boy :180 kilo : 80
     *         Output : Vucut kutle endeksiniz : 24
     *                  Vucut kutle endeksiniz : 24.691…
     *
     *
     */

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        System.out.println("kac kilosunuz giriniz");

        double boy=scan.nextDouble();
        double kilo=scan.nextDouble();

        double vke=kilo/(boy*boy);


        // boyu cm olarak aldik ama metreye cevirmemiz gerekiyor

        boy/=100;  // boy=boy/100  boy++ , boy+=5


        System.out.println("Vucut kutle endeksiniz : " + vke);


    }




}
