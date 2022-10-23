import java.util.Scanner;
public class siralama {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int sayi= inp.nextInt();
        int sayi2= inp.nextInt();
        if (((sayi>=-100)&&(sayi<=100))&&((sayi2>=-100)&&(sayi2<=100))) {
            if (sayi > 0 && sayi2 > 0) {
                System.out.println(sayi * sayi2);
            } else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    }
}
