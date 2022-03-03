package ifElse;

import java.util.Scanner;

 public class C03_IfPratik {


    public static void main(String[] args) {

        //kullanicidan kilo vee boy bilgisini alarak vucut kitle index'ini hesapayin
        //vucut kitle index'ine gore 18.5 < Zayifsin,daha fazla yemelisin
        // 18.5 => && <25 ideal kilodasin
        // 25 >= && <30 kilolusun ,biraz egzersiz yapmalisin
        // 30> obezlik.

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen boyunuzu metre cinsinden giriziniz.");
        float boy= input.nextFloat();

        System.out.println("kilonuzu kilogram cinsinden giriniz");
        float kilo= input.nextFloat();

         float vke=kilo/(boy*boy);
        System.out.println("vucut kitle endexiniz :"+vke);

        if (vke<18.5){

            System.out.println("zayifsin");
        }
        if (vke >=18.5 && vke <25){

            System.out.println("ideal kilon");
        }

        if (vke >=25  && vke<30 ){

            System.out.println("sinirdasin dikkat et");
        }

        if (30<vke ){

            System.out.println("obezsin kilo ver");


        }



    }



}
