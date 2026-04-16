import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method to perform Linear Search
    public static boolean searchBogie(String[] bogieIds, String searchKey) {
        for (int i = 0; i < bogieIds.length; i++) {
            // Equality comparison using equals()
            if (bogieIds[i].equals(searchKey)) {
                return true; // Early termination when match is found
            }
        }
        return false; // No match found after full traversal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of bogies
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        // Input search key
        System.out.print("Enter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Perform search
        boolean found = searchBogie(bogieIds, searchKey);

        // Output result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND in the consist.");
        }

        scanner.close();
    }
}