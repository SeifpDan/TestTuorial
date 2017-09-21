package booktest;

public class Dog {

    int size;
    String name;

   public void bark(int n) {
        for (int i = 0; i < n; i++)
            if (size > 60) {
                System.out.println(name);
                System.out.println("Gav >>>\n");
            } else if (size > 14) {
                System.out.println(name);
                System.out.println("Gav >>>>>>>\n");

            } else {
                System.out.println(name);
                System.out.println("Gav >\n");
            }
    }

    void TestDrive(int x, int m){

        int z=x*m;
        System.out.println(z);

    }
}
