package experiments;

public class Employee extends Person{

    String company;

    public Employee(String name, String Surname, String company) {
        super(name, Surname);
        this.company =company;
    }
    public void work(){
        System.out.printf("%s %s works in %s\n", getName(), getSurname(), company);
    }

    @Override
    public void display(){
        //System.out.println("Name" +getName() +"Surname" +getSurname());
        super.display();
        System.out.printf("Works in %s\n" , company);
    }
}
