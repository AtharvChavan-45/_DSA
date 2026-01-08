import java.util.*;
import java.util.Scanner;

public class Main {
  
  
  static void printNumbers(int n){
    for(int i=0;i<=n;i++){
      System.out.print(i+" ");
    }
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter number:");
      int n = sc.nextInt();
      
      printNumbers(n);
  }
}