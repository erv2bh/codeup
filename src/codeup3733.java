/*문제 설명
콜라츠의 추측, 3n+1 문제, 우박수 문제라고 불리는 이 문제는 다음과 같다.
1, 어떤 자연수 n이 입력되면,
2. n이 홀수이면 3n+1을 하고,
3. n이 짝수이면 n/2를 한다.
4. 이 n이 1이 될때까지 2~3과정을 반복한다.
예를 들어 5는 5 → 16 → 8 → 4 → 2 → 1 이 된다.
여기서 5가 1이되기 위해 6개의 숫자를 나열하게 된다. 이것을 길이라고 하면 5의 길이는 6이된다.
시작수와 마지막 수가 입력되면 그 두 사이게 길이가 가장긴 우박수와 그 길이를 출력하시오.*/

/*입력
두 자연수 a, b가 공백으로 분리되어 입력된다. ( 1 <= a <= b <= 10,000,000 )*/

/*출력
출력
a에서 b사이에 길이가 가장긴 우박수와 그 길이를 출력한다. 만약 가장 긴 수가 두 개이상인 경우, 작은 숫자를 출력하시오.
*/

import java.util.Scanner;
/*정수 n과 length가 입력되고 n이 10000000보다 작고 arr배열에 n번째 배열에 해당하는 값이 있으면 그 값을 길이와 더해준다.
* 그렇지 않고 n이 홀수이면 3n+1 과 length+1을 입력해서 rain함수를 호출하고
* n이 짝수이면 n/2 와 length+1을 입력해서 rain함수를 호출한다.*/
public class codeup3733 {
    static int [] arr = new int[10000001];
    static int big = 0;
    static int rain(long n, int length){
        int nLong = (int) n;

        if(n<10000000 && arr[nLong]!=0){
            return arr[nLong]+length;
        }
        else if(nLong%2!=0){
            return rain(3*n+1,length+1);
        }
        else{
            return rain(n/2,length+1);
        }
    }
/*inputA와 inputB를 입력받고 arr배열에 i부터 시작해서 rain함수에 i를 입력하여 호출한다. 값중 제일 큰 배열의 번호를 저장해서 그 번호와 값을 출력한다.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA,inputB;
        inputA = sc.nextInt();
        inputB = sc.nextInt();
        arr[1]=1;
        for(int i=inputA;i<=inputB;i++){
            arr[i]=rain(i,0);
            if(arr[i]>arr[big]){
                big=i;
            }
        }
        System.out.print(big+" "+arr[big]);
    }
}
