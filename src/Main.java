import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        Days days = Days.valueOf(scanner.nextLine());
        switch (days){
            case MONDAY:
                days.MONDAY.metod();
                break;
            case TUSDAY:
                days.TUSDAY.metod();
                break;
            case WENSDAY:
                days.WENSDAY.metod();
                break;
            case FRIDAY:
                days.FRIDAY.metod();
                break;
            case SATURDAY:
                days.SATURDAY.metod();
                break;
            case SUNDAY:
                days.SUNDAY.metod();


        }
    }
}