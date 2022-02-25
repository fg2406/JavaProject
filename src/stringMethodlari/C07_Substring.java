package stringMethodlari;

public class C07_Substring {
   //index belirleyip istedgimiz araliktaki Stringi alabiliriz
    //ilk index dahil,digeri dahil degil,sayar orada ki harfi getirir
    //index saymaya sifirdan baslar
    //virgullerde birer karakter sayar
    //sadece baslangic index yazilabilir,4.index ten sonrasini verir mesela

    public static void main(String[] args) {

     String isimler="ali,fatma,murat,zehra,leon,emma,tavuk,cim";

     String isim=isimler.substring(0,7); //ilk index dahil sonuncu dahil degil,sayar orada ki harfi getirir

        System.out.println(isim);  //ali,fat
    String isim2=isimler.substring(4);
        System.out.println(isim2);//4.index ten sonrasini veririr




    }


}
