import java.util.Scanner;

class HomeWork2 {
    public static void main(String[] args) {
        double c1 = 0, c2 = 0;
        char simbol;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1-st digit");
        c1 = scanner.nextInt();
        System.out.println("Enter math.operation");
        simbol = scanner.next().charAt(0);
        System.out.println("Enter 2-st digit");
        c2 = scanner.nextInt();
        double result = 0;

        if (simbol == '+') {
            result = c1 + c2;
        }
        if (simbol == '-') {
            result = c1 - c2;
        }
        if (simbol == '*') {
            result = c1 * c2;
        }
        if (simbol == '/') {
            if (c2 != 0) {

                result = c1 / c2;
            } else {
                System.out.println("Деление на ноль не допустимая операция ");
            }

            if (simbol == '%') {
                result = c1 / c2 * 100;
            }

            System.out.println("Result = " + result);
        }
    }

}