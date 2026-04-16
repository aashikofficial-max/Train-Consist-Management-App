import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TrainService service = new TrainService();

        // Input number of bogies
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Create array
        String[] bogieIds = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        // Input search key
        System.out.print("Enter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Call Binary Search service
        boolean found = service.binarySearchBogie(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND in the consist.");
        }

        scanner.close();
    }
}