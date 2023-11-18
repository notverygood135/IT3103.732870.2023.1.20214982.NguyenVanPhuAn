package OtherProjects;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        System.out.println("Nguyen Van Phu An - 20214982");
        double[] numbers = {591, 2596, 4, 300.5, 2012};

        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
