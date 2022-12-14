/*문제 설명
순서없이 적힌 스케줄 메모가 있다.
메모는 스케줄명, 연, 월, 일 의 형태로 구성되어 있다.
이 메모를 토대로 날짜가 빠른 순서로 정렬하여 출력하고자 한다.
만약 날짜가 동일한 경우 스케줄명의 사전식 순서로 오름차순 정렬한다.*/

/*입력
첫째줄에 데이터의 개수 n이 입력된다.(1<=n<=100)
그 다음줄부터 n개의 데이터가 스케줄명, 년, 월, 일 형태로 한 줄에 하나씩 입력된다.
스케줄명은 공백없이 알파벳소문자 99글자 이하, 년월일은 유효한 날짜만 입력된다.*/

/*출력
가장 먼저 해야 할 스케줄명부터 정렬하여  출력한다.*/

/*풀이
* 데이터의 개수가 입력되고 개수만큼 스케쥴명 년 월 일이 입력되어 arr배열에 저장된다
* 날짜순으로 arr배열을 정렬(맨 처음 데이터부터 시작해서 바로 뒷 데이터와 비교후 크면 뒷 데이터와 자리를 바꿈)하고
* 날짜가 같은경우 스케쥴명 순으로 다시 정렬(맨 처음 데이터부터 시작해서 바로 뒷 데이터와 비교후 크면 뒷 데이터와 자리를 바꿈)한다
* 정렬된 스케쥴명을 출력한다
* */
import java.util.Scanner;
class Schedule{
    String name;
    int date;
}

public class codeup3019 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inputN = sc.nextInt();
        Schedule [] arr = new Schedule[inputN];
        for(int i=0;i<inputN;i++){
            String name = sc.next();
            int year = sc.nextInt();
            int month = sc.nextInt();
            int date = sc.nextInt();

            Schedule schedule = new Schedule();
            schedule.name = name;
            schedule.date= year*1000+month*100+date;
            arr[i] = schedule;
        }
        for(int i=inputN-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j].date>arr[j+1].date){
                    Schedule schedule = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = schedule;
                }
            }
        }
        for(int i=inputN-1;i>0;i--){
            for(int j=0;j<i;j++){
                if((arr[j].date == arr[j+1].date) && ((arr[j].name.compareTo(arr[j+1].name))>0)){
                    Schedule schedule = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = schedule;
                }
            }
        }
        for(int i=0;i<inputN;i++){
            System.out.println(arr[i].name);
        }
    }
}
