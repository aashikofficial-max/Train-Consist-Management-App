import java.util.*;

public class TrainService {

    private List<PassengerBogie> bogies = new ArrayList<>();

    public void addPassengerBogie(String type, int capacity) {

        try {
            PassengerBogie bogie = new PassengerBogie(type, capacity);
            bogies.add(bogie);
            System.out.println("Bogie added successfully: " + type);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage()); // ✅ fixed
        }
    }

    public List<PassengerBogie> getBogies() {
        return bogies;
    }
}