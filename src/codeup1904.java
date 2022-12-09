/*문제 설명
시작수(a)와 마지막 수(b)가 입력되면

a부터 b까지의 모든 홀수를 출력하시오.

이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.*/

/*입력
두 수 a, b 가 입력된다. (1<=a<=b<=100)*/

/*출력
a~b의 홀수를 모두 출력한다*/

import java.util.Scanner;

public class codeup1904 {
    /*처음수와 나중수를 비교해서 처음수가 크면 함수를 리턴하고 처음수가 홀수이며 처음수를 출력하고
    처음수+1과 나중수를 함수의 입력값으로 사용하여 함수를 호출한다*/
    static void f(int first, int second){
        if(second<first){
            return;
        }
        if(first%2!=0){
            System.out.println(first);
        }
        f(first+1,second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputFirst = sc.nextInt();
        int inputSecond = sc.nextInt();
        f(inputFirst,inputSecond);
    }
}
