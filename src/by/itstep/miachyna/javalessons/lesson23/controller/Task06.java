package by.itstep.miachyna.javalessons.lesson23.controller;

import by.itstep.miachyna.javalessons.lesson23.model.entity.MarkNote;
import by.itstep.miachyna.javalessons.lesson23.model.entity.Student;

public class Task06 {
    public static void main(String[] args) {
//        1. Composition
//        Student student01 = new Student("Alex", 20, new MarkNote(10), true);
//        System.out.println(student01.getInfo());
//
//        Student student02 = new Student("Alex", 20, new MarkNote(9), true);
//        System.out.println(student02.getInfo());

//        2. Composition
//        MarkNote note01 = new MarkNote();
//        MarkNote note02 = new MarkNote();
//
//        Student student01 = new Student("Alex", 20, note01, true);
//        System.out.println(student1.getInfo());
//
//        Student student02 = new Student("Alex", 20, note02, true);
//        System.out.println(student02.getInfo());
//
//         3. Aggregation
        MarkNote note = new MarkNote();

        Student student01 = new Student("Alex", 20, note, true);
        System.out.println(student01.getInfo());

        Student student02 = new Student("Alex", 20, note, true);
        System.out.println(student02.getInfo());
    }
}
