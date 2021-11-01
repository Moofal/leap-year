public class Year {

    private static boolean divisibleBy400(int year){
        return year % 400 == 0;
    }

    private static boolean divisibleBy4Not100(int year){
        return year % 4 == 0 && year % 100 != 0;
    }

    private static boolean notDivisibleBy4(int year){
        return year % 4 != 0;
    }

    private static boolean divisibleBy100Not400(int year){
        return year % 100 == 0 && year % 400 != 0;
    }

    public static boolean isLeapYear(int year){
        if(divisibleBy400(year) || divisibleBy4Not100(year)) {
            return true;
        }
        if(notDivisibleBy4(year) || divisibleBy100Not400(year)) {
            return false;
        }
        return false;
    }
}
