/*Write a Program to convert all vowels to UpperCase in a sentence*/
import java.util.Scanner;

public class VowelToCapital {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a sentence: ");    
    String sentence = sc.nextLine();
    StringBuilder str = new StringBuilder();

    for(int i = 0; i < sentence.length(); i++){
       char ch = sentence.charAt(i);
       if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && Character.isLowerCase(ch)){
          str.append(Character.toUpperCase(ch));
       }
       else{
          str.append(ch);
       }
    }
    sentence = str.toString();
    System.out.println(sentence);
  }
}
