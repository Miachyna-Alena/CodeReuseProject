package by.itstep.miachyna.javalessons.lesson23.controller;

import by.itstep.miachyna.javalessons.lesson23.model.entity.Student;

public class Task05 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 10, true);
        System.out.println(student.toString());

        student.setMark(9);
        System.out.println(student.toString());
    }
}
