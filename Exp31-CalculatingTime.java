
		public class TimeCalculator {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        performTask();
        long endTime = System.currentTimeMillis();
        long e= endTime - startTime;
        System.out.println("Elapsed Time: " + e + " milliseconds");
    }
public static void performTask() {
        int k=0;
        for (int i = 0; i < 100; i++) {
            k=k+i;
        }
        System.out.println(k);
    }
}
