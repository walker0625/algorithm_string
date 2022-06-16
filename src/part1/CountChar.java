package part1;

import java.util.Scanner;

public class CountChar {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        str = str + " "; // str.charAt(i + 1)가 out of index하지 않도록 공백 추가!
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer.append(str.charAt(i));
                if(count >= 2) {
                    answer.append(count);
                }
                count = 1;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}
