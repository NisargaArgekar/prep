public class sumofarray {
    public static void main(String[] args) {
        int arr[]={4,7,1,9,0,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("The sum of array is:" + sum);
    }
}
