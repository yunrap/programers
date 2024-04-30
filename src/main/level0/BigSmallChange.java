import java.util.Scanner;

public class BigSmallChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            }
            if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}

// :: 대소문자 바꿔서 출력하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181949
// 참고 Character 클래스로 대소문자를 구별할수있다.