package Java_8;

import java.util.Arrays;

public class LazySingleton {
    // 1. Declare the instance as volatile (solves the visibility problem)
    private static volatile LazySingleton instance;

    // 2. Private constructor
    private LazySingleton() {
        System.out.println("Lazy instance created.");
    }

    // 3. Public accessor with Double-Checked Locking
    public static LazySingleton getInstance() {
        // Check 1: If it exists, return it immediately without locking
        if (instance == null) {
            // Lock the class only for the first thread that gets here
            synchronized (LazySingleton.class) {
                // Check 2: Check again to ensure another thread didn't create it 
                // while this thread was waiting for the lock
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // Test the LazySingleton
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        System.out.println("Are both instances the same? " + (s1 == s2));
    }
}
