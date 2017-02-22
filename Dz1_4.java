// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz1_4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
    // 4)  
      String s1,s2;
      int a=0,b=0;
      boolean flag=false;
      
      if (args.length>1) {
         s1=args[0];
         s2=args[1];
      }
      else { 
      System.out.println ("--- Lets magic begin ---");
      System.out.println ("Please input A and B [as integer]");
      System.out.println ("Please share A:");
        s1 = sc.nextLine();
      System.out.println ("Please share B:");
        s2 = sc.nextLine();
      }
        
        try {
         a = Integer.parseInt(s1);
         b = Integer.parseInt(s2);
         flag=true;
        } 
        catch(IllegalArgumentException e)  { 
         System.out.println("Data has wrong format"); 
        }  
       
        if (flag) {   
      System.out.println("Now A = "+ a + " B = "+b);
      System.out.println("Magic have started:");
      a=a+b;
      b=a-b;
      a=a-b;  
      System.out.println("New A = "+ a + " B = "+b);
      System.out.println("Tada!");
        }
      }
    }