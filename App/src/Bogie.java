public class Bogie {

    private String name;      // Sleeper, AC Chair, First Class, Rectangular, Cylindrical
    private String category;  // Passenger or Goods
    private int capacity;

    // Constructor
    public Bogie(String name, String category, int capacity) {
        this.name = name;
        this.category = category;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getCapacity() {
        return capacity;
    }

    // toString for printing
    @Override
    public String toString() {
        return "Bogie [name=" + name +
                ", category=" + category +
                ", capacity=" + capacity + "]";
    }

    public String getType() {
        return name;
    }
}