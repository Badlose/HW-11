import java.time.LocalDate;

public class Main {

    public static void checkLeapYear(int year) {

        if (year < 1584) {
            System.out.println("Проверка не требуется");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkPhoneOsVersion(int osDeveloper, int year) {
        int currentYear = LocalDate.now().getYear();

        if (osDeveloper >= 0 && osDeveloper <= 1) {

            if (osDeveloper == 1 && year < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (osDeveloper == 1 && year >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (osDeveloper == 0 && year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (osDeveloper == 0 && year >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Вы ввели неверный вариант Операционной системы. Попробуйте ещё раз");
        }
    }

    public static int calculationOfDeliveryDays(int distance) {
        int daysForDelivery = 0;

        if (distance <= 20) {
            daysForDelivery++;
        } else if (distance > 20 && distance <= 60) {
            daysForDelivery += 2;
        } else if (distance > 60 && distance <= 100) {
            daysForDelivery += 3;
        } else if (distance > 100) {
            daysForDelivery = -1;   //Выбрал "-1" для этой дистанции, т.к. так же сделал куратор в разборе этого ДЗ в прошлый раз
        }
        return daysForDelivery;
    }

    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int intForCheck = 2000;
        checkLeapYear(intForCheck);

        //Task 2
        System.out.println("Task 2");
        checkPhoneOsVersion(1, 2024);

        //Task 3
        System.out.println("Task 3");
        System.out.println(calculationOfDeliveryDays(101));
    }
}