/*문제 설명
문제 1) 아시아 정보올림피아드
최근 아시아 지역의 학생들만 참여하는 정보 올림피아드 대회가 만들어졌다. 이 대회는 온라인으로 치러지기 때문에 각 나라에서 이 대회에 참여하는 학생 수의 제한은 없다.
참여한 학생들의 성적순서대로 세 명에게만 금, 은, 동메달을 수여한다. 단, 동점자는 없다고 가정한다. 그리고 나라별 메달 수는 최대 두 개이다.
예를 들어, 대회 결과가 다음의 표와 같이 주어졌다고 하자.

대회 결과가 입력으로 주어질 때, 메달 수상자를 결정하여 출력하는 프로그램을 작성하시오.이 경우, 금메달 수상자는 1번 국가의 1번 학생이고, 은메달 수상자는 1번 국가의 2번 학생이며, 동메달 수상자는 3번 국가의 4번 학생이다.
(1번 국가의 3번 학생의 성적이 동메달 수여자보다 높지만, 나라 별 메달 수가 두 개 이하 이므로 1번 국가 3번 학생은 동메달을 받을 수 없다.)*/

/*입력
입력의 첫 번째 줄에는 대회참가 학생 수를 나타내는 N 이 주어진다. 단, 3<=N<=100 이다. 두 번째 줄부터 N 개의 줄에는 각 줄마다 한 학생의 소속 국가 번호, 학생 번호,
그리고 성적이 하나의 빈칸을 사이에 두고 주어진다. 단, 국가 번호는 1부터 순서대로 하나의 정수로 주어지며, 각 학생번호는 각 나라별로 1부터 순서대로 하나의 정수로 주어진다,
점수는 0 이상 1000 이하의 정수이고, 동점자는 없다고 가정한다. 입력으로 제공되는 국가는 적어도 두 나라 이상이다.*/

/*출력
메달을 받는 학생들을 금, 은, 동메달 순서대로 한 줄에 한명씩 출력한다.
즉, 첫 번째 줄에는 금메달 수상자를, 두 번째 줄에는 은메달 수상자를, 세 번째 줄에는 동메달 수상자를 출력한다.
하나의 줄에는 소속국가 번호와 학생 번호를 하나의 빈칸을 사이에 두고 출력한다. */

import java.util.Scanner;
class AsiaOlympiad{
    int countryCode;
    int studentNumber;
    int score;
}
/*학생수가 입력되고 소속국가 학생번호 점수가 입력되어 arr배열에 저장된다
* 버블정렬을 통하여 처음 점수부터 마지막 점수까지 바로 뒷 점수를 비교하여 자리를 바꾸면서 정렬해준다
* count 가 3 미만일동안 반복한다 -> i번째 소속국가 정보를 가진 scoreList배열이 2미만이면 i번째 소속국가와 학생번호를 출력하고 count수를 늘려준다*/
public class codeup4751 {
    static int [] scoreList = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        AsiaOlympiad [] arr = new AsiaOlympiad[inputN];
        for(int i=0;i<inputN;i++){
            int countryCode = sc.nextInt();
            int studentNumber = sc.nextInt();
            int score = sc.nextInt();
            AsiaOlympiad asiaOlympiad = new AsiaOlympiad();
            asiaOlympiad.countryCode = countryCode;
            asiaOlympiad.studentNumber = studentNumber;
            asiaOlympiad.score = score;
            arr[i] = asiaOlympiad;
        }
        for(int i=inputN-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j].score < arr[j+1].score){
                    AsiaOlympiad asiaOlympiad = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = asiaOlympiad;
                }
            }
        }
        int i=0;
        int count=0;
        while(count<3){
            if(scoreList[arr[i].countryCode]<2){
                System.out.println(arr[i].countryCode+" "+arr[i].studentNumber);
                scoreList[arr[i].countryCode]++;
                count++;
            }
            i++;
        }
    }
}
