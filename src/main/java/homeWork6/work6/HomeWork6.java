package homeWork6.work6;

import homeWork6.objects6.Cat6;

public class HomeWork6 {
    public static void main(String[] args) {
    Cat6 cat6 = new Cat6(false,"Meat",4,"Grey");
    Cat6 catShort = new Cat6("Red");
    //cat6.setColor("Black");
        System.out.println(cat6.getColor());
        System.out.println(catShort.getColor());


    }

}
