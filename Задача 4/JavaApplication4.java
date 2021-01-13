
package javaapplication4;

public class JavaApplication4 {


            
    public static int searchWord(String sentence,String word ) {
        int amount = 0;
        int i = sentence.indexOf(word);
        while (i >= 0) {
            amount++;
            i = sentence.indexOf(word, i + 1);
        }
        return amount;    
    }
    public static void main(String[] args){
        String sentence = "очень сложно найти слово" ;
        String word = "сложно";
        System.out.println(searchWord(sentence, word) );
    }

}
