package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
            switch (day) {
                case 1 :
                    name = "monday";
                    break;
                case 2 :
                    name = "tuesday";
                    break;
                case 3 :
                    name = "wednesday";
                    break;
                case 4 :
                    name = "thursday";
                    break;
                case 5 :
                    name = "friday";
                    break;
                case 6 :
                    name = "saturday";
                    break;
                case 7 :
                    name = "sunday";
                    break;
                default :
                    name = "The number does not match the day of the week";
            }
        return name;
    }
}
