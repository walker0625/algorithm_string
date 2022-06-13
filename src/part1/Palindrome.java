package part1;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {

    public static String solution(String word) {

        /*char[] cs = word.toUpperCase().toCharArray();
        int lt = 0;
        int rt = cs.length - 1;

        while(rt > lt) {
            if(cs[lt] != cs[rt]) {
                palindromeFlag = false;
            }
            lt += 1;
            rt -= 1;
        }*/
        boolean palindromeFlag = true;
        String reverseWord = new StringBuilder(word).reverse().toString();

        if(!word.equalsIgnoreCase(reverseWord)) {
            palindromeFlag = false;
        }

        if(palindromeFlag) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(solution(word));
    }
}
