package homeWork6.objects6;

public class Cat6 extends Animal6 {
    private String color;


//геттери и сеттери
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//конструктори
    //1-ий принимает все парамтери:
    public Cat6(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat6(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "Spotted";
    }
}
