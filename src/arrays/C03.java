package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {

    // kullanicinin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alinan
    // ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
    // java programi yazin
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("arrayinizin boyutunu girin :");
        int arrBoyut=scan.nextInt();
        int arr[]=new int[arrBoyut];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arrayin "+(i+1)+".elemanini giriniz");
            arr[i]=scan.nextInt();


        }

        Arrays.sort(arr);
        System.out.println("arasindaki fark:max-min :"+(arr[arr.length-1]-arr[0]));




    }








}
