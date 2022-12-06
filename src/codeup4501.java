/*문제 설명
문제1) 백설공주와 난장이 (초등1)
안개 숲에는 백설 공주와 7명의 난장이가 함께 살고 있다.
7명의 난장이의 키가 입력으로 주어질때 이 중 키가 가장 큰 난장이와 두 번째로 큰 난장이의 키를 출력하는 프로그램을 작성하시오.*/

/*입력
첫 째 줄부터 일곱 번째 줄까지 한 줄에 하나씩 난장이의 키가 주어진다. 주어지는 난장이의 키는 100보다 작은 자연수이다*/

/*출력
첫째 줄에는 가장 키가 큰 난장이의 키를 출력한다. 두 번째로 키가 큰 난장이의 키를 출력한다.

만약 가장 키가 큰 난장이가 둘 이상이라면 첫째 줄과 둘째 줄에 같은 값을 출력해야 한다.
*/

import java.util.Scanner;
public class codeup4501 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] height = new int[7];

        for(int i=0;i<7;i++){ //7명의 난쟁이 키를 순서대로 입력받는다
            height[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++){ //처음 난쟁이부터 시작해서 뒷 난쟁이의 키가 앞 난쟁이의 키보다 클 경우 키 순서를 바꿔준다
            for(int j=0;j<6;j++){
                if(height[j] > height[j+1]){
                    int tmp;
                    tmp=height[j];
                    height[j]=height[j+1];
                    height[j+1]=tmp;
                }
            }
        }
        System.out.println(height[6]+" "+height[5]);
    }
}
