package by.itstep.miachyna.javalessons.lesson23.model.entity;

public class Loafer extends Human {
    private static double amount;

    private double inactivityPeriod;

    public Loafer() {
    }

    public Loafer(String name, int age, double inactivityPeriod, boolean alive) {
        super(name, age, alive);

//        this.name = name;
//        this.age = age;
//        this.alive = alive;

//        setName(name);
//        setAge(age);
//        setAlive(alive);

        this.inactivityPeriod = inactivityPeriod;
    }

    public static double getAmount() {
        return amount;
    }

    public static void setAmount(double amount) {
        Loafer.amount = amount;
    }

    public double getInactivityPeriod() {
        return inactivityPeriod;
    }

    public void setInactivityPeriod(double inactivityPeriod) {
        this.inactivityPeriod = inactivityPeriod;
    }

    public String getInfo() {
//        return "Loafer: " + name
//                + "\nAge = " + age
//                + "\nInactivity period: " + inactivityPeriod
//                + "\nIs he/she alive? --> " + (alive ? "YES" : "NO")
//                + "\n";
//        return "Loafer: " + getName()
//                + "\nAge = " + getAge()
//                + "\nInactivity period: " + inactivityPeriod
//                + "\nIs he/she alive? --> " + (isAlive() ? "YES" : "NO")
//                + "\n";
        return "Loafer: " + super.getInfo()
                + "\nInactivity period: " + inactivityPeriod
                + "\n";
    }
}
