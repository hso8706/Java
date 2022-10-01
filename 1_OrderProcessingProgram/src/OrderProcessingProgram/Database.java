package OrderProcessingProgram;

public class Database {
    static int[] cntArr = new int[]{ 0, 0, 0, 0, 0};
    private static String[] listOfProduct = new String[]{ // 모든 객체가 공유해야하는 값.
            "등록 가능",
            "등록 가능",
            "등록 가능",
            "등록 가능",
            "등록 가능"
    };
    private static int[] quantityOFProduct = new int[]{ 0, 0, 0, 0, 0};
    public static String[] getListOfProduct() {
        return listOfProduct;
    }
    public static String getOneOfList(int num) {
        return listOfProduct[num];
    }
    public static void setOneOfList(int num, String listOfProduct) {
        Database.listOfProduct[num] = listOfProduct;
    }

    public static int getQuantityOFProduct(int num) {
        return quantityOFProduct[num];
    }

    public static void setQuantityOFProduct(int[] quantityOFProduct) {
        Database.quantityOFProduct = quantityOFProduct;
    }
}
