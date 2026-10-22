
package j0009;

/**
 *
 * @author Lingg
 */
public class J0009 {

    public static void main(String[] args) {
        //Step 1: Use recursion to find 45 sequence Fibonacci
        int[] arr = find45SequenceFibo(45);
        //Step 2: Display to screen
        displayArray(arr);
    }

    private static int[] find45SequenceFibo(int size) {
        int[] arr = new int[size];
        findFiboNum(0,arr);
        return arr;
    }

    private static void displayArray(int[] arr) {
        System.out.println("The 45 sequence fibonacci:");
        //Loop to access each element of array
        for(int i = 0 ; i < arr.length ; i++){
            //Check if element is last of array
            if(i == arr.length - 1){
               System.out.printf("%d\n", arr[i]);
            }
            else System.out.printf("%d, ", arr[i]);
        }
    }

    private static void findFiboNum(int count, int[] arr) {
        //Check if count is equals array size to stop recursion
        if(count == arr.length){
            return;
        }
        //Check if the first two elements of the Fibonacci sequence
        if(count == 0 || count == 1){
            arr[count] = count;
            System.out.printf("%d: %d\n", count + 1, arr[count]);
        }
        else{
            arr[count] = arr[count - 1] + arr[count-2];
            System.out.printf("%d: %d + %d = %d\n", count + 1,arr[count - 1],arr[count-2], arr[count]);
        }
        findFiboNum(count+1, arr);
    }
    
}
