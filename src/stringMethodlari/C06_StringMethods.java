package stringMethodlari;

public class C06_StringMethods {

    public static void main(String[] args) {

    /*contains():aranan ifadenin icerip icermedigi,true false doner
    trim(): bosluk karakterlerini temizler ,karakterler arasindaki boslugu temizler
    charAt():indexteki karakterleri almamiza yarar
    compareTo():iki string'i karsilastirir,esitmi,harf sirasina gore,alfabeye gore hangisi once karsilastirir
    replace(): string icerisinde degisiklik yapar
     */

     String isimler="Ayse,fatma,filiz,burhan.azra,balik,tavuk ";
        System.out.println(isimler.contains("Ayse")); //true doner
        System.out.println(isimler.trim());
        System.out.println(isimler.charAt(19));
        System.out.println(isimler.replace("Ayse","balik")); //ayse yerine balik yazar

        String bilgi="ben java'yi sevmeye calisiyorum";
        System.out.println(bilgi.replace("ben","o"));  //ben yerine o yazar
        System.out.println(bilgi.replace(" ","'"));

        String isim1="asli";
        String isim2="zehra";
        System.out.println(isim1.compareTo(isim2)); //hangisi alfabeye gore once,pozitif bir sayi verirse
        //parantez icindeki alfabede daha once geliyor demek,negatif ise isim1 once gelioyr demek
        //0 verirse bunlar esit demektir



    }


}
