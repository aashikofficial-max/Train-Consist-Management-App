import java.util.Scanner;
import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainService service = new TrainService();

        System.out.print("Enter number of bogie types: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        service.sortBogieNames(bogieNames);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        sc.close();
    }
}