package part1;

import java.util.Scanner;

public class Decode {

    public static String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(temp, 2);
            answer+=(char)num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();
        System.out.println(solution(num, str));
    }
}
