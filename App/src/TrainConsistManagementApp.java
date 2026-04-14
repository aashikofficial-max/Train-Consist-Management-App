import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        TrainService service = new TrainService();

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", (i % 100)));
        }

        // 🔹 Loop Timing
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = service.filterWithLoop(bogies);
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 Stream Timing
        long startStream = System.nanoTime();
        List<Bogie> streamResult = service.filterWithStream(bogies);
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Output
        System.out.println("Loop Time: " + loopTime + " ns");
        System.out.println("Stream Time: " + streamTime + " ns");

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());
    }
}