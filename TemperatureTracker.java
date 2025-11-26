import java.util.*;

public class TemperatureTracker {

    static int maxTemp(int[] temps) {
        int max = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > max) {
                max = temps[i];
            }
        }
        return max;
    }

    static int minTemp(int[] temps) {
        int min = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
            }
        }
        return min;
    }

    static void printDaysAboveAverage(int[] temps) {
        double sum = 0;
        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }

        double average = sum / temps.length;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                System.out.println("Day " + (i + 1) + " is above average.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] temps = new int[7];

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = input.nextInt();
        }

        int max = maxTemp(temps);
        int min = minTemp(temps);

        System.out.println("The max temperature for the week is: " + max);
        System.out.println("The min temperature for the week is: " + min);

        printDaysAboveAverage(temps);
    }
}
