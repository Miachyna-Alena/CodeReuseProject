package by.itstep.miachyna.javalessons.lesson23.controller;

import by.itstep.miachyna.javalessons.lesson23.model.entity.Student;

public class Task01 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 4, true);
        System.out.println(student.getInfo());

        student.setName("Alexandra");
        System.out.println(student.getInfo());
    }
}
