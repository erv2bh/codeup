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
