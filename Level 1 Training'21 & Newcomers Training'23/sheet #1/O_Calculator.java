import java.util.Scanner;

public class O_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        String[] tokens = expression.split("[+\\-*/]");

        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        char operator = expression.charAt(tokens[0].length());

        int result = 0;
        switch(operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }

        System.out.println(result);
    }
}