package part1;

import java.util.Scanner;

public class ReverseEnglishWords {

    public static String solution(String word) {

            char[] c = word.toCharArray();
            int lt = 0; // 단어의 맨 왼쪽 끝
            int rt = word.length() - 1; // 단어의 맨 오른쪽 끝

            while(lt < rt) {
                if(!Character.isAlphabetic(c[lt])) { // 특수 문자면 커서 이동
                    lt++;
                } else if(!Character.isAlphabetic(c[rt])) {
                    rt--;
                } else {
                    char temp = c[lt];
                    c[lt] = c[rt];
                    c[rt] = temp;
                    lt++;
                    rt--;
                }
            }

            word = String.valueOf(c);

        return word;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(solution(word));
    }

}