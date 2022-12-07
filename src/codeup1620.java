/*문제 설명
어떤 수 n이 입력되면 n의 각 자릿수의 합이 한 자리가 될때까지 계산하여 출력하시오.
예) 1234567
1234567 → 1+2+3+4+5+6+7 = 28 → 2 + 8 = 10 → 1 + 0 = 1*/

/*입력
자연수 n이 입력된다. (1 <= n <= 10,000,000)*/

/*출력
자릿수의 합이 한자리가 될때까지 계산하여 출력한다.*/

import java.util.Scanner;
public class codeup1620 {
    /*각 자리수의 합을 구하는 함수
    * 몫이 0이면 입력값을 반환하고, 아니면 몫과 나머지를 합한 값을 반환한다*/
    public static int sum(int n){
        if(n/10==0){
            return n;
        }
        else return sum(n/10)+sum(n%10);
    }

    public static void main(String[] args) {
        int inputN;
        Scanner sc = new Scanner(System.in);
        inputN = sc.nextInt();
        int finalSum = sum(inputN); //자리수 합을 구하는 함수 호출
        while(finalSum>=10){ //자리수 합이 10이상일 동안 함수를 호출한다(자리수 합이 한자리수 일때까지 반복하기 위함)
            finalSum = sum(finalSum);
        }

        System.out.println(finalSum);
    }
}
