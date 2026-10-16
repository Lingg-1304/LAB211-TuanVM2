/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j0051;

/**
 *
 * @author Lingg
 */
public class Calculator {

    static void normalCalculator() {
        System.out.println("----- Normal Calculator -----");
        Double memory = GetInput.inputNumber();
        // Infinite loop until user enter '='
        while(true){
            String operator = GetInput.inputOperator();
            Double num = GetInput.inputNumber();
            switch(operator){
                case "+":
                    memory += num;
                    System.out.println("Memory:" + memory);
                    break;
                case "-":
                    memory -= num;
                    System.out.println("Memory:" + memory);
                    break;
                case "*":
                    memory *= num;
                    System.out.println("Memory:" + memory);
                    break;
                case "/":
                    memory /= num;
                    System.out.println("Memory:" + memory);
                    break;
                case "^":
                    System.out.println("Memory:" + memory);
                    break;
                case "=":
                    System.out.println("Result:"+memory);
                    return;
            }
        }
    }

    static void BMICalculator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
