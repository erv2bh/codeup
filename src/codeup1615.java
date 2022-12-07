/*문제 설명
어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
예를 들어 d(91) = 9 + 1 + 91 = 101 이 때, n을 d(n)의 제네레이터(generator)라고 한다.
위의 예에서 91은 101의 제네레이터이다.
어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다.
그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다.
예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
시작 값(a)과 마지막 값(b)가 입력되면 두 수 사이의 셀프 넘버들의 합을 출력하시오.*/

/*입력
시작 값(a)과 마지막 값(b)이 공백으로 분리되어 입력된다.( 1 <= a <= b <= 5,000)*/

/*출력
두 수사이의 셀프넘버들의 합을 출력한다.*/

import java.util.Scanner;

public class codeup1615 {
    static int [] check = new int[6000];
    /*제너레이터를 구하는 함수
    *입력받는 수와 각 자리의 수를 더하여 제너레이터를 구하고 제너레이터 값의 배열에 숫자를 늘려주어 제너레이터 여부를 확인한다.
    **/
    public static void gen(int num){
        int res = num;
        while(num!=0){
            res=res+num%10;
            num=num/10;
        }
        check[res]++;
    }

    public static void main(String[] args) {
        int inputA,inputB,sum=0;
        Scanner sc=new Scanner(System.in);
        inputA= sc.nextInt();
        inputB= sc.nextInt();
        for(int i=1;i<=inputB;i++){
            codeup1615.gen(i);
        }
        for(int i= inputA;i<=inputB;i++){
            if(check[i]==0){ //셀프넘버의 값들을 더하여 출력한다
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
