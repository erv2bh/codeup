/*문제 설명
세 수를 오름차순으로 정렬하려고 한다. (낮은 숫자 -> 높은 숫자)

예)

5 8 2   ====> 2 5 8    로 출력*/

/*입력
세 정수가 입력된다.*/

/*출력
낮은 숫자 부터 출력한다.*/

import java.util.Scanner;
public class codeup1172 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input_a=sc.nextInt();
        int input_b=sc.nextInt();
        int input_c=sc.nextInt();
        if((input_a>=input_b) && (input_a>=input_c)){ //a가 b보다 크거나 같고 a가 c보다 크거나 같으면
            if(input_b>input_c) { //b가 c보다 크면 c,b,a 순서로 출력한다
                System.out.println(input_c+" "+input_b+" "+input_a);
            }
            else { //b가 c보다 작으면 b,c,a 순서로 출력한다
                System.out.println(input_b+" "+input_c+" "+input_a);
            }
        }
        else if((input_b>=input_a) && (input_b>=input_c)) { //b가 a보다 크거나 같고 b가 c보다 크거나 같으면
            if(input_a>input_c) { //a가 c보다 크면 c,a,b 순서로 출력한다
                System.out.println(input_c+" "+input_a+" "+input_b);
            }
            else { //a가 c보다 작으면 a,c,b순서로 출력한다
                System.out.println(input_a+" "+input_c+" "+input_b);
            }
        }
        else { // c가 a보다 크거나 같고 c가 b보다 크거나 같으면
            if(input_a>input_b) { //a가 b보다 크면 b,a,c 순서로 출력한다
                System.out.println(input_b+" "+input_a+" "+input_c);
            }
            else { //a가 b보다 작으면 a,b,c 순서로 출력한다
                System.out.println(input_a+" "+input_b+" "+input_c);
            }
        }
        sc.close();
    }
}