import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 50),
                new Bogie("First Class", 24)
        );

        // Stream pipeline: map + reduce
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)   // Extract capacity
                .reduce(0, Integer::sum);  // Aggregate

        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}