import java.util.*;

public class SortsColor {

    void Solution(ArrayList<Integer> arr){
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0){
                count0++;
            } else if(arr.get(i)==1){
                count1++;
            }else{
                count2++;
            }
        }
        for(int i=0;i<arr.size();i++){
            if(i<count0){
                arr.set(i,0);
            }else if(count1+count0>i){
                arr.set(i,1);
            }else{
                arr.set(i,2);
            }
        }
        System.out.println(arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        SortsColor obj = new SortsColor();
        while(true){
            int num = sc.nextInt();

            if(num == -1){
                break;
            }
            if(num==1 ||num == 2||num==0){
                arr.add(num);
            }
        }
        obj.Solution(arr);

    }
}
