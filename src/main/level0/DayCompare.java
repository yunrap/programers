public class DayCompare {
    public int solution(int[] date1, int[] date2) {
        if(isLeftDay(date1[0], date2[0])){
            return 1;
        }else if(isSameDay(date1[0], date2[0]) && isLeftDay(date1[1], date2[1])){
            return 1;
        }else if(isSameDay(date1[0], date2[0]) && isSameDay(date1[1], date2[1]) && isLeftDay(date1[2], date2[2])){
            return 1;
        }else{
            return 0;
        }
    }

    private boolean isLeftDay(int date1, int date2){
        if(date1 < date2)
            return true;
        else
            return false;
    }

    private boolean isSameDay(int date1, int date2){
        if(date1 == date2)
            return true;
        else
            return false;
    }


}

// https://school.programmers.co.kr/learn/courses/30/lessons/181838#
// date1 date2보다 앞서는날짜면 1, 아니면 0을 return한다
// year함수(비교하는) month(비교하는) day(비교하는)
// 2010.2.10  2009.12.10 (예외케이스)
// 내일리팩토링하기