package booktest;

public class DogTestDrive {

    public static void main(String[] args) {

        Dog one = new Dog();
        one.name = "Griv";
        one.size = 70;

        Dog two = new Dog();
        two.name = one.name;
        two.size = 8;

        Dog thre = new Dog();
        thre.name = "Griv";
        thre.size = 35;

        one.bark(1);
        two.bark(2);
        thre.bark(5);


    }

}
