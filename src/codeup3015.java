/*문제 설명
세종이는 정보과학 선생님인 JH를 도와주기 위해 정보과학 성적처리 프로그램을 만들기로 했다.

JH 선생님은 학생들의 명단과 점수를 입력하면 상위 m명의 학생 명단을 출력해 주기를 원한다.

다음 조건을 만족하는 프로그램을 작성해 보자.*/

/*입력
첫째 줄에 데이터의 개수 n (3<=n<=100)과 출력인원 m (1<=m<=n)이 공백으로 구분되어 입력된다.

둘째 줄부터 학생 이름과 점수(0 100)가 공백으로 구분되어 입력된다.

단 이름의 길이는 최대 10바이트 이내이다.*/

/*출력
상위 m명의 학생명단을 출력한다.

단, 출력순서는 점수가 높은 학생이 먼저 출력되며, 점수가 같을 경우 입력 순서가 빠른 순서로 출력한다.*/

/*풀이
데이터 개수와 출력인원을 입력받고 데이터개수만큼 학생이름과 점수를 입력받는다
grade_card 객체에 정보를 저장한다
arr배열에 grade_card 객체를 저장한다
grade_card객체의 score 기준으로 내림차순으로 정렬한다
출력인원 만큼 점수가 높은 학생부터 출력한다.
*/
import java.util.Scanner;
class Grade_card{
    String name;
    int score;
}

public class codeup3015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputN = scan.nextInt();
        int inputM = scan.nextInt();
        Grade_card[] arr = new Grade_card[inputN];

        for(int i = 0; i < inputN; i++){
            String name = scan.next();
            int score = scan.nextInt();

            Grade_card grade_card = new Grade_card();
            grade_card.name = name;
            grade_card.score = score;
            arr[i] = grade_card;
        }

        for(int i = arr.length -1 ; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                if(arr[j].score < arr[j+1].score){
                    Grade_card grade_card = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = grade_card;
                }
            }
        }

        for(int i = 0; i < inputM; i++){
            System.out.println(arr[i].name);
        }
    }
}
