public class leapyear {
    public static Boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
            return true;
        }

        else if (year % 400 == 0){
            System.out.println(year + " is a leap year");
            return true;
        }

        else {
            System.out.println(year + " is not a leap year");
            return false;
        }
    }
}