
package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {
        int Palindrome = 0;
        int[] Array = { 1,0,0,0,0,0,0,0,0,1 };
        for (int i=0; i < Array.length; i++ ){
            if (Array[i] == Array [Array.length-1-i]){
             Palindrome++;
            }   
        }
        System.out.println("Количество палиндромов равно:" + (Palindrome));
        
    }
    
}
