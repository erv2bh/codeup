/*문제 설명
정수 n이 입력으로 들어오면 1부터 n까지의 합을 구하시오.
이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.*/

/*입력
입력으로 자연수 n이 입력된다. (1<=n<=10,000)*/

/*출력
1부터 n까지의 합을 출력한다.*/

import java.util.Scanner;
/*정수 n을 입력받고 n이 1이면 1을 반환하고 1이 아니면 n-1값을 입력값으로 함수를 호출하고 그값을 정수 n값이랑 더하여 반환한다*/
public class codeup1905 {
    static int f(int n){
        if(n==1){
            return 1;
        }
        return f(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        System.out.println(f(inputN));
    }
}
