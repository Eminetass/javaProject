import javax.swing.*;
import java.util.Scanner;
//DÖNGÜLER KULLANARAK YILDIZLAR İLE ÜÇGEN YAPIYORUZ
public class yıldızlarlaSekiller {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int n= scan.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
