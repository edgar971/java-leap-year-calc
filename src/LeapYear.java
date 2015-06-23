/**
 * Created by edgar971 on 6/22/15.
 */
public class LeapYear {
    //var to store year
    private int year;

    //constructor
    public LeapYear() {
        year = 0;
    }

    //with params
    public LeapYear(int inputYear) {
        year = inputYear;
    }

    //set the year
    public void setYear(int inputYear) {
        year = inputYear;
    }

    //return true of false for leap year
    public boolean isLeapYear() {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }


}
