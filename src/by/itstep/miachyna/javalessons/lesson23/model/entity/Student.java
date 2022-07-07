package by.itstep.miachyna.javalessons.lesson23.model.entity;

public class Student extends Human{
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;
    public static final int MIN_STUDENT_AGE = 16;
    public static final int MAX_STUDENT_AGE = 65;

    private double mark;

    private String name;

    // default constructor (with no args)
    public Student() {
        super();
        System.out.println("Student default constructor");

        name = "Botan";
        super.name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    // full constructor with params/args
    public Student(String name, int age, double mark, boolean alive) {
        super(name, age, alive);
        System.out.println("Student full constructor");

//        this.name = name;
//        this.age = age;
//        this.alive = alive;

//        setName(name);
//        setAge(age);
//        setAlive(alive);

        this.mark = mark;
    }

    // copy-constructor
    public Student(Student student) {
        super();

        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }

//    public void setAge(int age) {
//        if (age >= MIN_STUDENT_AGE && age <= MAX_STUDENT_AGE) {
//            this.age = age;
//        }
//    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            this.mark = mark;
        }
    }

    public String getInfo() {
//        return "Student: " + name
//                + "\nAge: " + age
//                + "\nMark: " + mark
//                + "\nIs he/she alive? --> " + (alive ? "YES" : "NO")
//                + "\n";
//        return "Student: " + getName()
//                + "\nAge: " + getAge()
//                + "\nMark: " + mark
//                + "\nIs he/she alive? --> " + (isAlive() ? "YES" : "NO")
//                + "\n";
        return "Student: " + super.getInfo()
                + "\nMark: " + mark
                + "\n";
    }
}
