package ru.geekbrains.JavaCore2.lesson1;

public class Course {
    String name; //имя соревнования

    public Course(String name) {
        this.name = name;
        Course[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
    }

    public void doIt(Team team) {
        for (Team t : team) {
            for (Course c : this.course) {
                c.doIt(t);
                if (!t.isOnDistance()) break;
        // TODO
        //  не получается сделать циклы for each для перебора членов команды и препятствий;
    }

    //

    /*
Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
 */

}
