package yeniden;

public class C13_Ubung {

   /* 25 ve 30 sayilarinin birbirine esit olma,buyuk ya da kucuk olma gibi durumlarini"iliskisel operator"
   yardimiyla consol'a yazdiriniz
   orn; 25==30 =>false
        25 >30 => false
        25 <30 =>true

    */

    public static void main(String[] args) {

      int sayi1=25;
      int sayi2=30;


        boolean esitMi=sayi1==sayi2;
        System.out.println(sayi1 +" = "+sayi2+" : "+esitMi);

        boolean buyukMu=sayi1 > sayi2;
        System.out.println(sayi1 +" > "+sayi2+" : "+buyukMu);

        boolean kucukMu=sayi1 < sayi2;
        System.out.println(sayi1 +" < "+sayi2+" : "+kucukMu);



    }




}
