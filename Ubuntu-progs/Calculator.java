import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value:");
        int num1 = sc.nextInt();

        System.out.println("Enter the operator (+,-,*,/):");
        char operator = sc.next().charAt(0);

        System.out.println("Enter second value:");
        int num2 = sc.nextInt();

        int result;

        switch (operator) {
            case '+' :
                result = num1 + num2;
                System.out.println("Result" + result);
                break;
            
            case '-' :
                result = num1 - num2;
                System.out.println("Result" + result);
                break;

            case '*' :
                result = num1 * num2;
                System.out.println("Result" + result);
                break;
                
            case '/' :
                if(num2 !=0 ){
                result = num1 / num2;
                System.out.println("Result" + result);
                }
                else {
                    System.out.println("Error!!! Cannot divide by 0");
                }
                break;

            default:
                System.out.println("Invalid operator!!! ");    
        }

    sc.close();
    }
}
