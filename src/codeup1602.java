/*문제 설명
절대값 함수를 만들어 봅시다.

입력으로 정수가 들어오면 정수로 결과를 출력하고, 실수가 들어오면 실수로 결과를 출력한다.

단, 소수점 이하에 불필요한 0은 입력되지 않는다.

[리턴 타입] ABS( [인자] )

{

        // ..코드..

}

int main()

{

       // 명령 및 함수 호출

}*/

/*입력
정수 또는 실수 n이 입력된다. (n은 정수 또는 실수)*/

/*출력
입력된 n의 절대값을 출력한다.

실수값일 경우 불필요한 0을 출력하지 않는다.*/

import java.util.Scanner;
class Absolute{
    public static double Abs(double num){ //입력값이 음수일 경우 양수로 치환한 후 결과값을 반환해준다
        if(num<0){
            return -num;
        }
        else{
            return num;
        }
    }
}
public class codeup1602{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Absolute absolute = new Absolute();
        double inputN = sc.nextInt();
        System.out.println(absolute.Abs(inputN));
    }
}