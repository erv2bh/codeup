/*문제 설명
프로그래밍 문제를 풀다 보면 뒤죽박죽인 N개의 데이터를 숫자의 크기 순으로 0 ~ N-1까지의 숫자로 재정렬 해야되는 경우가 종종 있다.

예를 들어 N=5 이고,

50 23 54 24 123

이라는 데이터가 있다면,

2 0 3 1 4

가 된다.

데이터를 재정렬하는 프로그램을 작성하시오.*/
/*입력
첫째 줄에 데이터의 개수 N이 입력된다. ( 1 <= N <= 50,000)
둘째 줄에 공백으로 분리되어 N개의 서로 다른 데이터가 입력된다. (값의 범위:0~500,000)*/

/*출력
N개의 데이터를 0 ~ N-1로 재정렬하여 출력하라.*/

/*풀이
inputN이 입력되고 inputN 개수만큼 데이터값을 입력받고 data배열에 저장한다
데이터값을 저장한 data배열을 rank배열에 저장하고 값을 증가시켜 주어서 해당 배열의 값의 유무를 확인한다
rank[0]부터 rank[500000]까지 rank배열값이 존재하면 count를 늘려주어 세준다
rank의 data[i]배열값을 출력한다
 */
import java.util.Scanner;
public class codeup3004 {
    public static void main(String[] args) {
        int inputN;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        inputN = sc.nextInt();
        int [] data = new int[inputN];
        int [] rank = new int[500000];
        for(int i=0;i<inputN;i++){
            data[i]=sc.nextInt();
            ++rank[data[i]];
        }
        for(int i=0;i<500000;i++){
            if(rank[i]>0){
                rank[i]=count++;
            }
        }
        for(int i=0;i<inputN;i++){
            System.out.println(rank[data[i]]);
        }
    }
}
