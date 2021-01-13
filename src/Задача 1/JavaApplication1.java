package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 
{

   public static int readInt(Scanner scanner) {
        while ( true ) {
            System.out.print("Ведите целое число: ");
            if ( scanner.hasNextInt() )
             break;
            System.out.println("Ошибка вы вели не целое число!");
            scanner.skip(".*\\n");
        }
        return scanner.nextInt();
    }
    
    public static void main(String[] args) 
            
    {
        int b;
        boolean isPrime=true;
        Scanner in = new Scanner(System.in);
        int a = readInt(in);
        if(a % 2 == 0)
        {
               System.out.println("Число четное");
        }
           else System.out.println("Число не четное!");
           for (int i=2; i<=a/2; i++) 
           {
           b = a % i;
           if (b == 0) 
           {
          isPrime = false;
          break;}
          }
           if(isPrime) 
           {
           System.out.println(a + " - простое число");
           } else {
           System.out.println(a + " - составное число");
        }    
    }   
}
