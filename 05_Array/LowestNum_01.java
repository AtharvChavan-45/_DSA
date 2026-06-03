// Display lowest element in array

import java.util.*;

public class LowestNum_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of Array");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter Array Element :");
        for(int i=0;i<num;i++){
             arr[i] = sc.nextInt();
        }

        int lowestNum = arr[0];
        for (int i : arr) {
            if(lowestNum>i){
                lowestNum = i;
            }
        }
        sc.close();
        System.out.println("Lowest number in arry: " + lowestNum);
        
    }
}