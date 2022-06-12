package part1;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeUpperLower {

    public static String solution(String str) {

        char[] strArray = str.toCharArray();

        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                strArray[i] = Character.toLowerCase(str.charAt(i));
            } else {
                strArray[i] = Character.toUpperCase(str.charAt(i));
            }
        }

        return String.valueOf(strArray);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }

}