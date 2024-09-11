package org.example;

public class NumberProcessor {

    // Method to process numbers and print results
    public static void processNumbers() {
        // Loop through numbers 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Check divisibility by 3 and 5 and print more descriptive messages
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - C (Divisible by both 3 and 5)");
            } else if (i % 3 == 0) {
                System.out.println(i + " - A (Divisible by 3)");
            } else if (i % 5 == 0) {
                System.out.println(i + " - B (Divisible by 5)");
            } else {
                System.out.println(i + " - Not divisible by 3 or 5");
            }
        }
    }
}
