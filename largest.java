public class largest {
    public static void main(String[] args) {
        
        int arr [] ={ 4,3,1,6,8,0,9};
        int max = arr[0];
        for (int i = 1; i<arr.length;i++){
            if(arr[i]>max){
               max = arr[i];
            }
        }
        System.out.println("the largest element is :" + max);
    }
}
