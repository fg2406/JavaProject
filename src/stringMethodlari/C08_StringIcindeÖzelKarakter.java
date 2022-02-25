package stringMethodlari;

public class C08_StringIcindeÖzelKarakter {


    public static void main(String[] args) {
        //cocuk,"Benim adim Kerem."dedi.

    // String bilgi="cocuk,"Benim adim Kerem."dedi."; bu sekilde kirmizi oldu
        //java bunlari ayri karakterler algiladi
        //java iki tirnak arasini String olarak degerlendirdi
        //kalani ayri kod satirin olarak degerlendirdi,biz ic ice cift tirnak kullanmak isterse \ kullaniriz
        //bu sayede hepsini bir String algilar


      String bilgi="cocuk,\"Benim adim Kerem.\"dedi."; //boyle durumda araya \ koyariz
        System.out.println(bilgi);   //cocuk,"Benim adim Kerem."dedi.


       //  String isimler="Ahmet Krem Cansu";
       // System.out.println(isimler);  //Ahmet Krem Cansu olur

        String isimler="Ahmet \n Krem \n Cansu";  //satir atlama \n
        System.out.println(isimler);   //alt alta yazdirir



    }


}
