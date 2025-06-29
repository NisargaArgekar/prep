public class check_specific_element {
    public static void main(String[] args) {
        int arr[] = {90,89,45,67,55};
        int target = 77;
        boolean found = false ;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==target){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("the element " +target+ "is found");
        else
            System.out.println("the element " +target+ " is not found");
       
        }
    }
// This code checks if a specific element (target) is present in the array (arr).
// It iterates through the array and sets a boolean flag (found) to true if the element is found.
// Finally, it prints whether the element is found or not based on the flag's value.
