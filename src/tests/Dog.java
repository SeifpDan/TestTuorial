package tests;

/**
 * @author dan.sarbei
 */
public class Dog {

    String name;

    public static void main(String[] args) {
        Dog dogl = new Dog();
        dogl.bark();
        dogl.name = "Барт";
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dogl;
        myDogs[0].name = "Fre";
        myDogs[1].name = "Djorj";
        System.out.print("Numele ultimului  — ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;

        }
    }

    public void bark() {
        System.out.println(name + " a zis F!");
    }

    public void eat() {
    }
//public void chaseCat() { } 

}
