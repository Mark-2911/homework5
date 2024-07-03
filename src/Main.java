public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        String msg = clientDeviceYear <= 2015 ? "облегченную " : " ";
        String os = clientOS == 1 ? "iOS" : "Android";
        if (clientOS == 1 || clientOS == 0) {
            System.out.println("Установите " + msg + " версию приложения для " + os + " по ссылке");
        }


        System.out.println("Задача 3");

        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 && year >= 1584 || year % 400 == 0) {
            System.out.println("год является высокосным");
        } else {
            System.out.println("год не является высокосным");
        }


        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int oneDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней для доставки: " + oneDay);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней для доставки: " + (oneDay + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней для доставки: " + (oneDay + 2));
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача 5");

        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Принадлежит к зимнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к осеннему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит с весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к летнему сезону");
                break;
            default:
                System.out.println("Ошибка");
        }









    }
}