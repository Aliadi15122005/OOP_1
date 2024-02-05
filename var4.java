import java.util.Scanner;

public class var4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение х: ");
        double x = input.nextDouble();

        System.out.println("Введите значение a: ");
        double a = input.nextDouble();

        System.out.println("Введите значение b: ");
        double b = input.nextDouble();

        System.out.println("Введите значение c: ");
        double c = input.nextDouble();

        double sinResult = Math.sin(x);
        double cosResult = Math.cos(c * Math.pow(x, 2));

        // Проверяем, чтобы аргументы не приводили к неопределенному результату
        if (sinResult > 0 && a > 0) {
            double y = Math.log(a * sinResult) + b * cosResult;
            System.out.println("Значение функции Y - f() равно: " + y);
        } else {
            System.out.println("Некорректные значения для выполнения вычислений.");
        }
    }
}