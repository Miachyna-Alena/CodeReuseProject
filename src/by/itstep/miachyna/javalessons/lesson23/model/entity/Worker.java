package by.itstep.miachyna.javalessons.lesson23.model.entity;

public class Worker extends Human {
    private double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary, boolean alive) {
        super(name, age, alive);

//        this.name = name;
//        this.age = age;
//        this.alive = alive;

//        setName(name);
//        setAge(age);
//        setAlive(alive);

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
//        return "Worker: " + name
//                + "\nAge: " + age
//                + "\nSalary: " + salary
//                + "\nIs he/she alive? --> " + (alive ? "YES" : "NO")
//                + "\n";
//        return "Worker: " + getName()
//                + "\nAge: " + getAge()
//                + "\nSalary: " + salary
//                + "\nIs he/she alive? --> " + (isAlive() ? "YES" : "NO")
//                + "\n";
        return "Worker: " + super.toString()
                + "\nSalary: " + salary
                + "\n";
    }
}
