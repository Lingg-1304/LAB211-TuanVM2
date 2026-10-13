package j0010;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lingg
 */
public class J0010 {
    public static void main(String[] args) {
        // step 1: Users input size of array
        int sizeOfArray = inputArraySize();

        // step 2: Users input search value
        int searchValue = inputSearchValue();

        // step 3: Generate random integer in array
        int array[] = generateRandomIntegerInArray(sizeOfArray);

        // step 4: Display array
        displayArray(array);

        // step 5: Perform Linear Search to find index of search Value in array
        int indexOfSearchValue = linearSearchFindIndexOfSearchValue(array, searchValue);

        // step 6: Display index of search value in array
        displayIndexOfSearchValue(searchValue, indexOfSearchValue);
    }

    private static int inputArraySize() {
        System.out.println("Enter number of array: ");

        Scanner sc = new Scanner(System.in);
        // Loop until user input valid Positive integer
        while (true) {
            String inputUser = sc.nextLine();
            // Check if input user is empty
            if (inputUser.isEmpty()) {
                System.out.println("Input must not be empty. Enter again:");
            }
            // User input is number
            try {
                int num = Integer.parseInt(inputUser);
                // Check if input user is Positive integer
                if (num > 0) {
                    return num;
                } else {
                    System.out.println("Number must be greater than 0. Enter again:");
                }
            }
            // User input is not number
            catch (NumberFormatException e) {
                System.out.println("Input is not number. Enter again:");
            }

        }
    }

    private static int inputSearchValue() {
        System.out.println("Enter search value: ");

        Scanner sc = new Scanner(System.in);
        // Loop until user input valid Positive integer
        while (true) {
            String inputUser = sc.nextLine();
            // Check if input user is empty
            if (inputUser.isEmpty()) {
                System.out.println("Input must not be empty. Enter again:");
            }
            // User input is number
            try {
                int num = Integer.parseInt(inputUser);
                // Check if input user is Positive integer
                if (num > 0) {
                    return num;
                } else {
                    System.out.println("Number must be greater than 0. Enter again:");
                }
            }
            // User input is not number
            catch (NumberFormatException e) {
                System.out.println("Input is not number. Enter again:");
            }

        }
    }

    private static int[] generateRandomIntegerInArray(int sizeOfArray) {
        Random random = new Random();
        int[] array = new int[sizeOfArray];
        // Loop to fill value element in array
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = random.nextInt(sizeOfArray) + 1;
        }
        return array;
    }

    private static void displayArray(int array[]) {
        System.out.print("The array: [");

        // Loop to access each element in array from first to last
        for (int i = 0; i < array.length; i++) {
            // Check if element is last element in array to display "]"
            if (i == array.length - 1) {
                System.out.printf("%d]", array[i]);
            } else {
                System.out.printf("%d,", array[i]);
            }
        }
        System.out.println();
    }

    private static int linearSearchFindIndexOfSearchValue(int[] array, int searchValue) {
        // Loop access each element in array from first to last
        for (int i = 0; i < array.length; i++) {
            // Check if first element in array is equal to search value
            if (array[i] == searchValue) {
                return i;
            }
        }

        // Can't find index of SearchValue
        return -1;
    }

    private static void displayIndexOfSearchValue(int searchValue, int indexOfSearchValue) {
        // Check if search value is not found in array
        if (indexOfSearchValue == -1) {
            System.out.println("Can't found");
        } else {
            System.out.printf("Found %d at index: %d\n", searchValue, indexOfSearchValue);
        }
    }

}
