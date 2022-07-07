package by.itstep.miachyna.javalessons.lesson23.model.entity;

public class Human extends Object{
    protected String name;
    protected int age;
    protected boolean alive;

    public Human() {
        // super();
        // System.out.println("Human default constructor");
        // init state
    }

    public Human(String name, int age, boolean alive) {
        // this();
        // System.out.println("Human full constructor");

        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getInfo(){
        return name + "\nAge: " + age
                + "\nIs he/she alive? --> " + (isAlive() ? "YES" : "NO");
    }
}
