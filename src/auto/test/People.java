package auto.test;

/**
 * @author dan.sarbei
 */
public class People {

    public int height = 10;
    public String name = "Default";

    public void say(String name) {

        System.out.println("Hello " + name);

    }

    public People() {
    }

    public People(int h, String n) {
        height = h;
        name = n;

    }

    public People(String n) {
        name = n;
    }
}
