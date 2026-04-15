import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: Stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Utility method to print array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method (Console Flow)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();

        int[] capacities = new int[n];

        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        bubbleSort(capacities);

        System.out.println("Sorted Passenger Bogie Capacities:");
        display(capacities);

        sc.close();
    }
}