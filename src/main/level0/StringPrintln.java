import java.util.Scanner;

public class StringPrintln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
    }
}

// 문제URL : https://school.programmers.co.kr/learn/courses/30/lessons/181952
// 문자열 str이 주어질때 str을 출력하는 코드를 작성해라


// static void main 정리
// 자바가 변수나 함수를 메모리에할당하는 방법
// 1. static 영역에 선언 2. heap 영역에 선언(new연산자)
// entry 포인트인 main메소드가 heap 영역에 선언되면?
// -> heap 영역은 garbage collector에 의해 메모리에 정리되서 기본인함수가 정리되니 프로그램은 죽는다.
// 따라서 main 메소드는 static으로 선언하며 메모리에 항상 상주하도록 설정
// 종합 : main메소드는 자바 어플리케이션 실행시 제일먼저동작, 어느객체든 접근가능, 자바가 컴파일되는순간 정의되어 돌려주는 값이없는 함수