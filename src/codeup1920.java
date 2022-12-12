/*문제 설명
어떤 10진수 n이 주어지면 2진수로 변환해서 출력하시오.
예)
10    ----->  1010
0    ----->  0
1    ----->  1
2    ----->  10
1024    ----->  10000000000
이 문제는 반복문을 이용하여 풀 수 없습니다.*/

/*입력
10진수 정수 n이 입력된다.
(0<=n<=2,100,000,000)*/

/*출력
2진수로 변환해서 출력한다.*/

import java.util.Scanner;
/*정수 k를 2로 나눈 몫이 0이 아니면 k를 2로 나눈 몫을 입력값으로 하여 tobin함수를 호출한다
* k를 2로 나눈 나머지를 출력한다*/
public class codeup1920 {
    static void tobin(int k){
        if(k/2!=0){
            tobin(k/2);
        }
        System.out.println(k%2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inputN = sc.nextInt();
        tobin(inputN);
    }
}
