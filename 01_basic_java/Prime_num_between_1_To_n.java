// more optimize code

import java.util.Scanner;

public class Main {

  static boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  static void printPrimes(int start, int end) {
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter range:\n");
    int start = sc.nextInt();
    int end = sc.nextInt();

    printPrimes(start, end);
  }
}


/* import java.util.*;
import java.util.Scanner;

public class Main{
  
  static void printPrimes(int n){
    for(int i=2;i<=20;i++){
      int count=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0){
          count++;
        }
      }
      if(count==2){
        System.out.print(i+" ");
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter any numeber:\n");
    int num = sc.nextInt();
    
    printPrimes(num);
  }
}*/

// print first 10 prime numbers
/*
import java.util.*;
import java.util.Scanner;

public class Main{
  
  static void printPrimes(int start,int end){
    for(int i=start;i<=end;i++)
    {
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0)
        {
          count++;
        }
      }
      if(count==2){
        System.out.print(i+" ");
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter range :\n");
    int start = sc.nextInt();
    int end = sc.nextInt();
    printPrimes(start,end);
  }
}

*/


