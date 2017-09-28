package GetsSets;

public class MainClass {

    public static void main(String[] args) {

    Person ps=new Person();
    ps.setName("");
    ps.setSecname("Popescu");
    ps.setAge(5);
    ps.setMar(true);

        if (ps.getMar()==true){

            String stare=" castorit";
            System.out.println("Numele introdus este: " + ps.getName() + " "+ ps.getSecname() + " varsta "+ps.getAge() + stare);
        }





    }


}


