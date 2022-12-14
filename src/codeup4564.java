/*문제 계단오르기 https://codeup.kr/problem.php?id=4564

계단 오르기 게임은 계단 아래 시작점부터 계단꼭대기에 위치한 도착점까지 가는 게임이다. <그림 1>과 같이 각각의 계단에는 일정한 점수가 쓰여 있는데 계단을 밟으면 그 계단에 쓰여 있는 점수를 얻게 된다.
예를 들어 <그림 2>와 같이 시작점에서부터 첫 번째, 두 번째, 네 번째, 여섯 번째 계단을 밟아 도착점에 도달하면 총 점수는 10+20+25+20=75점이 된다.

계단을 오르는 데는 다음과 같은 규칙이 있다.
(1) 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
(2) 연속된 세 개의 계단을 모두 밟아서는 안된다. 단, 시작점은 계단에 포함되지 않는다.
(3) 마지막 도착 계단은 반드시 밟아야 한다.
따라서 첫 번째 계단을 밟고 이어 두 번째 계단이나, 세 번째 계단으로 오를 수 있다. 하지만, 첫 번째 계단을 밟고 이어 네 번째 계단으로 올라가거나, 첫 번째, 두 번째, 세 번째 계단을 연속해서 모두 밟을 수는 없다.

각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최대값을 구하는 프로그램을 작성하시오.
*/

/* 입력
첫째 줄에 계단의 개수가 주어진다.
둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여 있는 점수가 주어진다.
계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10000이하의 자연수이다.*/

/* 출력
첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최대값을 출력한다.*/

import java.util.Scanner;
/* 얻을수 있는 총 점수의 최대값을 arr배열에 저장
   입력받는 계단의 점수를 stairArr배열에 저장
   stair함수 -> 정수 n이 입력되고 n이 1보다 작으면 0을 반환하고 arr배열에 값이 있으면 그 값을 반환한다
   그렇지 않으면 arr배열에 stair(n-3)+stairArr[n-1]값과 stair(n-2)값중 큰 값과 stairArr[n]값을 더한 값을 반환한다
   (규칙: n-1을 밟는 경우 -> n-2를 밟지못한다 그래서 stair(n-3)+stairArr[n-1]+stairArr[n]
         n-1을 밟지 않는 경우 -> n-2를 무조건 밟는다 그래서 stair(n-2)+stairArr[n]
* */
public class codeup4564 {
    static int [] arr = new int [333];
    static int [] stairArr = new int [333];
    static int stair (int n){
        if(n<1) {
            return 0;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        return arr[n] = Math.max(stair(n-3)+stairArr[n-1],stair(n-2)) + stairArr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        for(int i=1;i<=inputN;i++){
            stairArr[i] = sc.nextInt();
        }
        arr[1]=stairArr[1];
        arr[2]=stairArr[1] + stairArr[2];
        System.out.println(stair(inputN));
    }
}
