/*선택정렬*/

import java.util.Scanner;
public class codeup1442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10001];
        int i,j,tmp;
        int inputN = sc.nextInt();
        for(i=1;i<=inputN;i++){
            arr[i]=sc.nextInt();
        }
        for(i=1;i<inputN;i++){
            int min = i;
            for(j=i+1;j<=inputN;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        for(i=1;i<=inputN;i++){
            System.out.println(arr[i]);
        }
    }
}
