public class homeWork3 {
    public static void main(String[] args) {

        int[] massive = new int[]{1, 4, 3, 4, 115, 6, 7, 88, 99, 2, 24, 46, 32, 29, 24, 41, 11, 22, 33, 65};//создать масси типа int из 20 елементов.
        int sum = 0;
        for (int i : massive) {
            if (i > 5 && i < 45) {
                sum = sum + i;
                System.out.println(i);// вивести все числа в диапазоне от 5 до 45 и посчитать их сумму
            }
        }
        System.out.println("Summa = " + sum);
        for (int i : massive) {
            if (i > 0 && i % 2 == 0) {
                System.out.println("Четное число "+i);// вывести в консоль все четные положительные числа.
            }
        }
    }
}

//int [] massive=new int[20];
//        Random random=new Random();
//        for (int i=0;i<20;i++){
//            massive[i]=random.nextInt(50);
//        }