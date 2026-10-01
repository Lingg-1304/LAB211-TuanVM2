/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j006;

import java.util.Scanner;

/**
 *
 * @author Lingg
 */
public class Validation {

    public static int inputInteger(String promptUsers) {
        System.out.println(promptUsers);
        
        Scanner sc = new Scanner(System.in);
        
        // while loop continue if input users is not valid
        while(true){
            String inputUsers = sc.nextLine();
            try{
                int number = Integer.parseInt(inputUsers);
                // If input is negative number, user must be enter again
                if(number < 0){
                    System.out.println(": ");
                }
                else{
                    return number;
                }
            }
            // Input is not integer
            catch(NumberFormatException e){
                System.out.println("Enter again");
            }
        }  
    }
    
}
