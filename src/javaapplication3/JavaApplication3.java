
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static int countWords(String str) {
        String words[] = str.split(" ");
        int count = words.length;
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите предложение: ");
        String sentence = in.nextLine();
        char[] chars = sentence.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        sentence = new String(chars);
        System.out.println(sentence);
        System.out.println("Количество слов в предложении " + countWords(sentence));


    }

}
