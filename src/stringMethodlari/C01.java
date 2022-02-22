package stringMethodlari;

public class C01 {

   //String non-primitive data turudur,buyuk harfle baslar bu bir classtir
    //datalar cift tirnak halinde olmak zorunda,
    //int float .. gibi ilkel data turu degildir
    //String string=new String(); bu sekilde kullanimida var cunku String class old.icin nesne uretilebilir
     //primitive(ilkel) veri tipleri :int,float,short,long...

    public static void main(String[] args) {
        String isim="flz";
        int sayi1=2;
        int sayi2=3;

        System.out.println(isim+sayi2+sayi1);   //flz32
        System.out.println(sayi1+isim+sayi2);
        System.out.println(sayi1+sayi2+isim);  //5flz



    }


}
