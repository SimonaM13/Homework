package Task3;

import java.util.Scanner;

public class DayOfTheWeek {

    /*
    Условие:
    Напишете програма/ метод, която чете число от 1 до 7 в конзолата
    и на базата на това изписва в конзолата деня от седмицата във формат.
    */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please input number: ");
        int day = in.nextInt();
        System.out.println(getnameday(day));
    }

    public static String getnameday(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        return dayName;
    }
}