import java.util.Scanner;

public class ArrayPrintln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}

// :: 문자열 반복해서 출력하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181950
