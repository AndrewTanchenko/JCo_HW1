// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz1_1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
    // 1)  
      String s1,s2;
      int a=0,b=0;
      boolean flag_a=false, flag_b=false;
      
      if (args.length>1) {
         s1=args[0];
         s2=args[1];
      }
      else {
      System.out.println ("--- Lets magic begin ---");
      System.out.println ("Please input A and B [as integer]");
      System.out.println ("Please share A:");
/*     if (sc.hasNextInt()) 
       {a = sc.nextInt();
       }
*/
        s1 = sc.nextLine();
      System.out.println ("Please share B:");
        s2 = sc.nextLine();
      }  
        
        try {
         a = Integer.parseInt(s1);
         flag_a=true;
        } 
        catch(IllegalArgumentException e)  { 
         System.out.println("Data A has not integer format"); 
        }  
         try {
         b = Integer.parseInt(s2);
         flag_b=true;
         }
        catch(IllegalArgumentException e)  { 
         System.out.println("Data B has not integer format"); 
        }  
      
        if (flag_a & flag_b) {   
      System.out.println("Now A = "+ a + " B = "+b);
      System.out.println("Magic have started:");
      int c=a;
      a=b;
      b=c;  
      System.out.println("New A = "+ a + " B = "+b);
      System.out.println("Tada!");
        }
      }
    }