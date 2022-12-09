/*문제 설명
1부터 정수 n까지 출력하는 재귀함수를 설계하시오.

이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.*/

/*입력
정수 n이 입력된다(1<=n<=200)*/

/*출력
n부터 1까지 한 줄에 하나씩 출력한다.*/

import java.util.Scanner;
public class codeup1902 {
    /*정수 n이 0이면 함수를 리턴하고 0이 아니면 정수 n을 출력하고 함수를 호출한다*/
    static void f(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        f(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        f(inputN);
    }
}

