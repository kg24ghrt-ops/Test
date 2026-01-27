public class App {
    public static void main(String[] args) {
        System.out.println("=== Java 21 Environment Check ===\n");

        // 1. Java version
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java home: " + System.getProperty("java.home") + "\n");

        // 2. JVM info
        System.out.println("JVM name: " + System.getProperty("java.vm.name"));
        System.out.println("JVM version: " + System.getProperty("java.vm.version"));
        System.out.println("JVM vendor: " + System.getProperty("java.vm.vendor") + "\n");

        // 3. Available processors and memory
        int processors = Runtime.getRuntime().availableProcessors();
        long maxMemory = Runtime.getRuntime().maxMemory() / (1024 * 1024); // MB
        long freeMemory = Runtime.getRuntime().freeMemory() / (1024 * 1024); // MB
        long totalMemory = Runtime.getRuntime().totalMemory() / (1024 * 1024); // MB

        System.out.println("Available processors: " + processors);
        System.out.println("JVM memory (max/total/free in MB): " + maxMemory + " / " + totalMemory + " / " + freeMemory + "\n");

        // 4. Simple string test (no preview features)
        String test = "Hello";
        String result;
        if (test != null && test.length() > 0) {
            result = "Non-empty string, length = " + test.length();
        } else {
            result = "Unknown";
        }
        System.out.println("String test: " + result);

        // 5. Simple arithmetic test
        int a = 10;
        int b = 20;
        System.out.println("Simple arithmetic test (10 + 20): " + (a + b));

        System.out.println("\n=== Java 21 Check Complete ===");
    }
}