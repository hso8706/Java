package OrderProcessingProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Item_Storage_V3]");
        System.out.println("------------------------------");
        System.out.println("[System] 코드스테이츠 점장님 어서오세요.");
        System.out.println("[System] 해당 프로그램의 기능입니다.");

        RegistrationOfProduct registrationOfProduct = new RegistrationOfProduct();
        Cancel_RegistrationOfProduct cancel_registrationOfProduct = new Cancel_RegistrationOfProduct();
        ArrivalOfProduct arrivalOfProduct = new ArrivalOfProduct();
        ReleaseOfProduct releaseOfProduct = new ReleaseOfProduct();
        LookUpListOfProduct lookUpListOfProduct = new LookUpListOfProduct();

        Outer: while(true){
            systemPrint();
            switch (userInput()){
                case 1:
                    registrationOfProduct.registration();
                    lookUpListOfProduct.listInformation();
                    break;
                case 2:
                    cancel_registrationOfProduct.cancelRegistration();
                    lookUpListOfProduct.listInformation();
                    break;
                case 3:;
                case 4:;
                case 5:
                    lookUpListOfProduct.listInformation();
                    break;
                case 6: break Outer;
            }
        }
    }

    public static int userInput(){
        Scanner input = new Scanner(System.in);
        int userInputNum = input.nextInt();
        while (userInputNum < 1 || userInputNum > 6){
            System.out.print("[System] 잘못된 입력입니다. 다시 번호를 입력하여 주십시오 : ");
            userInputNum = input.nextInt();
        }
        return userInputNum;
    }

    public static void systemPrint(){
        System.out.println("1. 물건 정보(제품명) 등록하기");
        System.out.println("2. 물건 정보(제품명) 등록 취소하기");
        System.out.println("3. 물건 넣기 (제품 입고)");
        System.out.println("4. 물건 빼기 (제품 출고)");
        System.out.println("5. 재고 조회");
        System.out.println("6. 프로그램 종료");
        System.out.println("------------------------------");
        System.out.print("[System] 원하는 기능의 번호를 입력하세요 : ");
    }
}
