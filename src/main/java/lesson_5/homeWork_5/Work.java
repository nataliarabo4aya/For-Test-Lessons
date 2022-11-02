package lesson_5.homeWork_5;

public class Work {
    public static void main(String[] args) {
        DogcСlass dog = new DogcСlass("Cookie", 2, "White", 5);
        DogcСlass dogShort = new DogcСlass(5, "Gray");
        DogcСlass dogEmptyFields = new DogcСlass();

        System.out.println(dog.getColorDog());
        System.out.println(dog.getWeightDog());
        System.out.println(dog.getNameDog());
        System.out.println(dogShort.getAgeDog());
        dog.setWeightDog(4);
        System.out.println(dog.getWeightDog());
        dog.setAgeDog(26);
        System.out.println(dog.getAgeDog());
        System.out.println(dogShort.getColorDog());



    }
}
