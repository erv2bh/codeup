import java.util.Scanner;
public class codeup1172 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input_a=sc.nextInt();
        int input_b=sc.nextInt();
        int input_c=sc.nextInt();
        if((input_a>=input_b) & (input_a>=input_c)){ //a가 b보다 크거나 같고 a가 c보다 크거나 같으면
            if(input_b>input_c) { //b가 c보다 크면 c,b,a 순서로 출력한다
                System.out.println(input_c+" "+input_b+" "+input_a);
            }
            else { //b가 c보다 작으면 b,c,a 순서로 출력한다
                System.out.println(input_b+" "+input_c+" "+input_a);
            }
        }
        if((input_b>=input_a) && (input_b>=input_c)) { //b가 a보다 크거나 같고 b가 c보다 크거나 같으면
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