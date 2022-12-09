/*문제 설명
피보나치 수열이란 앞의 두 수를 더하여 나오는 수열이다.
첫 번째 수와 두 번째 수는 모두 1이고, 세 번째 수부터는 이전의 두 수를 더하여 나타낸다. 피보나치 수열을 나열해 보면 다음과 같다.

1, 1, 2, 3, 5, 8, 13 …

자연수 N을 입력받아 N번째 피보나치 수를 출력하는 프로그램을 작성하시오.
※ 이 문제는 반드시 재귀함수를 이용하여 작성 해야한다.*/

/*입력
자연수 N이 입력된다. (N은 20보다 같거나 작다.)*/

/*출력
N번째 피보나치 수를 출력한다.*/

import java.util.Scanner;
/*정수 n이 2보다 작거나 같으면 1을 반환하고 아니면 (n-2)값과 (n-1)값을 더한 값을 반환한다.*/
public class codeup1915 {
    static int f(int n){
        if(n<=2){
            return 1;
        }
        return f(n-2)+f(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        System.out.println(f(inputN));
    }
}
