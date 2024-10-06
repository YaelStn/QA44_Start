package experiments;

import net.bytebuddy.pool.TypePool;

public class Program {
    public static void main(String[] args) {

        Person Tom = new Person("Tom", "Wais");
        Tom.display();

        Employee Sam = new Employee("Sam","Black", "Apple");
        Sam.display();
        Sam.work();


    }
}
