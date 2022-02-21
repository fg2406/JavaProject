package yeniden;

public class C14_Pratik {

    public static void main(String[] args) {

        /*3 basamakli bir tamsaynin basamaklarini
        consola'a yazdiran bir program olusturun
        345
        birler:5
        onlar:4
        yuzler:3

         */

    int sayi=345;
    int birler=sayi%10; //5
    sayi/=10;           // 34
    int onlar =sayi%10;  //4
    sayi/=10;            //3
    int yuzler=sayi%10;   //3

        System.out.println("birler : "+birler);
        System.out.println("onlar : "+onlar);
        System.out.println("yuzler : "+yuzler);

        System.out.println("toplam :"+(birler+onlar+yuzler));




    }




}
