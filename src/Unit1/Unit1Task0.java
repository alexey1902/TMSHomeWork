package Unit1;

public class Unit1Task0 {
    public static void main(String[] args){
        int month = 6;
        int day = 1;
        System.out.println("month + day = " + (month+day));
        System.out.println("month - day = " + (month-day));
        System.out.println("month % day = " + (month%day));
        System.out.println("month * day = " + (month*day));
        System.out.println("month / day = " + (month/day));
        System.out.println("month += day = "+ (month+=day)); month = 6;
        System.out.println("month -= day = "+ (month-=day)); month = 6;
        System.out.println("month %= day = "+ (month%=day)); month = 6;
        System.out.println("month *= day = "+ (month*=day)); month = 6;
        System.out.println("month++ = " + ++month);          month = 6;
        System.out.println("month-- = " + --month);          month = 6;

        System.out.println("month | day = " + (month|day));
        System.out.println("month & day = " + (month&day));
        System.out.println("month ^ day = " + (month^day));
        System.out.println("month >> day = " + (month>>day));
        System.out.println("month >>= day = " + (month>>=day));
        System.out.println("month >>> day = " + (month>>>day));
        System.out.println("month >>>= day = " + (month>>>=day));
        System.out.println("month << day = " + (month<<day));
        System.out.println("month <<= day = " + (month<<=day));
        System.out.println("month |= day = "+ (month|=day));
        System.out.println("month &= day = "+ (month&=day));
        System.out.println("month ^= day = "+ (month^=day));
        System.out.println("month *= day = "+ (month*=day));

        System.out.println("month < day = "  +  (month<day));
        System.out.println("month > day = "  +  (month>day));
        System.out.println("month == day = " + (month==day));
        System.out.println("month >= day = " + (month>=day));
        System.out.println("month <= day = " + (month<=day));
        System.out.println("month != day = " + (month!=day));
        boolean month2 = false;
        boolean day2 = true;
        System.out.println("month2 || day2 = " + (month2||day2));
        System.out.println("month2 & day2 = " + (month2&day2));
    }
}