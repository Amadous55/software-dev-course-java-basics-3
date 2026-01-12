package org.example;

public class LoopExercises {

    // I want to return the sum of all numbers from 1 up to and including n
    public static int sum(int n) {

        // Initialize a variable to keep track of the total sum
        int total = 0;

        // Loop from 1 through n
        for (int i = 1; i <= n; i++) {

            // Add the current value of i to the total
            total += i;
        }

        // Return the final sum
        return total;
    }

    // I want to Return the sum of numbers starting at 1 and stops when an even number is reached
    public static int sumUntilEven(int n) {

        // This my variable to store the running total
        int total = 0;

        // Loop from 1 through n
        for (int i = 1; i <= n; i++) {

            // Add the current number to the total
            total += i;

            // Check if the current number is even
            if (i % 2 == 0) {

                // Stop the loop once an even number is reached
                break;
            }
        }

        // Return the total sum calculated
        return total;
    }
}
