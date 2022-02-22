package stringMethodlari;

public class C04_IndexOf {

   //indexOf methodu ile hangi karakter nerede kacinci index te int olarak yani tam sayi olarak veririr
    //index 0 'dan baslar
    public static void main(String[] args) {

        String isim="keremcan";
        System.out.println(isim.length());  //9

        //System.out.println(isim.indexOf()); bu sekilde direkte yazdirabiliz
        int sira=isim.indexOf("c");
        System.out.println("c harfinin bulundugu index :"+sira);   //5

        System.out.println(isim.indexOf("e"));  //1 verir,ilk buldugu e nin sirasini verir
        System.out.println(isim.indexOf("can")); //istersek string ifade de aranabilir,5.index ten itibaren basladigi icin 5 verdi

        String bilgi="java ogrenmek cok zevklidir";
        int sirasi=bilgi.indexOf("ogrenmek");
        System.out.println(sirasi);   //5 verdi boslukta bir karakter olarak degerlendirdi




    }


}
