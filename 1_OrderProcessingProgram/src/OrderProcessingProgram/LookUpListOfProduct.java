package OrderProcessingProgram;

public class LookUpListOfProduct {

    public void listInformation(){
        System.out.println("[System] 현재 등록된 제품 목록 ▼");
        for (int i = 0; i < Database.getListOfProduct().length; i++) {
            System.out.println("> " + Database.getOneOfList(i) + " : " + Database.getQuantityOFProduct(i) + "개");
        }
        System.out.println("------------------------------");

    }
}
