import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        demonstrateLeapYearCheck();
        demonstrateAppVersionSuggestion();
        demonstrateDeliveryDaysCalculation();
    }


    public static void demonstrateLeapYearCheck() {
        System.out.println("=== Проверка високосных годов ===");
        checkLeapYear(2020);
        checkLeapYear(2021);
        checkLeapYear(2000);
        checkLeapYear(1900);
        System.out.println();
    }

    public static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    public static void demonstrateAppVersionSuggestion() {
        System.out.println("=== Рекомендации по версии приложения ===");
        suggestAppVersion(0, 2014); // iOS, старый телефон
        suggestAppVersion(1, 2023); // Android, новый телефон
        suggestAppVersion(0, LocalDate.now().getYear()); // iOS, текущий год
        System.out.println();
    }

    public static void suggestAppVersion(int osType, int clientDeviceYear) {
        String osName = getOsName(osType);
        String version = getAppVersion(clientDeviceYear);

        System.out.println("Установите " + version + " версию приложения для " + osName + " по ссылке");
    }
    public static String getOsName(int osType) {
        return osType == 0 ? "iOS" : "Android";
    }

    public static String getAppVersion(int clientDeviceYear) {
        return clientDeviceYear < LocalDate.now().getYear() ? "облегченную" : "обычную";
    }

    public static void demonstrateDeliveryDaysCalculation() {
        System.out.println("=== Расчет дней доставки ===");
        printDeliveryDays(15);
        printDeliveryDays(35);
        printDeliveryDays(75);
        printDeliveryDays(105);
    }

    public static void printDeliveryDays(int deliveryDistance) {
        int days = calculateDeliveryDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка на расстояние " + deliveryDistance + " км невозможна");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}