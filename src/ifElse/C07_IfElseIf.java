package ifElse;

import java.util.Scanner;

public class C07_IfElseIf {

    //kullanicinin girmis oldugu tamsayinin pozitif mi negatif mi yoksa notr(0)
    // oldugunu dogrulayan ve consola yazan bir program yaziniz
    public static void main(String[] args) {

       //if else if te kosullar birbirine bagli hareket eder,bastaki calismazsa sonrakilerde calismaz


      Scanner input=new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz :");
        int sayi=input.nextInt();

        if (sayi > 0) {

            System.out.println("sayi pozitif");

        }else if(sayi<0){

            System.out.println("sayi negatif");
        }else{
            System.out.println("sayi notr");
        }






    }






}
