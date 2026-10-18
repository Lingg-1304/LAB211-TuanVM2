/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j0051;

import java.util.Scanner;

/**
 *
 * @author Lingg
 */
public class Calculator {

    static void normalCalculator() {
        System.out.println("----- Normal Calculator -----");
        Double memory = enterNumber();
        // Infinite loop until user enter '='
        while (true) {
            String operator = enterOperator();
            double number;
            switch (operator) {
                case "+":
                    number = enterNumber();
                    memory += number;
                    System.out.printf("Memory:%.1f\n", memory);
                    break;
                case "-":
                    number = enterNumber();
                    memory -= number;
                    System.out.printf("Memory:%.1f\n", memory);
                    break;
                case "*":
                    number = enterNumber();
                    memory *= number;
                    System.out.printf("Memory:%.1f\n", memory);
                    break;
                case "/":
                    //Infinite loop
                    while(true){
                        number = enterNumber();
                        //Check if valid arithmetic
                        if(number == 0.0){
                            System.out.println("Can't divide by 0!");
                        }
                        else{
                            memory /= number;
                            System.out.printf("Memory:%.1f\n", memory);
                            break;
                        }
                    }
                    break;
                case "^":
                    number = enterNumber();
                    memory = Math.pow(memory, number);
                    System.out.printf("Memory:%.1f\n", memory);
                    break;
                case "=":
                    System.out.printf("Result:%.1f\n", memory);
                    return;
            }
        }
    }

    private static Double enterNumber() {
        Scanner sc = new Scanner(System.in);
        
        //Infinite loop
        while(true){
            System.out.print("Enter number: ");
            String input = sc.nextLine();
            //Check if input is empty
            if(input.isEmpty()){
                System.out.println("Input must not be empty!");
                continue;
            }
            try{
                double number = Double.parseDouble(input);
                return number;
            }catch(NumberFormatException e){
                System.out.println("Input must be numeric data!");
            }
        }
    }

    private static String enterOperator() {
        Scanner sc = new Scanner(System.in);
        
        //Infinite loop
        while(true){
            System.out.print("Enter Operator: ");
            String input = sc.nextLine();
            //Check if input is empty
            if(input.isEmpty()){
                System.out.println("Input must not be empty!");
                continue;
            }
            //Check if input is valid operator
            if    (input.equals("+") || input.equals("-") 
                || input.equals("*") || input.equals("/") 
                || input.equals("^") || input.equals("=")){
                return input;
            }
            else{
                System.out.println("Please enter (+, -, *, /, ^)");
            }
        }
    }
    
    static void BMICalculator() {
        double weight = enterWeight();
        double height = enterHeight()/100;
        double BMI = (double)weight/(height*height);
        
        System.out.printf("BMI number: %.2f\n", BMI);
        System.out.print("BMI Status: ");
        
        // Check if BMI is Under-standard
        if(BMI < 19.0){
            System.out.println("UNDER STANDARD");
        }
        //check if BMI is standard
        else if(BMI >= 19.0 && BMI < 25.0){
            System.out.println("STANDARD");
        }
        // check if BMI is overweight
        else if(BMI >= 25.0 && BMI < 30.0){
            System.out.println("OVERWEIGHT");
        }
        // check if BMI is Fat
        else if(BMI >= 30.0 && BMI < 40.0){
            System.out.println("FAT - should lose weight ");
        }
        // check if BMI is very fat
        else{
            System.out.println("VREY FAT - should lose weight immediately");
        }
    }

    private static double enterWeight() {
        Scanner sc = new Scanner(System.in);
        
        //Infinite loop
        while(true){
            System.out.print("Enter Weight(kg): ");
            String input = sc.nextLine();
            //Check if input is empty
            if(input.isEmpty()){
                System.out.println("Input must not be empty!");
                continue;
            }
            try{
                double number = Double.parseDouble(input);
                //Check if number is positive
                if(number > 0) return number;
                else{
                    System.out.println("Value must be greater than 0!");
                }
            }catch(NumberFormatException e){
                System.out.println("BMI is digit");
            }
        }        
    }

    private static double enterHeight() {
        Scanner sc = new Scanner(System.in);
        
        //Infinite loop
        while(true){
            System.out.print("Enter Height(cm): ");
            String input = sc.nextLine();
            //Check if input is empty
            if(input.isEmpty()){
                System.out.println("Input must not be empty!");
                continue;
            }
            try{
                double number = Double.parseDouble(input);
                //Check if number is positive
                if(number > 0) return number;
                else{
                    System.out.println("Value must be greater than 0!");
                }
            }catch(NumberFormatException e){
                System.out.println("BMI is digit");
            }
        }     
    }

}
