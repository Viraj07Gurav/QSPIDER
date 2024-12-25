import java.util.*;

class countPositiveORnegativeNO {
    public static void count() {
        Scanner sc = new Scanner(System.in);
        int p_cnt = 0;  // Count of positive numbers
        int n_cnt = 0;  // Count of negative numbers
        int z_cnt = 0;  // Count of zeros
        int num;        // Variable to store user input

        // Prompt for the first input
        System.out.println("Enter any number (0 to stop):");
        num = sc.nextInt(); // Initialize num before entering the loop

        // Check if the first input is 0 and handle accordingly
        if (num == 0) {
            z_cnt++; // Increment zero count immediately if the first input is 0
        }

        while (num != 0) {   // Continue until 0 is entered
            if (num > 0) {
                p_cnt++;     // Increment positive count
            } else if (num < 0) {
                n_cnt++;     // Increment negative count
            }

            // Prompt for the next number
            System.out.println("Enter any number (0 to stop):");
            num = sc.nextInt(); // Read next input

            // Increment zero count if the input is 0
            if (num == 0) {
                // z_cnt++; // Increment zero count if the input is 0
                break;   // Exit the loop if the in put is 0
            }
        }

        // Display the counts
        System.out.println("POSITIVE NUM: " + p_cnt);
        System.out.println("NEGATIVE NUM: " + n_cnt);
        System.out.println("ZERO NUM: " + z_cnt);
    }

    public static void main(String[] args) {
        count(); // Call the count method
    }
}
