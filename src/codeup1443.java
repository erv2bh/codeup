/*삽입정렬*/

import java.util.Scanner;
public class codeup1443 {
    public static void main(String[] args) {
        int [] arr=new int[10001];
        int i,j;
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        for(i=1;i<=inputN;i++){
            arr[i]=sc.nextInt();
        }
        for(i=2;i<=inputN;i++){
            int key=arr[i];
            for(j=i-1;arr[j]>=key;j--){
                if(arr[j]>=key){
                    arr[j+1]=arr[j];
                }
            }
            arr[j+1]=key;
        }
        for(i=1;i<=inputN;i++){
            System.out.println(arr[i]);
        }
    }
}
