package part1;

import java.util.Scanner;

public class StringDistance {

    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000; // 맨 처음 수를 큰 수로 세팅하여 오른쪽에서 올 때 덮어쓰도록 함
        
        // --->
        for (int i = 0; i < s.length(); i++) {
            if(t == s.charAt(i)) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }
        
        // <---
        for (int i = s.length() - 1; i >= 0; i--) {
            if(t == s.charAt(i)) {
                p = 0;
            } else {
                p++;
            }

            //answer[i] = Math.min(p, answer[i]);
            if(p < answer[i]) {
                answer[i] = p;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char cha = in.next().charAt(0);
        for (int x : solution(str, cha)) {
            System.out.print(x+" ");
        }
    }

}
