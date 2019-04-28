package ru.geekbrains.JavaCore2.lesson1;

public class Course {
    String name; //имя соревнования
    Obstacle[] course; // массив препятствий

    // конструктор полосы препятствий с именем и передачей ему массива препятствий переменной длины
    public Course(String name, Obstacle...course) {
        this.name = name;
        this.course = course;
    }
    // метод  полосы препятствий, которому передается команда участников
    public void doIt(Team team) {
        for (Competitor t : team.teamMembers ) { // перебор по полученному методом doIt массиву участников team - бежит переменная t
            for (Obstacle c : course) { // перебор по всем препятствиям класса cource - бежит переменная с
                c.doIt(t); // методу doIt препятсвия с передается участник t
                if (!t.isOnDistance()) break; // если у участника метод isOnDistance возвращает false, цикл прерывается
            }
        }
    }
}
