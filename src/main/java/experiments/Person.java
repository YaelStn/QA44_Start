package experiments;

public class Person {
    private String name;
    private String Surname;

    public Person(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void display(){
        System.out.println("Name:" +name + " " + "Surname:" + Surname + ".");
    }
}
