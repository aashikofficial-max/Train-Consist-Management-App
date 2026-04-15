public class TrainService {

    // Bubble Sort logic moved to service layer
    public void sortCapacities(int[] capacities) {
        if (capacities == null || capacities.length <= 1) {
            return; // Nothing to sort
        }

        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: Stop early if already sorted
            if (!swapped) {
                break;
            }
        }
    }
}