import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main_VisitorPrediction {
    public static void main(String[] args) {
        System.out.println("=============방문자 수 예측 프로그램 V4=============");
        //V1, V2, V3의 기능을 섞어 V4 프로그램 제작
        //1. 인공지능의 독립 변수 생성(찾았다는 가정하에 랜던 변수 생성)
        //2. 유저에게 방문자 수 제공(입력)받기.
        //3. 인공지능 예측값 제공 (유저 제공값, 인공지능 변수 이용)
        //4. 각 데이터의 오차, 오차의 제곱 출력
        //5. 프로그램 성능 출력(오차의 제곱의 합)

        Scanner input = new Scanner(System.in);

        Random arandomAI = new Random(); // Random 클래스 이용, 시스템 시간을 이용하는 인스턴스 생성.
        Random brandomAI = new Random(); // Random 클래스 이용, 시스템 시간을 이용하는 인스턴스 생성.
        double aFactorAI = arandomAI.nextDouble()+1; // 1<= x <1+1
        double bFactorAI = brandomAI.nextDouble(); // 0<= x <1
        double result = 0; // 프로그램 성능 데이터 저장 변수.
        double[] userVisitor = new double[0];   //  유저 방문자 데이터 저장 배열.
        double[] preVisitor = new double[0];    // AI 예측 방문자 데이터 저장 배열.
        double[] error = new double[0];    // 유저 방문자 데이터와 AI 예측 방문자 데이터의 오차 저장 배열.

        for (int i = 0; i < 4; i++) {
            userVisitor = Arrays.copyOf(userVisitor, userVisitor.length + 1);
            preVisitor = Arrays.copyOf(preVisitor, preVisitor.length + 1);
            error = Arrays.copyOf(error, error.length + 1);
            System.out.printf("%d번 째 데이터) [실제값] 웹 페이지 방문자 수 입력 : ", i);
            userVisitor[i] = input.nextDouble();
            preVisitor[i] = (aFactorAI/bFactorAI)*userVisitor[i]; // AI 계산식(임의로 설정함; 광고값 빼고 싶어서.)
            error[i] = preVisitor[i] - userVisitor[i];
            result += error[i]*error[i];
        }
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번 째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f [인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n",i, userVisitor[i], preVisitor[i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.printf("[%d번 째 데이터] 실제 값과 예측값의 오차 : %.1f\n", i, error[i]);
            System.out.printf("[안내] 해당 데이터의 오차의 제곱 : %.2f\n", error[i]*error[i]);
        }

        System.out.println("===============================");
        System.out.printf("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : %.2f", result);
    }
}
