// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz1_7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
    // 7)  
      String s1;
      int t_f=0;
      boolean flag=false;
      
      if (args.length>0) {
         s1=args[0];
      }
      else { 
      System.out.println ("--- Lets magic begin ---");
      System.out.println ("Please input T [Farengeit]:");
        s1 = sc.nextLine();
      }  

        try {
         t_f = Integer.parseInt(s1);
         flag=true;
        } 
        catch(IllegalArgumentException e)  { 
         System.out.println("Data has wrong format"); 
        }
        if (flag){
          float t_c=(float)(t_f-32)*5/9;
          System.out.println("T_[Farengeit] = "+ t_f + " -> T_[Celsius] = " + t_c);
          System.out.println("Tada!");
        }
      }
}

