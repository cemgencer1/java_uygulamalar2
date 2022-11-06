import java.util.*;
import sss.MathChallenge;

import java.io.*;

class cccc {

    public static long MathChallenge(long num) {
        if(num%2==0){
            System.out.println("doğru");
        }else{
            System.out.println("yanlış");
        }
        return num;
    }

    public static void main (String[] args) {
        //MathChallenge mat=new MathChallenge(24);
        // keep this function call here
        Scanner s = new Scanner(System.in);
        long a=MathChallenge(Long.parseLong(s.nextLine()));
    }

}
