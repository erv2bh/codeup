/*문제 설명
n개의 계단이 있다.

어떤 사람이 계단을 오르려 하는데 이 사람은 계단을 한번에 1계단 2계단 또는 3계단씩 오를 수 있다.

이 사람이 계단을 오를수 있는 경우의 수를 1000으로 나눈 나머지를 구하여라*/

/*입력
계단의 수 n이 입력된다. ( 1 <= n <= 100,000 )*/

/*출력
계단을 오를 수 있는 가지수에 1000으로 나눈 나머지를 출력한다.*/

import java.util.Scanner;

/*정수 k를 입력받고 계단을 오를수 있는 경우의 수를 구한다(1계단 2계단 3계단씩 오를수 있음)
* 초기값(k가 0일때 1일때 2일때)을 지정해주고 memo에 값이 저장되어있으면 그 값을 반환한다.
* 아니면 3계단 전 2계단 전 1계단 전 값들을 구해서 각 경우의 수를 1000으로 나눈 나머지를 memo에 저장한 후 반환한다*/
public class codeup3704 {
    static int [] memo = new int [100001];

    static int stair(int k){
        if(k==0){
            return 1;
        }
        if(k==1){
            return 1;
        }
        if(k==2){
            return 2;
        }
        if(memo[k]!=0){
            return memo[k];
        }
        else return memo[k]=(stair(k-3)+stair(k-2)+stair(k-1))%1000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        System.out.println(stair(inputN));
    }
}
