package part1;

import java.util.Locale;
import java.util.Scanner;

public class PurePalindrome {

    public static String solution(String word) {

        /*
        StringBuilder pureWord = new StringBuilder();

        for (char c: word.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                pureWord.append(c);
            }
        }
        String words = pureWord.toString();
        */

        boolean palindromeFlag = true;
        word = word.toUpperCase().replaceAll("[^A-Z]", ""); // ^ : 부정 > A~Z가 아니면 ""(공백으로 바꿔라)

        String reverseWord = new StringBuilder(word).reverse().toString();

        if(!word.equals(reverseWord)) {
            palindromeFlag = false;
        }

        if(palindromeFlag) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(solution(word));
    }
}
