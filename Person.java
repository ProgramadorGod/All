public class Person {


    public String Name;
    public int Age;
    public String Adress;

    public Person(String Name, int Age, String Adress){
        this.Name = Name;
        this.Age = Age;
        this.Adress = Adress;


    }

    public static void main(String[] args){
        Person p = new Person("Luis", 8, "Calle xd");
        System.out.println("Name: " + p.Name);

    }
}
