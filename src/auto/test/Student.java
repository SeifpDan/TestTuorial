package auto.test;

/**
 * @author dan.sarbei
 */
public class Student extends People {

    int cource = 1;

    public Student(int height, String name, int cource) {
        super(height, name);
        this.cource = cource;

    }

    void tell() {

        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(cource);
    }
}
