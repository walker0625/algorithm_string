package part1;

import java.util.Scanner;

public class PureNumber {

        public static int solution(String word) {

        /*
        for(char x : word.toCharArray()) {
            if(x >= 48 && x <= 57) { // 0 = 48, 9 = 57
                answer = answer*10 + (x-48); // 누적(자연수이므로 맨앞 0 안됨)
            }
        }
        */
        String answer = "";

        for(char x : word.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(solution(word));
    }
}
