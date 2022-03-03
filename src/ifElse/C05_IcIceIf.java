package ifElse;

public class C05_IcIceIf {


    public static void main(String[] args) {

         int sayi=65;    //burasi 40 olsaydi hic calismazdi cunku ilk sart saglanmadigi icin dururdu

         if (sayi>=50){     //sadece bu sart saglandigi icin bu calisti digerleri calismadi
             System.out.println("50'ye esit yada buyuk");
            if (sayi%10==0){
                System.out.println("Sayi 10'a tam bolunuyor");

               if (sayi==80){

                   System.out.println("sayi 80");
               }

            }
         }







    }



}
