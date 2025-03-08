import java.util.Scanner;

public class dtr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Month: ");
        String month = inp.nextLine();
        int Jan = 1;
/*  Tantan okay
        */

        
        System.out.print("Name: ");
        String fullName = inp.nextLine();

        /*  Asking for the number of days
        System.out.print("Enter number of working days: ");
        int Jan = inp.nextInt();
        */

        String[][] records = new String[Jan][4];
        for (int i = 0; i < Jan; i++) {
            System.out.println("Day " + (i + 1));
            System.out.print("AM In: ");
            records[i][0] = inp.nextLine();
            System.out.print("AM Out: ");
            records[i][1] = inp.nextLine();
            System.out.print("PM In: ");
            records[i][2] = inp.nextLine();
            System.out.print("PM Out: ");
            records[i][3] = inp.nextLine();
        }

        // Displaying the complete DTR
        System.out.println("\nDTR for " + fullName + " - " + month);
        System.out.println("--------------------------------------");
        System.out.println("         AM           PM");
        System.out.println("Day   In   Out     In   Out");
        System.out.println("--------------------------------------");
        for (int i = 0; i < Jan; i++) {
            System.out.printf("%2d   %4s  %4s  %4s  %4s\n", (i + 1), records[i][0], records[i][1], records[i][2], records[i][3]);
        }
        System.out.println("--------------------------------------");
        inp.close();
    }
}
