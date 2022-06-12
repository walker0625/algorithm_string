package part1;

import java.util.Scanner;

public class RemoveDuplicate {

    public static String solution(String word) {
        String answer = "";

        for (int i = 0; i < word.length(); i++) {
            // 해당 문자의 첫 등장 위치(indexOf())와 실제 위치(charAt())가 동일할 경우(중복이 아닌 경우)
            if(word.indexOf(word.charAt(i)) == i) {
                answer += word.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(solution(word));
    }

}