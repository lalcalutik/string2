public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println(year + "  год — високосный год");
        }   else {
            System.out.println(year + "  год — не високосный год");
        }
    }


    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        checkTheYear(year);
    }


    public static void checkDevice(int clientOS, int clientDeviceYear)
    {
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
                } else {
                    System.out.println("«Установите версию приложения для iOS по ссылке»");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
                } else {
                    System.out.println("«Установите версию приложения для Android по ссылке»");
                }
                break;
            default:
                System.out.println("У Вашего устройства обнаружена неподдерживаемая OS");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int  clientOS = 0;
        int   clientDeviceYear = 2015;
        checkDevice(clientOS, clientDeviceYear);
    }

    public static void calculationDeliveryDays(int deliveryDistance) {
        int minimalDeliveryTime = 1;
        boolean distanceWithin20km = deliveryDistance < 20;
        boolean distanceBetween20And60km = deliveryDistance >=20 && deliveryDistance < 60;
        boolean distanceBetween60And100km = deliveryDistance >=60 && deliveryDistance <= 100;
        boolean distanceOver100km = deliveryDistance > 100;

        if (distanceWithin20km) {
            System.out.println("Потребуется дней: " + minimalDeliveryTime);
        } else if (distanceBetween20And60km) {
            System.out.println("Потребуется дней: " + (minimalDeliveryTime + 1));
        } else if (distanceBetween60And100km) {
            System.out.println("Потребуется дней: " + (minimalDeliveryTime + 2));
        } else if (distanceOver100km) {
            System.out.println("Доставки нет");
        }

    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        calculationDeliveryDays(deliveryDistance);
    }

}