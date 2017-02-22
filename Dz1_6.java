// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz1_6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
    // 6)  
      String s1;
      int t_c=0;
      boolean flag=false;
      
      if (args.length>0) {
         s1=args[0];
      }
      else {  
      System.out.println ("--- Lets magic begin ---");
      System.out.println ("Please input T [Celsius]:");
        s1 = sc.nextLine();
      }  

        try {
         t_c = Integer.parseInt(s1);
         flag=true;
        } 
        catch(IllegalArgumentException e)  { 
         System.out.println("Data has wrong format"); 
        }
        if (flag){
          float t_f=(float)(t_c*9/5+32);
          System.out.println("T_[Celsius] = " + t_c + " -> T_[Farengeit] = " + t_f); //BigDecimal
          System.out.println("Tada!");
        }
      }
}

