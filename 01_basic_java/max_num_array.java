void main(){
    int[] nums = {10,5,25,8,13};
    int max = getMax(nums);
    System.out.println(max);
}

int getMax(int[] nums){ // java 8 method
    return IntStream.of(nums)
        .max()
        .getAsInt();
           
}