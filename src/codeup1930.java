/*문제 설명
SuperSum 함수는 다음과 같이 정의된다.

      SuperSum(0,n)=n (n은  모든 양의 정수)

      SuperSum(k,n)=SuperSum(k−1,1)+SuperSum(k−1,2)+...+SuperSum(k−1,n)
k와 n이 여러개 주어진다. SuperSum의 값을 각각 출력하시오.*/

/*입력
k(1<=k<=14)와 n(1<=n<=14)이 입력된다. 입력의 끝은 EOF(End Of File)이다.

입력 처리 방법)

while( scanf("%d %d", &k, &n) != EOF )
	printf("%d\n", SuperSum(k, n));*/

/*출력
SuperSum(k,n)의 값을 각 행에 하나씩 출력한다.*/

import java.util.Scanner;

/*정수 inputK가 0이면 inputN을 반환한다 i가 1부터 inputN일 동안 반복하는데 superSum(inputK-1,i)함수의 출력값을 sum과 합하여주고 sum을 반환한다.
* 메인문에서 입력시 파일의 끝이 아닌동안 반복한다*/
public class codeup1930 {
    static int superSum(int inputK, int inputN){
        int sum=0;
        if (inputK == 0) {
            return inputN;
        }
        for(int i=1;i<=inputN;i++){
            sum+=superSum(inputK-1,i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int inputK = sc.nextInt();
            int inputN = sc.nextInt();
            System.out.println(superSum(inputK,inputN));
        }
    }
}
