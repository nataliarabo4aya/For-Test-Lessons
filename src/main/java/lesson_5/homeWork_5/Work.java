package lesson_5.homeWork_5;

public class Work {
    public static void main(String[] args) {
        DogСlass dog = new DogСlass("Cookie", 2, "White", 5);
        DogСlass dogShort = new DogСlass(5, "Gray");
        DogСlass dogEmptyFields = new DogСlass();

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
