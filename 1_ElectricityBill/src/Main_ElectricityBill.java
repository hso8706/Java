import java.util.Scanner;

public class Main_ElectricityBill {
    public static void main(String[] args) {
        System.out.println("==============주택용(저압) 전기 요금 계산기==============");
        //1. 사용자 전력 사용량 입력받기
        //2. 전력 사용량에 따른 구간별 전기 요금 작성
        //3. 전기 요금 출력
        Scanner input = new Scanner(System.in);
        int electricityUsage = 0; // 전력 사용량 저장 변수.
        double electricityBill = 0; // 전기 요금 저장 변수.
        System.out.print("사용 전력 입력 : ");
        electricityUsage = input.nextInt();
        if(electricityUsage <= 100)
            electricityBill = electricityUsage * 60.7;
        else if(/*electricityUsage>100 && */electricityUsage<=200) // 100 초과의 범위를 주는 것이 무의미하다. 이미 위 조건에서 걸러지기 때문.
            electricityBill = (100 * 60.7) + (electricityUsage-100) * 125.9;
        else if(electricityUsage<=300)
            electricityBill = (100 * 60.7) + (100 * 125.9) +(electricityUsage-200) * 187.9;
        else if(electricityUsage<=400)
            electricityBill = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (electricityUsage-300) * 280.6;
        else if(electricityUsage<=500)
            electricityBill = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (100 * 280.6) + (electricityUsage-400) * 417.7;
        else{
            electricityBill = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (100 * 280.6) + (100 * 417.7) + (electricityUsage-400) * 670.6;
            System.out.println("전기를 아껴쓰실 필요가 있습니다...혹은 누전이 있는지 확인해보세요.");
        }
        System.out.println("전기 요금 : " + electricityBill);
    }
}
