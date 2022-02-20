package yeniden;

import java.util.Scanner;

public class C01_Tekrar {


    /*
     * Kullanicidan bir tamsayi girmesini isteyin ve sayiyi kendisinden bir kucuk
     * sayi ve bir buyuk sayi ile carpip sonucu yazdirin
     *
     * Ornek Input  : 10
     *       Output : 990 (9*10*11)
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi= scanner.nextInt();
        int say1=sayi*(sayi+1)*(sayi-1);

        System.out.println(say1);

    }







}
