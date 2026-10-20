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
    
    private enum Operator {
        PLUS,       // +
        MINUS,      // -
        MULTIPLY,   // *
        DIVIDE,     // /
        POWER,      // ^
        EQUALS      // =
    }
    
    static void normalCalculator() {
        System.out.println("----- Normal Calculator -----");
        float memory = enterNumber();
        // Infinite loop
        while (true) {
            Operator operator = enterOperator();
            float number;
            switch (operator) {
                case PLUS:
                    number = enterNumber();
                    memory += number;
                    System.out.printf("Memory:%.1f\n", memory);
                    break;
                case MINUS:
                    number = enterNumber();
                    memory -= number;
                    System.out.printf("Memory:%.1f\n", memory);
                    break;
                case MULTIPLY:
                    number = enterNumber();
                    memory *= number;
                    System.out.printf("Memory:%.1f\n", memory);
                    break;
                case DIVIDE:
                    //Infinite loop
                    while(true){
                        number = enterNumber();
                        //Check if valid number
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
                case POWER:
                    number = enterNumber();
                    memory = (float)Math.pow(memory, number);
                    System.out.printf("Memory:%.1f\n", memory);
                    break;
                case EQUALS:
                    System.out.printf("Result:%.1f\n", memory);
                    return;
            }
        }
    }

    private static float enterNumber() {
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
                float number = Float.parseFloat(input);
                return number;
            }catch(NumberFormatException e){
                System.out.println("Input must be numeric data!");
            }
        }
    }
    
    private static Operator enterOperator() {
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
            
            Operator operator = checkOperator(input);
            // Check if operator is valid
            if(operator != null){
                return operator;
            }
            else{
                System.out.println("Please input (+, -, *, /, ^)");
            }
        }
    }
    
    private static Operator checkOperator(String operator) {
        switch(operator){
            case "+":
                return Operator.PLUS;
            case "-":
                return Operator.MINUS;
            case "*":
                return Operator.MULTIPLY;
            case "/":
                return Operator.DIVIDE;
            case "^":
                return Operator.POWER;
            case "=":
                return Operator.EQUALS;
            default:
                return null;
        }
    }
    
    static void BMICalculator() {
        float weight = enterWeight();
        float height = (float)enterHeight()/100;
        float BMI = (float)weight/(height*height);
        
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

    private static float enterWeight() {
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
                float number = Float.parseFloat(input);
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
                float number = Float.parseFloat(input);
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
