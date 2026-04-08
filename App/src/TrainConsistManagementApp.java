import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 60));
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("First Class", "Passenger", 40));
        bogies.add(new Bogie("Rectangular", "Goods", 100));
        bogies.add(new Bogie("Cylindrical", "Goods", 80));

        // Step 2: Create service object
        TrainConsistService service = new TrainConsistService();

        // Step 3: Apply grouping
        Map<String, List<Bogie>> groupedBogies =
                service.groupBogiesByType(bogies);

        // Step 4: Display grouped result
        System.out.println("===== Grouped Bogies By Type =====");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

            System.out.println("\nType: " + entry.getKey());

            for (Bogie bogie : entry.getValue()) {
                System.out.println(bogie);
            }
        }
    }
}