public class GoodsBogie {

    private String shape;   // Rectangular / Cylindrical
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {
            // 🚨 Safety Rule
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Petroleum cannot be assigned to Rectangular bogie"
                );
            }

            // ✅ Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public String getShape() {
        return shape;
    }
}