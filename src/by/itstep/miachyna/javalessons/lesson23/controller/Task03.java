package by.itstep.miachyna.javalessons.lesson23.controller;

import by.itstep.miachyna.javalessons.lesson23.model.entity.Human;
import by.itstep.miachyna.javalessons.lesson23.model.entity.Loafer;
import by.itstep.miachyna.javalessons.lesson23.model.entity.Student;
import by.itstep.miachyna.javalessons.lesson23.model.entity.Worker;

public class Task03 {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.setAge(20);
//        human.setAlive(true);
//        human.setName("Alex");

        Student student = new Student("Alex", 20, 10, true);
        Worker worker = new Worker("Peter", 25, 3000, true);
        Loafer loafer = new Loafer("Nikolay", 40, 2, true);

        System.out.println(student.toString());
        System.out.println(worker.toString());
        System.out.println(loafer.toString());
    }
}
