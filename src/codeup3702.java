/*문제 설명      
다음과 같은 삼각형을 파스칼의 삼각형이라고 한다.
회전 변환된 이 삼각형에서 (r행, c열)의 값을 알 수 있는 프로그램을 작성하시오. 행과 열은 1부터 시작한다.*/

/*입력
자연수 r과 c가 입력된다. (1 ≤ r, c ≤ 50)*/

/*출력
출력
(r, c)의 원소 값을 100,000,000으로 나눈 나머지를 출력한다.*/

import java.util.Scanner;
/*행 열 정보가 있을경우 그 값을 반환하고 행이나 열이 1일경우 1을 반환한다. 그게 아니면 행 열 정보를 저장하고 반환한다*/
public class codeup3702 {
    static int [][]memo = new int[51][51];
    static int pascal(int row, int column){
        if(memo[row][column]!=0){
            return memo[row][column];
        }
        if(row == 1 || column ==1){
            return 1;
        }
        return memo[row][column] = (pascal(row-1,column) + pascal(row,column-1))%100000000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputRow = sc.nextInt();
        int inputColumn = sc.nextInt();
        System.out.println(pascal(inputRow,inputColumn));
    }
}
