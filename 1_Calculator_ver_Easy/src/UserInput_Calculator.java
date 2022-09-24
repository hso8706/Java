import java.util.Scanner;

public class UserInput_Calculator {
    public double getUserNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하여 주십시오: ");
        return input.nextDouble();
    }

    public String getUserOperator() {
        Scanner input = new Scanner(System.in);
        System.out.print("연산자를 입력하여 주십시오: ");
        String userInputOper = input.next();
        if (userInputOper.equals("+") || userInputOper.equals("-") || userInputOper.equals("*") || userInputOper.equals("/"))
            return userInputOper;
        else {
            while (!userInputOper.equals("+") && !userInputOper.equals("-") && !userInputOper.equals("*") && !userInputOper.equals("/")) {
                System.out.println("올바른 연산자를 입력하여 주십시오 (예시: +, -, *, /) ");
                System.out.print("연산자를 입력하여 주십시오: ");
                userInputOper = input.next();
            }
            return userInputOper;
        }
    }

    public double resultAfterOper(double n1, double n2, String Operator) {
        switch (Operator) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
            case "/": return n1 / n2;
            default: return 8888888; // 에러 시, 임의 값
        }
    }
}
