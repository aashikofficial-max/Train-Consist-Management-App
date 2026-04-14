import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TrainService service = new TrainService();

        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        if (service.isValidTrainId(trainId)) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (service.isValidCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }
    }
}