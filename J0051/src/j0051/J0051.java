
package j0051;

import java.util.Scanner;

/**
 *
 * @author Lingg
 */
public class J0051 {

    public static void main(String[] args) {
        // Infinite loop until user choose exit program
        while(true){
            //Step 1: Display menu
            displayMenu();
            
            //Step 2: Enter an option
            int choice = enterAnOption();
            
            switch(choice){
                //Step 3: Display result normal calculator  
                case 1: 
                    Calculator.normalCalculator();
                    break;
                //Step 4: Display result BMI calculator
                case 2:
                    Calculator.BMICalculator();
                    break;
                //Step 5: Exit program
                case 3:
                    return;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
    }

    private static int enterAnOption() {
        System.out.println("Please choice one option:");
        
        Scanner sc = new Scanner(System.in);
        // Infinite loop 
        while(true){
            String input = sc.nextLine();
            // Check if input is empty
            if(input.isEmpty()){
                System.out.println("Input can't be empty!");
                continue;
            }
            try{
                int choice = Integer.parseInt(input);
                // Check if choice is in valid range
                if(choice >= 1 && choice <= 3){
                    return choice;
                }
                else{
                    System.out.println("Choice must be in range (1,3)!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Choice must be in range (1,3)!");
            }
        }
    }
    
}
