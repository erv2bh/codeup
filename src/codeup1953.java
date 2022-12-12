/*문제 설명
n이 입력되면 다음과 같은 삼각형을 출력하시오.
예)
n 이 5 이면
*
**
***
****
*****
이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.*/

/*입력
길이 n이 입력된다.(1<=n<=150)*/

/*출력
삼각형을 출력한다.*/

import java.util.Scanner;

/*길이가 2번 입력되고 해당 줄의 별 개수를 다 채우면 줄을 바꿔주어 별을 출력한다*/
public class codeup1953 {
    static void f(int k,int n){
        if(k==1){
            System.out.print("*");
            return;
        }
        if(n==1){
            f(k-1,k-1);
            System.out.println();
        }
        else{
            f(k,n-1);
        }
        System.out.print("*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN=sc.nextInt();
        f(inputN, inputN);
    }
}
