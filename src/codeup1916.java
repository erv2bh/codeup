/*문제설명 피보나치 수열이란 앞의 두 수를 더하여 나오는 수열이다.
첫 번째 수와 두 번째 수는 모두 1이고, 세 번째 수부터는 이전의 두 수를 더하여 나타낸다. 피보나치 수열을 나열해 보면 다음과 같다.

1,1,2,3,5,8,13…

자연수 N을 입력받아 N번째 피보나치 수를 출력하는 프로그램을 작성하시오.
단, N이 커질 수 있으므로 출력값에 10,009를 나눈 나머지를 출력한다.*/

/*입력
자연수 N이 입력된다. (N은 200보다 같거나 작다.)*/

/*출력
N번째 피보나치 수를 출력하되, 10,009를 나눈 나머지 값을 출력한다.*/

import java.util.Scanner;
/*메모가 저장되어 있으면 메모 값을 반환하고 정수 n이 2이하이면 1을 반환하며 메모가 저장되어 있지 않다면 f(n-2)+f(n-1)%10009값을 메모에 저장후 반환한다*/
public class codeup1916 {
    static int [] memo = new int[201];
    static int f(int n){
        if(memo[n]!=0){
            return memo[n];
        }
        if(n<=2){
            return 1;
        }
        return memo[n] = (f(n-2)+ f(n-1)) % 10009;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        System.out.println(f(inputN));
    }
}
