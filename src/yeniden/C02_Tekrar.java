package yeniden;



import java.util.Scanner;

public class C02_Tekrar {

    /*
     * Kullanicidan bir character girmesini isteyin ve
     * girilen karakteri ve ascii degerini yazin
     *
     * Ornek : Input  : a
     *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
     *
     *
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char krk=scanner.next().charAt(0);
        int asciiValue = krk;

        System.out.println("Girdiginiz  `"+krk+"` karekterinin ascii degeri: "+ asciiValue);



    }

}
