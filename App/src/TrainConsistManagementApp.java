import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain")
        );

        TrainService service = new TrainService();

        boolean isSafe = service.isSafetyCompliant(bogies);

        System.out.println("Safety Compliance: " +
                (isSafe ? "SAFE" : "UNSAFE"));
    }
}