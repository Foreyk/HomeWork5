public class Main {
    public static void main(String[] args) {
//        task1_1();
//        task1_3();
//        task1_4();
//        task1_5();
//        task1_6();
//        task1_7();
        task1_8();


    }



    //Задание 1.1 и 1.2
    private static void task1_1() {
        byte clientOS = 1;
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке.");
        }

    }

    //Задание 1.3

    private static void task1_3() {
        int year = 1856;
        int scanYear = year % 4;
        if (scanYear == 0) {
            System.out.println(year + " год является високосным.");
        } else System.out.println(year + " год не является високосным.");
    }
    //Задание 1.4

    private static void task1_4() {
        int deliveryDistance = 95;
        int fastDeliveryDistance = 20;
        int addDayDistance = 40;
        double trueDeliveryDistance = deliveryDistance - fastDeliveryDistance;
        double timeDelivery = trueDeliveryDistance / addDayDistance;
        System.out.printf("Потребуется дней для доставки: %.0f", Math.ceil(timeDelivery) + 1);
    }
    private static void task1_5() {
        int monthNumber = -5;
        if (monthNumber > 0 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println(monthNumber + " месяц в году, принадлежит к сезону зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + " месяц в году, принадлежит к сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + " месяц в году, принадлежит к сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + " месяц в году, принадлежит к сезону осень.");
                    break;           }
        } else System.out.println("Ошибка: " + monthNumber + " месяца, не существует в году. Программа не может быть выполнена.");
    }

    //Задание 6
    private static void task1_6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);
        result = result * -1;
        System.out.println(result);
        result = result * -1;
        System.out.println(result);
    }
    //Задание 7
    private static void task1_7() {
        int a = 7;
        int b = 5;
        System.out.printf("До: \na = %d \nb = %d \n", a, b );
       a = a + b;
       b = a - b;
       a = a - b;
        System.out.printf("\nПосле:\na = %d \nb = %d", a, b );
    }
    //Задание 8
    private static void task1_8() {
        int a = 829;
        int b = a / 10 % 10;
        System.out.printf("Средняя цифра из числа: %d \nЦифра: %d", a, b);
    }
}
