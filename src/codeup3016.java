/*문제 설명
세종이는 정보과학 선생님인 JH를 도와주기 위해 정보과학 성적처리 프로그램을 만들기로 했다.
JH 선생님은 특정 과목에서 1등한 학생이 다른 과목에서는 어떤 성적을 얻었는지 관심이 많다.
다음 조건을 만족하는 프로그램을 작성해 보자*/

/*입력
첫째 줄에 데이터의 개수 nn (3<=n<=1003<=n<=100)
둘째 줄부터 n+1n+1줄에 학생 이름과 33과목 점수들이 공백으로 구분되어 입력된다. (입력 예시 참고)
단 이름의 길이는 최대 1010바이트 이내이다*/

/*출력
첫 번째 과목을 11등한 학생의 이름과 두 번째, 세 번째 과목의 석차를 공백으로 구분하여 출력한다.
단 첫 번째 과목의 11등은 11명이라고 가정한다.*/

import java.util.Scanner;
class Grade{
    String name;
    int score1;
    int score2;
    int score3;
}
/* 데이터 개수를 입력받고 데이터 개수만큼 학생이름과 3과목 점수를 입력받은 후 grade 객체에 저장한다
* score1이 가장 높은 학생의 입력순서를 기억하여 memory변수에 저장한다
* memory번째 arr배열의 score2점수가 score2점수보다 작을경우 scd수를 늘려준다
* memory번재 arr배열의 score3점수가 score3점수보다 작을경우 trd수를 늘려준다
* score1이 가장 높은 학생의 이름과 그 학생의 score2, score3 순위를 출력한다*/
public class codeup3016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inputN = sc.nextInt();
        int scoreCmp =0;
        int memory=0;
        int scd=1;
        int trd=1;
        Grade [] arr = new Grade[inputN+1];
        for(int i =1;i<=inputN;i++){
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            Grade grade = new Grade();
            grade.name=name;
            grade.score1=score1;
            grade.score2=score2;
            grade.score3=score3;
            arr[i]=grade;
            if(arr[i].score1 > scoreCmp){
                scoreCmp = arr[i].score1;
                memory=i;
            }
        }
        for(int i = 1;i<=inputN;i++){
            if(arr[i].score2 > arr[memory].score2){
                scd++;
            }
            if(arr[i].score3 > arr[memory].score3){
                trd++;
            }
        }
        System.out.println(arr[memory].name+" "+scd+" "+trd);
    }
}
