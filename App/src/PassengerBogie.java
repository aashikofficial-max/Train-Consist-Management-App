public class PassengerBogie {

    private String bogieId;
    private String type; // Sleeper, AC Chair, First Class
    private int capacity;

    public PassengerBogie(String bogieId, String type, int capacity) {
        this.bogieId = bogieId;
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return bogieId + " (" + type + ") - Capacity: " + capacity;
    }
}