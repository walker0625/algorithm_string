package part1;

import java.util.Scanner;

public class FindLongestWord {

    public static String solution(String str) {
        int longestWordLengthCnt = 0;
        String longestWord = "";

        String[] words = str.split(" ");

        for(String word : words) {
            if (word.length() > longestWordLengthCnt) { // 더 큰 값이 기준이므로 같은 길이일 경우, 먼저 나온 단어가 답 
                longestWordLengthCnt = word.length();
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(); // 그냥 next()는 단어 하나만 받을 때(띄어쓰기 인식이 안됨)

        System.out.println(solution(str));
    }

}