package _5_Jadi_Galaxy_;

import java.util.Scanner;

public class Reader {
    private Scanner scanner ;

    public Reader (){
       this.scanner = new Scanner(System.in);
    }

   public  String  read (){
      return this.scanner.nextLine();
   }



}
