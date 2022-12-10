import java.time.LocalDate;

public class Main {
    public static void separator() {
        System.out.println("--------------------");
    }
    public static void leapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println(year + " - високосный год");
        }
        else System.out.println(year + " - не високосный год");
    }

    public static void OS(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear && os == 0) System.out.println("Установите облегченную версию приложения для ios");
        else if (year == currentYear && os == 0) System.out.println("Установите обычную версию приложения для ios");
        if (year < currentYear && os == 1) System.out.println("Установите облегченную версию приложения для android");
        else if (year == currentYear && os == 1) System.out.println("Установите обычную версию приложения для android");
    }

    public static void deliveryDay(int km) {
        int day = 1;
        if (km < 20) System.out.println("Доставка " + day + " день");
        else if (km >= 20 && km < 60) {
            day += 1;
            System.out.println("Доставка " + day + " дня");
        } else if (km >= 60 && km < 100) {
            day += 2;
            System.out.println("Доставка " + day + " дня");
        }
    }

    public static void main(String[] args) {
        //task 1
        leapYear(2022);  //не високосный
        leapYear(1804);  //високосный
        separator();

        //task 2
        OS(0, 2020);
        OS(1, 2022);
        separator();

        //task 3
        deliveryDay(95);
    }
}