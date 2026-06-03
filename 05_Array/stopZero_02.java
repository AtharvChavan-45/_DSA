// Create a program with a list of numbers where you want 
// to skip negative values, but stop completely if you find a zero:
import java.util.*;

public class stopZero_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            if(i<0){
                continue;
            }
            if(i==0){
                break;
            }
           System.out.println(i);
        }
        sc.close();
    }
}