import java.util.Scanner;

public class dtr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[][] records = new String[31][4];
        String fullName, month;
        int days;

        // Input Employee Name and Month
        System.out.print("Enter Employee Name: ");
        fullName = inp.nextLine();

        System.out.print("Enter Month: ");
        month = inp.nextLine();

        System.out.print("Enter number of days (e.g., 31, 30): ");
        days = inp.nextInt();
        inp.nextLine(); // Consume newline

        // Input Time In/Out with simple validation
        for (int i = 0; i < days; i++) {
            System.out.println("\nDay " + (i + 1));
            records[i][0] = getTime(inp, "AM Time In (HH:MM): ");
            records[i][1] = getTime(inp, "AM Time Out (HH:MM): ");
            records[i][2] = getTime(inp, "PM Time In (HH:MM): ");
            records[i][3] = getTime(inp, "PM Time Out (HH:MM): ");
        }

        // Displaying the complete DTR in table format
        System.out.println("\nDTR for " + fullName + " - " + month);
        System.out.println("---------------------------------------------");
        System.out.printf("| %-5s | %-7s | %-7s | %-7s | %-7s |\n",
                          "Day", "AM In", "AM Out", "PM In", "PM Out");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < days; i++) {
            System.out.printf("| %-5d | %-7s | %-7s | %-7s | %-7s |\n",
                              (i + 1), records[i][0], records[i][1], records[i][2], records[i][3]);
        }

        System.out.println("---------------------------------------------");
        inp.close();
    }

    // Simple time input with re-scan if invalid
    public static String getTime(Scanner scanner, String message) {
        String time;
        while (true) {
            System.out.print(message);
            time = scanner.nextLine();

            // Very basic time validation (must have 5 characters like 08:00)
            if (time.length() == 5 && time.charAt(2) == ':') {
                return time;
            } else {
                System.out.println("Invalid time. Please use HH:MM.");

            }
        }
    }
}
