/*문제 설명
팩토리얼(!)은 다음과 같이 정의된다.

n!=n×(n−1)×(n−2)×⋯×2×1
즉, 5!=5×4×3×2×1=120 이다.

n이 입력되면 n!의 값을 출력하시오.

이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.*/

/*입력
자연수 n이 입력된다. (n<=12)*/

/*출력
n!의 값을 출력한다.*/

import java.util.Scanner;
/*정수 n이 1이면 1을 반환하고 1이 아니면 n-1을 입력한 함수 반환값과 n을 곱해준다*/
public class codeup1912 {
    static int f(int n){
        if(n==1){
            return 1;
        }
        return n*f(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inputN = sc.nextInt();
        System.out.println(f(inputN));
    }
}
