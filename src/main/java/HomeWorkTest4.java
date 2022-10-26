public class HomeWorkTest4 {
    public static void main(String[] args) {
        printD(10,0);
    }
    public static void printD (int num1, int num2) throws ArithmeticException{
        try {
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException error){
            System.out.println("Error operation"+error.getMessage());
        }


    }
}
