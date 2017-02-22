// Javacore / Tanchenko A.

import java.util.Scanner;
import java.io.*;
import java.lang.Math;

class Dz1_5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
    // 5)  
      String s1;
      int a=0,i=1;
      boolean flag=false;
      
      if (args.length>0) {
         s1=args[0];
      }
      else { 
      System.out.println ("--- Lets magic begin ---");
      System.out.println ("Please input A [as integer]:");
        s1 = sc.nextLine();
      }  

        try {
         a = Integer.parseInt(s1);
         flag=true;
        } 
        catch(IllegalArgumentException e)  { 
         System.out.println("Data A has not integer format"); 
        }  
       if (flag){ 
        int b=a;
        while (i<9) { 
          System.out.println("A^"+ i + " = "+b);
          //System.out.println("A^"+ i + " = " + Math.pow(a,i));
          b =b*a;
          i++;
        }
        System.out.println("Tada!");        
       }

        }
      }

