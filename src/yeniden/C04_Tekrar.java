package yeniden;

import java.util.Scanner;

public class C04_Tekrar {

    /*
     * SORU 4
     *
     * Kullanicidan 3 tamsayi alin ve
     * bu sayilarin ortalamasini bulun
     *
     * Ornek : Inputs : 15,25,50
     *         Output : Girdiginiz 15,25 ve 50’nin ortalama degeri : 30
     *
     *
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;




        System.out.println("Ortalama hesaplamak icin lütfen 3 adet tamsayi giriniz");

        double int1 = scan.nextDouble();
        double int2 = scan.nextDouble();
        double int3 = scan.nextDouble();

        double ort = (int1 + int2 +int3) / 3;
        //Output : Girdiginiz 15,25 ve 50’nin ortalama degeri : 30




        System.out.println("Girdiginiz "+int1+","+int2+" ve "+int3+"'nin ortalama degeri : "+ ort);




    }

}
