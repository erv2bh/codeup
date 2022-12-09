/*문제 설명
정렬되지 않은 학생들의 임의의 점수를 입력하여 석차를 계산하는 프로그램을 작성하시오.
점수는 동점이 있을 수 있으며, 이러한 경우 같은 석차로 처리한다.
예를 들어 5명의 점수 100, 90, 76, 60, 90이 입력되었다면 석차는 2등이 2명이고 3등은 없다.
(단, 점수가 가장 높은 학생을 1등으로 한다.)*/

/*입력
1) 첫 번째 줄은 처리할 점수의 개수 n ( n <= 200 ) ※ 조건수정:2012.10.6
2) 두 번째 줄은 처리할 점수 데이터 (0~100점)
(단, 각각의 점수는 빈칸으로 구별한다.)*/

/*출력
석차를 계산한 후 점수와 석차를  출력한다.*/

import java.util.Scanner;

class StudentData{
    int score;
    int rank;
}
/*처리할 점수의 개수와 점수들을 입력받는다
* 입력받은 점수들을 StudentData 객체의 arr[]배열에 저장한다
* 순서대로 저장한 점수들의 순위를 매긴다(앞점수와 바로뒷 점수를 비교하여 앞점수가 작으면 등수를 내려준다)
* 입력받은 순서대로 점수와 매겨진 순위를 출력한다*/
public class codeup4012 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputN = scan.nextInt();

        StudentData [] arr = new StudentData[inputN];

        for(int i = 0; i < inputN; i++){

            int score = scan.nextInt();
            StudentData studentData = new StudentData();
            studentData.score=score;
            studentData.rank=1;
            arr[i] = studentData;
        }
        for(int i = 0; i < inputN; i++) {
            for(int j = 0; j < inputN; j++){
                if(arr[i].score < arr[j].score){
                    arr[i].rank ++;
                }
            }
            System.out.printf("%d %d \n", arr[i].score, arr[i].rank);
        }

    }
}

