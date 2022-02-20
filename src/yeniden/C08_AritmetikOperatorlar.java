package yeniden;

public class C08_AritmetikOperatorlar {

    public static void main(String[] args) {

       int sayi1=20;
       int sayi2=40;

        System.out.println(sayi1++);  //20 java once sayi1'i gorur yazdirir,sonra arttirir
        System.out.println(sayi2--);  //40

        System.out.println(sayi1);   //21 tekrar yazdirirsak burda arttirmis olur
        System.out.println(sayi2);  //39

        System.out.println(++sayi1);  //22  once arttirdi sonra yazdirdi
        System.out.println(--sayi2);   //38  once azaltti sonra yazdirdi

        /*Arttirma & Azaltma Operatorlarinde
        sayi1++
        sayi1--
        ++sayi1
        --sayi2
        farkli islem yapar.java yukardan asagi soldan saga calisir

         */

    }


}
