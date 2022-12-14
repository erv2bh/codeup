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
    /*학생수를 입력받고 입력받은 학생수만큼 arr배열을 생성한다. arr배열에 1부터 학생수만큼 번호(순서)와 수학성적과 정보성적을 저장한다
    * 수학점수를 기준으로 앞점수가 뒷점수보다 작으면 바꿔주어 내림차순으로 정렬한 후 수학점수가 같을경우 정보점수 기준으로 내림차순 정렬해준다
    * 만약 정보점수도 같다면 입력시 저장된 번호(순서) 순으로 내림차순 정렬해준다 */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inputN= sc.nextInt();
        Student[] arr = new Student[inputN];
        for(int i=0;i<inputN;i++){
            Student student = new Student();
            student.id=i+1;
            student.math=sc.nextInt();
            student.informatics=sc.nextInt();

            arr[i]= student;
        }

        for(int i= arr.length - 1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j].math < arr[j+1].math){
                    Student student = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=student;
                } else if(arr[j].math == arr[j+1].math){
                    if(arr[j].informatics < arr[j+1].informatics){
                        Student student = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = student;
                    }else if(arr[j].informatics == arr[j+1].informatics){
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
