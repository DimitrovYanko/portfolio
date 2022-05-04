import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        printMenu();
    }

    // Menu 
    public static void printMenu(){
        Scanner input = new Scanner(System.in);
        Boolean menuChecker = true;
        while (menuChecker) {
            System.out.println("\n========== Menu ==========");
            System.out.println("Adition      : 1");
            System.out.println("Substraction : 2");
            System.out.println("Multyplyig   : 3");
            System.out.println("Dividing     : 4");
            System.out.println("Exit         : 0");
            System.out.println("==========================");
            
            System.out.print("\nEnter your input: ");
            String userInput = input.nextLine();
            
            if (userInput.equals("1")) {
                integerOrDouble(input, 1);
            } else if (userInput.equals("2")) {
                integerOrDouble(input, 2);  
            } else if (userInput.equals("3")) {
                integerOrDouble(input, 3);  
            } else if (userInput.equals("4")) {
                integerOrDouble(input, 4);
            } else if (userInput.equals("0")) {
                System.out.println("\nThank you for trying the Application.");
                menuChecker = false;
            } else {
                input.nextLine();//CLEARING the scanner !!!!!!!!!!!!!!!!! das funktioniert teilweise
                System.out.println("INVALID INPUT");
            }
        }
    }
    // The Menu about Integer or Double and the options in them
    public static void integerOrDouble(Scanner input, int option){
        System.out.println("==============================");
        System.out.println("For Integer calculation: I");
        System.out.println("For Double calculation: D");
        System.out.println("==============================");
        System.out.print("\nEnter you input: ");
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("i")) {
            if (option == 1) {
                enterIntNumbers(input, 1);
            } else if (option == 2){
                enterIntNumbers(input, 2);
            } else if (option == 3) {
                enterIntNumbers(input, 3);
            } else if (option == 4) {
                enterIntNumbers(input, 4);
            } else {
                System.out.println("INVALID OPTION ERROR!");
            }
        } else if (userInput.equalsIgnoreCase("d")) {
            if (option == 1) {
                enterDoubleNumbers(input, 1);
            } else if (option == 2){
                enterDoubleNumbers(input, 2);
            } else if (option == 3) {
                enterDoubleNumbers(input, 3);
            } else if (option == 4) {
                enterDoubleNumbers(input, 4);
            } else {
                System.out.println("INVALID OPTION ERROR!");
            }
        } else {
            System.out.println("IVALID INPUT RETURNING TO MENU");
        }
        input.nextLine();//CLEARING the scanner !!!!!!!!!!!!!!!!!
    }
    //  THe Int Function
    public static void enterIntNumbers(Scanner input, int option) {
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();

        int result;
        if (option == 1) {
            result = adition(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is = " + result);
        } else if (option == 2){
            
            result = substraction(num1, num2);  
            System.out.println("The substraction of " + num1 + " and " + num2 + " is = " + result); 
        } else if (option == 3) {
            
            result = multiplying(num1, num2);  
            System.out.println("The multyplying of " + num1 + " and " + num2 + " is = " + result); 
        } else if (option == 4) {
            
            result = dividing(num1, num2);
            System.out.println("The dividing of " + num1 + " and " + num2 + " is = " + result); 
        } else {
            System.out.println("INVALID OPTION ERROR!");
        }
    }
    // The Double Function
    public static void enterDoubleNumbers(Scanner input, int i) {
        System.out.print("Please enter the first dNumber: ");
        double dNum1 = input.nextDouble();
        System.out.print("Please enter the second dNumber: ");
        double dNum2 = input.nextDouble();
        double dResult;
        if (i == 1) {
            dResult = adition(dNum1, dNum2);
            System.out.println("The sum of " + dNum1 + " and " + dNum2 + " is = " + dResult);
        } else if (i == 2){
            
            dResult = substraction(dNum1, dNum2);  
            System.out.println("The substraction of " + dNum1 + " and " + dNum2 + " is = " + dResult); 
        } else if (i == 3) {
            
            dResult = multiplying(dNum1, dNum2);  
            System.out.println("The multyplying of " + dNum1 + " and " + dNum2 + " is = " + dResult); 
        } else if (i == 4) {
            
            dResult = dividing(dNum1, dNum2);
            System.out.println("The dividing of " + dNum1 + " and " + dNum2 + " is = " + dResult); 
        } else {
            System.out.println("INVALID OPTION ERROR!");
        }
    }

    //----------- Methods for calculating the a and b ----------------
    public static int adition(int a, int b){
        int add = a + b;
        return add;
    }

    public static double adition(double a, double b){
        double add = a + b;
        return add;
    }

    public static int substraction(int a, int b) {
        int subs = a - b;
        return subs;
    }

    public static double substraction(double a, double b) {
        double subs = a - b;
        return subs;
    }

    public static int multiplying(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static double multiplying(double a, double b) {
        double multi = a * b;
        return multi;
    }

    public static int dividing(int a, int b) {
        int divide = a / b;
        return divide;
    }

    public static double dividing(double a, double b) {
        double divide = a / b;
        return divide;
    }



   

    


}