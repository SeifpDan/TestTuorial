package booktest;

public class Dog {

    private int size;

 int getSize(){

      return size;
  }

  public void setSize(int s){

      size = s;

  }

    String name;

   public void bark(int n) {
        for (int i = 0; i < n; i++)
            if (size > 60) {
                System.out.println(name);
                System.out.println("Gav >>>");
            } else if (size > 14) {
                System.out.println(name);
                System.out.println("Gav >>>>>>>");

            } else {
                System.out.println(name);
                System.out.println("Gav >");
            }
    }

    void TestDrive(int x, int m){

        int z=x*m;
        System.out.println(z);

    }
}
