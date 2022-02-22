package stringMethodlari;

public class C03_concatIleString {

   //Stringleri birlestirmek yeni string elde etmek istersek concat kullanabiliriz
    //ama genelde birlestirmede + ile yapilir

    public static void main(String[] args) {

      String isim="kerem";
      String soyisim="kara";
   //1.yontem(+) ile birlestirme
      String adSoyad=isim+soyisim;  //+ isareti ile istedigimiz kadar String'i birlestirebiliriz
      System.out.println(adSoyad); //birlestirdi,keremkara
        System.out.println(adSoyad.length()); //9

         String bosluk=" ";   //arasina bosluk koymak istersek bu sekilde yapilabilir
        String adSoyad1=isim+bosluk+soyisim;  //kerem kara
        System.out.println(adSoyad1);
        System.out.println(adSoyad.length());  //9


     //2.yontem concat methodu ile

        String isim1="Kerem";
        String soyisim1="kara";

        String adSoyad2=isim1.concat(soyisim1);
        System.out.println(adSoyad2);  //KeremKara

        //bosluklu olsun istersek
        String bosluk1=" ";
        String adSoyad3=isim1.concat(bosluk1).concat(soyisim1); //Kerem kara





    }

}
