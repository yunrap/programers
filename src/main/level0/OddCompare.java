import java.util.Scanner;

public class OddCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String checkEvenOdd = checkOddEven(n);
        System.out.println(n + " is " + checkEvenOdd);
    }


    private static String checkOddEven(int n) {
        if (n % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}

// https://school.programmers.co.kr/learn/courses/30/lessons/181944

// n이 짝수일때 is even 홀수면 is odd 호출
