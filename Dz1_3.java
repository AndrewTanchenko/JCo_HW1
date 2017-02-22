// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;

class Dz1_3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
    // 3)  
      String s1,s2,s3;
      int a=0,b=0,c=0;
      boolean flag=false;
      
      if (args.length>2) {
         s1=args[0];
         s2=args[1];
         s3=args[2];
      }
      else {
      System.out.println ("--- Lets magic begin ---");
      System.out.println ("Please input A, B and C [as integer]");
      System.out.println ("Please share A:");
        s1 = sc.nextLine();
      System.out.println ("Please share B:");
        s2 = sc.nextLine();
      System.out.println ("Please share C:");
        s3 = sc.nextLine();
      }  
        
        try {
         a = Integer.parseInt(s1);
         b = Integer.parseInt(s2);
         c = Integer.parseInt(s3);
         flag=true;
        } 
        catch(IllegalArgumentException e)  { 
         System.out.println("Some data has not integer format"); 
        }  
   
        if (flag) {   
      System.out.println("Old values: A = "+ a + " B = " + b + " C = " + c);
      System.out.println("Magic have started:"); 
      // A->C, C->B, B->A
      int d=a;
      a=b;
      b=c;
      c=d;
      System.out.println("New values: A->C, C->B, B->A");
      System.out.println("New values: A = "+ a + " B = " + b + " C = " + c);
      System.out.println("Tada!");
        }
      }
    }