import java.util.Scanner;
public class asal_sayi {
    public static void main(String[]args){
        int number ;
        boolean asal=true;
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        number= scan.nextInt();
        for (int i=2;i<number;i++){
            if (number % i==0){
                asal=false;
            }
        }
        if (asal){
            System.out.println("Sayı Asal Sayıdır .");
        }else{
            System.out.println("Sayı Asal Bir Sayı Değildir .");
        }
    }
}
