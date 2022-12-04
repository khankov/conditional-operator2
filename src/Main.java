public class Main {
    public static void main(String[] args) {
        //Задание1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Система не поддерживается");
        }

        //Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int years = 2015;
        int os = 0;
        int android = 1;
        if (os == 0 && years >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (os == 0 && years < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (android == 1 && years >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (android == 1 && years < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Система не поддерживается");
        }


        //Задание 3
        System.out.println();
        System.out.println("Задание 3");
            int year = 2020;
            if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) )  {
                System.out.println( "год високосный");
            }
            else {
                System.out.println( "год не високосный");
            }

        //Задание 4
        System.out.println();
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int a = 1;
        if (deliveryDistance >20 ){
            a++;
        } if (deliveryDistance > 60){
            a++;
        }
     if (deliveryDistance > 100){
        a++;
    }
        System.out.println("Потребуется дней на доставку = " + a);

        //Задание 5
        System.out.println();
        System.out.println("Задание 5");
        int month = 12;
        switch (month){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("ошибка");
                break;
        }
       /* другое решение
       int month = 10;
       if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        }
        else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        }
        else {
            System.out.println("ошибка");
        }*/

        }
}