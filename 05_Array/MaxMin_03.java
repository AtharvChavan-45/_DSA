//Create a program that keeps track of the highest and lowest values in an array:

import java.util.*;

public class MaxMin_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        
        for (int i : arr) {
            if(max<i){
                max = i;
            }
            if(min>i){
                min = i;
            }


        }
        System.out.println("MaxNum : " + max);
        System.out.println("MinNum : " + min);

        sc.close();
    }
}

/* Using for loop
import java.util.*;

public class MaxMin_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < num; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("MaxNum : " + max);
        System.out.println("MinNum : " + min);

        sc.close();
    }
}
*/

/*
import java.util.*;

public class MaxMin_03 {

    // Method to find maximum and minimum
    void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("MaxNum : " + max);
        System.out.println("MinNum : " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Create object
        MaxMin_03 obj = new MaxMin_03();

        // Call method using object
        obj.findMaxMin(arr);

        sc.close();
    }
}
*/