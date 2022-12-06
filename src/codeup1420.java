/*문제 설명
 민준이는 뒤늦게 정보 과목의 중요성을 깨닫고 학습실에서 공부를 하고 있다.

기본 공부가 너무 안 되어 있어 아주 쉬운 문제부터 어려움을 겪은 민준이는 친구에게 물어보려고 한다.

가장 잘 하는 친구에게 물어보기는 질문의 내용이 너무 부끄러워 n명의 친구들 중 정보 성적이 3번째로 높은 친구에게 묻고자 한다.

친구들의 성적은 모두 다르다.

n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 세 번째로 높은 학생의 이름을 출력하시오.*/

/*입력
첫째 줄에 n이 입력된다. ( 3 <= n <= 50 )

둘째 줄 부터 n+1행까지 친구의 이름과 점수가 공백으로 분리되어 입력된다. 이름은 영문*/

/*출력
세 번째로 높은 학생의 이름을 출력한다.*/

import java.util.Scanner;
public class codeup1420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        int [] rank = new int[inputN];
        int [] score = new int[inputN];
        String [] name = new String [inputN];
        for(int i=0;i<inputN;i++){ //n만큼 학생이름과 점수가 입력된다
            name[i] = sc.next();
            score[i]=sc.nextInt();
            rank[i]=1;
        }
        for(int i=0;i<inputN;i++){ //0번째 배열부터 차례대로 각 배열의 값과 비교 후 rank 배열에 순위를 저장한다
            for(int j=0;j<inputN;j++){
                if(score[i] < score[j]){
                    rank[i]++;
                }
            }
        }
        for(int i=0;i<inputN;i++){ //rank 배열의 순위가 3인 값을 찾아 학생 이름을 출력한다
            if(rank[i]==3){
                System.out.println(name[i]);
            }
        }
    }
}
