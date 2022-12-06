/*버블정렬*/

import java.util.Scanner;
public class codeup1441 {
    public static void main(String[] args) {


        int [] arr=new int[10001];
        int i,j,tmp;
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        for( i=1;i<=inputN;i++){
            arr[i] = sc.nextInt();
        }
        for(i=1;i<inputN;i++){
            for(j=1;j<=inputN-i;j++){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(i=1;i<=inputN;i++){
            System.out.println(arr[i]);
        }
    }
}
