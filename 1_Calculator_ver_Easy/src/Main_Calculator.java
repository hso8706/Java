import java.util.Scanner;

public class Main_Calculator {
    public static void main(String[] args) {
        System.out.println("=========Calculator=========");
        // 수도 코드 작성
        // 1. input1, input2, 그리고 연산자를 유저에게 입력받는다.
        // 1-1. input은 double형으로 입력받는다.
        // 1-1-1. 잘못된 입력을 할 시 오류메세지를 출력하고 재입력을 받는다.
        // 1-2. 연산자는 String형으로 입력받는다.
        // 1-2-1. 연산자는 네 가지로 한정한다: "+", "-", "*", "/"
        // 1-2-2. 잘못된 입력을 할 시 오류메세지를 출력하고 재입력을 받는다.
        // 2. 입력받은 세 가지 정보(input1, input2, 연산자)로 연산된 결과를 유저에게 출력한다.
        // 2-1. 출력 후 결과를 저장한다.(numResult)
        // 2-2. 추가 연산을 원하는지 유저에게 질문한다.(무한 반복)
        // 2-2-1. 추가 연산을 원할 시, 연산자와 숫자 하나(numN)를 입력받는다.
        // 2-2-2. 추가 연산 = 이전 결과 값(numResult) + 새로 입력받은 연산자(operN) + 새로 입력받은 숫자(numN)
        // 2-2-3. 추가 연산을 원하지 않을 시, n 또는 N으로 반복문(프로그램)을 종료한다.
        Scanner input = new Scanner(System.in);
        String calculatorEnd = "";

        UserInput_Calculator user = new UserInput_Calculator();
        double numResult = user.getUserNumber();
        do{
            String operN = user.getUserOperator();
            double numN = user.getUserNumber();
            System.out.printf("연산 결과 : %.2f\n", user.resultAfterOper(numN, numResult, operN));
            numResult = user.resultAfterOper(numN, numResult, operN);
            System.out.print("추가 연산을 하시겠습니까? ( Y / N ) : \n");
            calculatorEnd = input.next();
        }while(!calculatorEnd.equals("N") && !calculatorEnd.equals("n"));



    }
}
