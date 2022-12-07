/*문제 설명
학생의 번호와 수학, 정보 점수를 가진 데이터가 있다.

우리는 이를 정렬하려고 한다.

정렬 기준은 수학점수가 높은 순으로 정렬하되, 수학점수가 같으면 정보점수가 높은 순, 정보점수도 같으면 번호가 빠른 순서로 정렬하려고 한다.*/


/*입력
첫째 줄에 학생수 n(번호:1~n)가 입력된다. (1 <= n <= 1,000)

둘째 줄부터 각 줄에 수학점수, 정보점수가 입력된다. (번호는 1번 부터 ~ n번 차례대로 데이터가 입력됨)
 */

/*출력
정렬된 데이터를 번호, 수학, 정보 점수 순으로 각 줄에 하나씩 출력한다.*/

import java.util.Scanner;
class Student{
    int id;
    int math;
    int informatics;
}
public class codeup3017 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inputN= sc.nextInt(); //학생수 입력
        Student[] arr = new Student[inputN]; //학생수만큼 배열 생성
        for(int i=0;i<inputN;i++){ //arr 배열에 수학 정보성적 저장
            Student student = new Student();
            student.id=i+1;
            student.math=sc.nextInt();
            student.informatics=sc.nextInt();

            arr[i]= student;
        }
        //수학점수 기준으로 정렬 한 후 수학점수가 같을경우 정보점수 기준으로 정렬. 만약 정보점수도 같다면 입력시 부여된 번호 순으로 정렬한다
        for(int i= arr.length - 1;i>0;i--){ //버블정렬
            for(int j=0;j<i;j++){
                if(arr[j].math < arr[j+1].math){ //수학성적을 첫번째 기준으로 정렬
                    Student student = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=student;
                } else if(arr[j].math == arr[j+1].math){ //수학점수가 같다면 정보점수로 정렬
                    if(arr[j].informatics < arr[j+1].informatics){
                        Student student = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = student;
                    }else if(arr[j].informatics == arr[j+1].informatics){ //정보점수가 같다면 번호순으로 정렬
                        if(arr[j].id > arr[j +1].id){
                            Student student = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = student;
                        }
                    }
                }
            }
        }
        for(int i=0; i<inputN;i++){
            System.out.println(arr[i].id+" "+arr[i].math+" "+arr[i].informatics);
        }
    }
}
