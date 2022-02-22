package stringMethodlari;

import java.util.Locale;

public class C05_equals {

    //equals    =esit mi,buyuk kucuk harfe duyarli
    //equalsIgnorreCase=buyuk kucuk harfe dikkat etmez karsilastirir
    // toLowerCase =kucuk yapar hepsini
    // toUpperCase =buyuk yapar

    public static void main(String[] args) {

       String str="Java canlar";
       String str1="Java guzel";

       boolean esitMi=str.equals(str1);  //false

        String isim="flz";
        String isim1="Flz";

        System.out.println(isim.equals(isim1));             //false
        System.out.println(isim.equalsIgnoreCase(isim1));  //true
        System.out.println(isim1.toLowerCase());   //flz yapti
        System.out.println(isim.toUpperCase());    //FLZ

        String bilgi="java Programlama DILI öGÜS"; //yazilimda ingilizce karakter olmasina dikkat edilmeli
        //java turkce karakter algilamaz
        System.out.println(bilgi);





    }


}
