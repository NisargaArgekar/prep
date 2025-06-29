import javax.sound.sampled.SourceDataLine;

public class smallest {

    public static void main(String[] args) {
        int arr []= {5,6,7,1,4,0,2};
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
         System.out.println("the smallest element is :"+ min);
    }
   
}
