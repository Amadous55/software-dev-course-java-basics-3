package org.example;

public class ConditionalExercises {

    //i want to Check if the given number is less than 5
    public static boolean lessThanFive(int number) {

        // Return true if number is less than 5, otherwise false
        return number < 5;
    }

    // Determines the age group based on the given age
    public static String getAgeGroup(int age) {

        // If age is between 0 and 12 return "Child/scrub"
        if (age >= 0 && age <= 12) {
            return "Child";

            // If age is between 13 and 19, return "Teen or get your weight up!"
        } else if (age <= 19) {
            return "Teen";

            // If age is between 20 and 64, return "Adult or unc"
        } else if (age <= 64) {
            return "Adult";

            // If age is 65 or older, return "Super unc"
        } else {
            return "Senior";
        }
    }

    // Checks whether a password meets the minimum length requirement
    public static boolean isValidPassword(String password) {
        return false;
    }
}