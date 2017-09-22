package booktest;

public class DogTestDrive {

    public static void main(String[] args) {

        Dog one = new Dog();
        one.name = "Griv";
        one.setSize(70);

        Dog two = new Dog();
        two.name = one.name;
        two.setSize(8);

        Dog thre = new Dog();
        thre.name = "Griv";
        thre.setSize(35);

        one.bark(1);
        two.bark(1);
        thre.bark(1);


        Dog testdrive= new Dog();
        testdrive.TestDrive(8,80);


    }

}
