package exercises.exercise06_logic;

public class AgeCheck {
    public static void main(String[] args) {
        int age = 17;

        // Task: Fix the error by using '==' for comparison instead of '=' for assignment.
        if (age == 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are still a minor.");
        }
    }
}
