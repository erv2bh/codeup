/*문제 설명
세종이는 주말에 정보 과학실에서 정보 올림피아드 준비를 하려고 한다.
JH 선생님은 정보 과학실 사용 조건으로 정보 올림피아드 참가 학생 명단을 작성하는 프로그램을 작성하라고 하셨다.
짖굳은 JH 선생님은 입력 데이터를 만들 때 일부러 중간에 잘못된 값을 끼워 왕창 끼워 넣었다.
그리고 잘못된 데이터를 제거하는 방법을 설명해 주었다.
다음 조건에 따라 프로그램을 만들고 올바른 명단만 출력해 보자.*/

/*
입력
첫째 줄에 입력 데이터의 개수 n이 입력된다. (10<=n<=100)
둘째 줄부터 n+1번째 줄까지 처리 코드c(문자 1자리), 수험 번호 no(1<=no<=10,000), 이름(10바이트 이내)이 입력된다.
처리 코드에 따라 입력 데이터를 메모리에 저장하거나 삭제해야 한다. 처리 코드가 'I'이면 데이터를 수험 번호 순서에 맞게 삽입한다.
만약 입력할 때 이미 수험 번호가 입력되어 있다면 아무 작업도 하지 않는다.
처리 코드가 ‘D’이면 메모리의 데이터 중에서 해당 수험 번호를 찾아 삭제한다.
만약 처리 코드가 'D'이고 해당 수험 번호가 존재하지 않으면 아무 작업도 하지 않는다.
마지막으로 n+2번째 줄에 올바른 데이터의 위치를 나타내는 정수 5개가 입력된다.*/

/*출력
메모리에 저장된 데이터 중에서 올바른 데이터 위치에 있는 값의 명단을 출력한다.*/


import java.util.Scanner;
class Olympiad{
    int code;
    String name;
}

public class codeup3108 {
    static Olympiad [] arr = new Olympiad[100];
    static int count = 0;
    /*삽입 함수 정의
    * 수험번호와 이름이 입력되고 arr배열에 수험번호가 겹치면 함수를 종료하고 겹치지 않으면 수험번호와 이름을 arr배열에 저장하고 카운트수를 늘려준다 */
    public static void Insert(int code, String name){
        for(int i=0;i<count;i++){
            if(arr[i].code == code){
                return;
            }
        }
        Olympiad olympiad = new Olympiad();
        olympiad.code = code;
        olympiad.name = name;
        arr[count]=olympiad;
        count++;
    }
    /*삭제 함수 정의
    * 수험번호가 입력되고 카운트만큼 반복하여 arr배열에 수험번호가 겹치면 해당 번째 배열을 지우고(해당 번째 배열 바로 뒷배열부터 덮어쓰기 한다)
    * 카운트수를 줄여준다*/
    public static void Delete(int code){
        for(int i=0;i<count;i++){
            if(arr[i].code == code){
                for(int j=i;j<=count-1;j++) {
                    arr[j] = arr[j + 1];
                }
                count--;
                return;
            }
        }
    }
    /*데이터 개수가 입력되고 개수만큼 처리코드 수험번호 이름이 입력된다
    * 처리코드가 I이면 삽입 함수를 호출하여 수험번호를 비교한 후 데이터를 저장하고, 처리코드가 D이면 삭제 함수를 호출하여 수험번호를 비교한 후
    * 데이터를 삭제한다
    * 정수 5개가 입력되고 list배열에 저장된다.
    * 데이터 값을 수험번호를 기준으로 앞 수험번호가 뒷 수험번호보다 크면 순서를 바꿔주어 오름차순으로 정렬한다
    * 정수 5개의 각 정수번째 배열에 해당하는 데이터의 수험번호와 이름을 출력한다.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] list = new int[5];
        int inputN = sc.nextInt();
        for(int i=0;i<inputN;i++){
            String code = sc.next();
            int number = sc.nextInt();
            String name = sc.next();
            if(code.compareTo("I")==0){
                Insert(number,name);
            }else if(code.compareTo("D")==0){
                Delete(number);
            }
        }
        for(int i=0;i<5;i++){
            list[i]=sc.nextInt();
        }
        for(int i=count-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j].code>arr[j+1].code){
                    Olympiad olympiad = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = olympiad;
                }
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<count;j++){
                if(list[i]-1 == j){
                    System.out.println(arr[j].code+" "+arr[j].name);
                }
            }
        }
    }
}
