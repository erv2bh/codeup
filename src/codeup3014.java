/*문제 설명
N개의 입력 데이터가 주어지면 정렬해서 출력하시오.
입력 예)
5
2 5 8 1 2
출력 예)
1 2 2 5 8*/

/*입력
첫 줄에 데이터의 개수 N이 입력된다. ( 1 <= N <= 4,500,000 )
둘째 줄에 공백으로 분리되어 N개의 데이터가 입력된다. ( 데이터 값의 범위 : 0 ~ 100,000 )*/

/*출력
데이터를 오름차순으로 정렬하여 출력한다*/

import java.util.Scanner;
public class codeup3014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [100001];
        int inputN = sc.nextInt();
        int data;
        for(int i=1;i<=inputN;i++){ //데이터 개수만큼 데이터 입력받고 데이터번째 배열의 수를 세준다
            data=sc.nextInt();
            arr[data]++;
        }
        for(int i=0;i<=100000;i++){
            for(int j=1;j<=arr[i];j++){ //arr 0번째 배열부터 시작해서 해당 번째 배열의 값동안 반복한후 해당번째 수를 출력한다.
                System.out.println(i);
            }
        }
    }
}
