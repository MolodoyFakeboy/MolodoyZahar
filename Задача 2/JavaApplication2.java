
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 
{
    private  static int x,y;
    public static void main(String[] args)
    {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите первое число: ");
        if (in.hasNextInt()) {
            a = in.nextInt();
            System.out.print("Ведите второе число: ");
            if (in.hasNextInt()) {
                b = in.nextInt();
                x = a;
                y = b;
                while (a != 0 && b != 0) {
                    if (a > b) {
                        a = a % b;
                    } else {
                        b = b % a;
                    }
                }
                System.out.println("Наименьший общий делитель = " + (a + b));
                System.out.println("Наименьшие общие кратное = " + (((x * y) / (a + b))));
            }
        } else {
            System.out.println("Ошибка вы вели не целое число! Попробуйте снова");
        }
    }    
}
