package part1;

import java.util.Scanner;

public class FindCharacter {

    public static int solution(String str, char countChar) {
        int count = 0;

        String upperedStr = str.toUpperCase();
        char upperedCountChar = Character.toUpperCase(countChar);

       /*
       for(int i = 0; i < upperedStr.length(); i++) {
            if(upperedCountChar == upperedStr.charAt(i)) {
                count++;
            }
        }
        */

        for(char c : upperedStr.toCharArray()) {
            if(upperedCountChar == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char countChar = in.next().charAt(0);

        System.out.println(solution(str, countChar));
    }

}