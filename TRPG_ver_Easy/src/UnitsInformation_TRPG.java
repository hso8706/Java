public class UnitsInformation_TRPG {
    //1. 유닛명, 유닛공격력, 유닛방어력, 유닛체력 입력 받음
    //2. 유닛 정보를 출력함.
    private String unitName;
    int unitOffencePoint;
    int unitDefencePoint;
    int unitHealthPoint;

    //생성자2(유닛 정보 입력)
    UnitsInformation_TRPG(String unitName, String unitOffencePoint, String unitDefencePoint, String unitHealthPoint){
        this.unitName = unitName;
        this.unitOffencePoint = Integer.parseInt(unitOffencePoint);
        this.unitDefencePoint = Integer.parseInt(unitDefencePoint);
        this.unitHealthPoint = Integer.parseInt(unitHealthPoint);
    }
    //getter
    public UnitsInformation_TRPG getUnitsInformation(){
        return this;
    }
    //유닛 정보 출력
    public void printUnitsInformation(){
        System.out.printf("[유닛명] : %s\n", getUnitsInformation().unitName);
        System.out.printf("[공격력] : %d\n", getUnitsInformation().unitOffencePoint);
        System.out.printf("[방어력] : %d\n", getUnitsInformation().unitDefencePoint);
        System.out.printf("[체력] : %d\n", this.unitHealthPoint);
        System.out.println("========================================");
    }
}
