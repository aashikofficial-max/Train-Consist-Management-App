public class TrainConsistManagementApp {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");   // ✅ valid

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");   // ❌ handled safely

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");        // ✅ valid

        System.out.println("Program continues...");
    }
}