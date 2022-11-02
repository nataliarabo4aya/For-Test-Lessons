package lesson_5.homeWork_5;

public class Work {
    public static void main(String[] args) {
        Dog_class dog = new Dog_class("Cookie", 2, "White", 5);
        Dog_class dogShort = new Dog_class(5, "Gray");
        Dog_class dogEmtyFields = new Dog_class();

        System.out.println(dog.getColorDog());
        System.out.println(dog.getWeightDog());
        System.out.println(dog.getNameDog());
        System.out.println(dogShort.getAgeDog());
        dog.setWeightDog(4);
        System.out.println(dog.getWeightDog());
        dog.setAgeDog(26);
        System.out.println(dog.getAgeDog());
        System.out.println(dogShort.getColorDog());
       // dogEmtyFields.printInfo();
        //System.out.println(dogEmtyFields);


    }
}
