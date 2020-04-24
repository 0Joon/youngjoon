/*
%[-][0][n][.m]지시자
- 출력 서식의 지시자를 제외한 나머지는 생략 가능하다. 예) %d 식으로 사용 가능.
* n : 출력할 전체 자리수 지정(오른쪽 정렬).  예) %3d, 전체자리수가 3인 정수
* 0 : 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 출력.  예) %03d
* - : 전체 자리수가 지정된 경우 왼쪽 정렬하고 빈칸에 공백 출력.
* .m : 소수점 아래 자리수 지정. 잘리는 소수점 자리수는 반올림 시켜서 표시.  예)3.2f

 %b
 - boolean 형식으로 출력 
 %d
 - 정수 형식으로 출력
 %o
 - 8진수 정수의 형식으로 출력
 %x 또는 %X
 - 16진수 정수의 형식으로 출력
 %f
 - 소수점 형식으로 출력
 %c
 - 문자형식으로 출력 
 %s
 - 문자열 형식으로 출력
 %n
 - 줄바꿈 기능
 %e 또는 %E
 - 지수 표현식의 형식으로 출력
*/


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}
