package by.itstep.miachyna.javalessons.lesson23.controller;

import by.itstep.miachyna.javalessons.lesson23.model.entity.Human;
import by.itstep.miachyna.javalessons.lesson23.model.entity.Loafer;
import by.itstep.miachyna.javalessons.lesson23.model.entity.Student;
import by.itstep.miachyna.javalessons.lesson23.model.entity.Worker;

public class Task08 {
    public static void main(String[] args) {
        Worker worker = new Worker("Alex", 40, 3000, true);
        System.out.println(worker);

//        Human[] humans = {
//                new Worker("Alex", 40, 3000, true),
//                new Student("Peter", 20, 10, true),
//                new Loafer("Anna", 18, 8, true),
//                new Worker("Alex", 40, 3000, true),
//                new Student("Peter", 20, 10, true),
//                new Loafer("Anna", 18, 8, true)
//        };
    }
}
