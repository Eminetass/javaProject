import java.util.Scanner;
//BASAMAK SAYISINI KULLANICIDAN ALAN * EKRANA TERS ÜÇGEN ÇİZEN PROGRAM
public class TersUcgenYap {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int n= scan.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=(2+i)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
