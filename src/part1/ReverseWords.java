package part1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWords {

    public static String[] solution(String[] words) {

        /*
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        */
        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            int lt = 0; // 단어의 맨 왼쪽 끝
            int rt = words[i].length() - 1; // 단어의 맨 오른쪽 끝

            // reverse() 실제 구현
            while(lt < rt) { // 홀수개의 char의 경우 중앙 단어는 바뀌지 않음
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }

            words[i] = String.valueOf(c);
        }

        return words;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numberOfWords = in.nextInt();
        String[] words = new String[numberOfWords];

        for (int i = 0; i < numberOfWords; i++) {
            words[i] = in.next();
        }

        for(String reverseWord : solution(words)) {
            System.out.println(reverseWord);
        }
    }

}