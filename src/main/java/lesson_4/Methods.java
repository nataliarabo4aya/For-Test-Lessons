package lesson_4;

import java.util.Random;

public class Methods {
    private void publicMethod() {
        System.out.println("Public Method");
    }
    public static void division (int num1, int num2){
        try {
            int result = num1 / num2;
            System.out.println("Результат деления " +result);
        } catch (ArithmeticException error) {
            System.out.println("Деление на ноль недопустимая операция" + error.getMessage());
        }
    }
    public static void adding (int num1, int num2){
        int result = num1 + num2;
        System.out.println("Результат сложения " +result);
    }
    public static void substraction (int num1, int num2){
        int result = num1 - num2;
        System.out.println("Результат вичетания " +result);
    }
    public static void multiplying (int num1, int num2){
        int result = num1 * num2;
        System.out.println("Результат умножения " +result);
    }
    public static void persentage (double num1, double num2){
        double result = (num1 / num2)*100;
        System.out.println("Процент " +result);
    }

}
