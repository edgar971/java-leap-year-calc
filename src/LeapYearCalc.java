import java.util.Scanner;

/**
 * Created by edgar971 on 6/22/15.
 */
public class LeapYearCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LeapYear leapCalc;
        int year;
        //ask for year
        System.out.print("Please Enter a Year: ");
        year = scan.nextInt();

        leapCalc = new LeapYear(year);

        //show results
        if (leapCalc.isLeapYear()) {
            System.out.println(Integer.toString(year) + " is a leap year!");
        } else {
            System.out.println(Integer.toString(year) + " is NOT a leap year!");
        }


    }
}
