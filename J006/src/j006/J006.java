
package j006;

import java.util.Arrays;

/**
 *
 * @author Lingg
 */
public class J006 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Step 1: Input number of array
        int numOfArray =  inputNumberOfArray();
        
        // Step 2: Input search value
        int searchValue = inputSearchValue();

        // Step 3: Generate random integer in array
//        int[] array = generateRandomIntegerArray(numOfArray);
        int[] array = {1,1,1,1,3,4,6,8,9,9};
        
        // Step 4: Sort array
        SortArray(array);
        
        // Step 5: Display array
        displayArray(array, 0, numOfArray - 1);
        
        // Step 6: Use Binary seach to find index of search value in array
        int indexOfSearchValue = binarySearch(array,numOfArray,searchValue);
        
        // Step 7: Display index of search value in array
        displayIndexOfSearchValue(indexOfSearchValue, searchValue);
        
    }

    private static int inputNumberOfArray() {
        return Validation.inputInteger("Enter number of array: ");
    }

    private static int inputSearchValue() {
        return Validation.inputInteger("Enter search value: ");
    }

    private static int[] generateRandomIntegerArray(int numOfArray) {
        int[] array = new int[numOfArray];
        
        // for each element in array and assgign random value
        for(int i = 0 ; i < numOfArray ; i++){
            // Use 0 <= Math.random() <= 1 so 1 <= Math.random()*numOfArray + 1 <= numOfArray
            array[i] = (int) Math.floor(Math.random()*numOfArray) + 1;
        }
        return array;
    }

    private static void SortArray(int[] array) {
        Arrays.sort(array);
        System.out.print("Sorted array: ");
    }
    
    private static void displayArray(int[] array, int left, int right) {
        System.out.printf("[");
        // for each element in array and display them
        for(int i = left ; i < right ; i++){
            // check element is last of array
            if(i == right - 1){
                System.out.printf("%d]\n", array[i]);
            }
            else System.out.printf("%d, ", array[i]);
        }
    }

    private static int binarySearch(int[] array, int numOfArray, int searchValue) {
        /* If numOfArray is equal 0 -> array is empty 
        -> can't find searchValue*/
        if(numOfArray == 0) return -1;
        
        // index of start search in array
        int left = 0;
        // index of end search in array
        int right = numOfArray - 1;
        
        // while loop continue to find index of search value in range(left,right), left <= right is valid
        while(left <= right){
            // Get index of middle in array
            int mid = (left + right)/2;
            
            /* If searchValue is less than value of middle 
            -> searchValue in left half of array -> right = mid - 1*/
            if(searchValue < array[mid]){
                right = mid - 1;
                
                System.out.printf("%d < %d: Find searchValue in left half: ", searchValue, array[mid]);
                displayArray(array, left, right);
            }
            /* If searchValue is greater than value of middle 
            -> searchValue is right half of array -> left = mid + 1;*/
            else if(searchValue > array[mid]){
                left = mid + 1;
                
                System.out.printf("%d > %d: Find searchValue in right half: ", searchValue, array[mid]);
                displayArray(array, left, right);
            }
            /* Otherwise searchValue is equal value of middle
             -> Index of search in array is middle */
            else{
                System.out.printf("%d == %d: Found searchValue is: %d\n", searchValue, array[mid], mid);
                return mid;
            }
        }
        
        // If can't find index of searchValue in array -> Return -1;
        return -1;
    }

    private static void displayIndexOfSearchValue(int indexOfSearchValue, int searchValue) {
        // If index of searchValue is equal -1 -> searchValue is absent
        if(indexOfSearchValue == -1){
            System.out.printf("Can't found %d in array!", searchValue);
        }
        else{
            System.out.printf("Found %d at index: %d\n", searchValue, indexOfSearchValue);
        }
    }
    
    
}
