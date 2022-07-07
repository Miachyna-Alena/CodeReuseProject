package by.itstep.miachyna.javalessons.lesson23.model.entity;

public class Student extends Human {

    public static final int MIN_STUDENT_AGE = 16;
    public static final int MAX_STUDENT_AGE = 65;

    private MarkNote note;

    private String name;

    // default constructor (with no args)
    public Student() {
        super();
        // System.out.println("Student default constructor");

        name = "Botan";
        super.name = "no name";
        age = 16;
        note = new MarkNote();
        alive = true;
    }

    // full constructor with params/args
    public Student(String name, int age, double mark, boolean alive) {
        super(name, age, alive);
        //System.out.println("Student full constructor");

//        this.name = name;
//        this.age = age;
//        this.alive = alive;

//        setName(name);
//        setAge(age);
//        setAlive(alive);

        note = new MarkNote(mark);
    }

    public Student(String name, int age, MarkNote note, boolean alive) {
        super(name, age, alive);
        this.note = note;
    }


    // copy-constructor
    public Student(Student student) {
        super();

        name = student.name;
        age = student.age;
        note = new MarkNote(student.note.getMark());
        alive = student.alive;
    }

    public MarkNote getNote() {
        return note;
    }

    public void setNote(MarkNote note) {
        this.note = note;
    }

//    public void setAge(int age) {
//        if (age >= MIN_STUDENT_AGE && age <= MAX_STUDENT_AGE) {
//            this.age = age;
//        }
//    }

    public double getMark() {
        return note.getMark();
    }

    public void setMark(double mark) {
        note.setMark(mark);
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
                + "\nMark: " + note.getMark()
                + "\n";
    }
}
