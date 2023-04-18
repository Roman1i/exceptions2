import java.util.Scanner;

public class Program {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        echo();
     }

     
    /*
     * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public static void _float() {
        while(true) {
            System.out.println("Введите число типа float");
            if (sc.hasNextFloat()){
                System.out.println("Ваше число: " + sc.nextFloat());
                return;
            }
            else {
                sc.nextLine();
            }

        }
    }


    //2. Если необходимо, исправьте данный код

    /* 
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d; // инициализировать массив
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     } catch (IndexOutOfBoundsException e) { // выход за пределы массива
        System.out.println("Catching exception: " + e);
    }
    */


    //2.1 Если необходимо, исправьте данный код

    /*
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (Throwable ex) { // Выставить исключения в обратном порядке иерархии 
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) { // убрать отлавдивание исключения FileNotFound
        System.out.println(a + b);
    }
    */

    /*
    2.2 Разработайте программу, которая выбросит Exception, 
    когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, 
    что пустые строки вводить нельзя.
    */

    public static void echo(){
        while(true) {
            try {
                System.out.println("Введите строку...");
                String input = sc.nextLine();
                String answer = null;
                if (!input.equals(""))
                    answer = input;
                System.out.println(answer.toString());
            }
            catch (NullPointerException e) {
                System.out.println("Пустые строки вводить нельзя");
            }
        }
    }

}
