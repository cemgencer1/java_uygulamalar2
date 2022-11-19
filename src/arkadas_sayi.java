import java.util.Scanner;

public class arkadas_sayi {
    public static void main(String[]args){
        int number ;
        int number2;
        int total=0;
        int total2=0;
        Scanner scan =new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz :");
        number= scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        number2=scan.nextInt();
        for (int i = 1; i < number ; i ++) {
            if (number % i == 0 ) {
                total += i;
            }
        }
        for (int n = 1 ; n < number2 ; n ++){
            if (number2 % n == 0 ){
                total2 += n;
            }
        }
        if ((total == number2) && (total2 == number)){
            System.out.println("Sayılar Arkadaş Sayıdır .");
        }else {
            System.out.println("Sayılar Arkadaş Sayı Değildir .");
        }
    }
}
