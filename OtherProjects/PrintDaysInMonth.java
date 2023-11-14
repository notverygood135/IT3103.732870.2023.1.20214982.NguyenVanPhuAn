package OtherProjects;

import java.util.Scanner;

public class PrintDaysInMonth {
    public static void main(String[] args) {
        System.out.println("Nguyen Van Phu An - 20214982");
        Scanner scanner = new Scanner(System.in);
        int year;

        while (true) {
            System.out.print("Enter year: ");
            year = scanner.nextInt();
            if (year > 0) {
                break;
            } else {
                System.out.println("Invalid year");
            }
        }

        int month;
        while (true) {
            System.out.print("Enter a month (e.g., January, Jan., Jan, 1): ");
            String monthStr = scanner.next().toLowerCase();

            month = switch (monthStr) {
                case "january", "jan.", "jan", "1" -> 1;
                case "february", "feb.", "feb", "2" -> 2;
                case "march", "mar.", "mar", "3" -> 3;
                case "april", "apr.", "apr", "4" -> 4;
                case "may", "5" -> 5;
                case "june", "jun.", "jun", "6" -> 6;
                case "july", "jul.", "jul", "7" -> 7;
                case "august", "aug.", "aug", "8" -> 8;
                case "september", "sep.", "sep", "9" -> 9;
                case "october", "oct.", "oct", "10" -> 10;
                case "november", "nov.", "nov", "11" -> 11;
                case "december", "dec.", "dec", "12" -> 12;
                default -> 0;
            };

            if (month >= 1 && month <= 12) {
                break;
            } else {
                System.out.println("Invalid month");
            }
        }

        int daysInMonth;

        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }

        System.out.println("There are " + daysInMonth + " days in month " + month + " of year " + year);
    }
}
