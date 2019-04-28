package ru.geekbrains.JavaCore2.lesson1;

/**
 * команда участников
 */
public class Team {
    String name; //имя команды

    // private Competitor[] competitors;

    public Team(String name) {
        this.name = name;
        Team[] competitors = {new Human("Коля"), new Cat("Мурзик"), new Dog("Пират")};
    }

    void showResults(Team[] team) {
        //TODO
        int length = team.length;
        for ( int i=0; i < length ; i++){

        }
    }

}
