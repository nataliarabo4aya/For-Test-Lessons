package lesson_5.homeWork_5;

public class Dog_class {
    private String nameDog;
    private int ageDog;
    private String colorDog;
    private int weightDog;



    //конструктор с четирьмя параметрами
    public Dog_class(String nameDog, int ageDog, String colorDog, int weightDog) {
        this.nameDog = nameDog;
        this.ageDog = ageDog;
        this.colorDog = colorDog;
        this.weightDog = weightDog;
    }
//конструктор со значениями по умолчанию

    public Dog_class(int ageDog, String colorDog) {
        this.nameDog = nameDog;
        this.weightDog = weightDog;
        this.ageDog = 3;
        this.colorDog = "Black";
    }

    //констуктор которий не принимает никакие параметри

    public Dog_class() {
        System.out.println("Creating object of the class Dog.");

    }
//   public void printInfo(){
//     System.out.println("Creating object of the class Dog.");
//  }

    public String getNameDog() {
        return nameDog;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public String getColorDog() {
        return colorDog;
    }

    public int getWeightDog() {
        return weightDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public void setAgeDog(int ageDog) {
        if (ageDog >0 && ageDog < 25) {
            this.ageDog = ageDog;
        }
    }

    public void setColorDog(String colorDog) {
        this.colorDog = colorDog;
    }

    public void setWeightDog(int weightDog) {
        this.weightDog = weightDog;
    }
}

