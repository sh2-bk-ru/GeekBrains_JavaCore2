package ru.geekbrains.JavaCore2.lesson1;

/**
 * команда участников
 */
public class Team {
    String teamName; //имя команды
    Competitor[] teamMembers; // массив участников

    // конструктор команды с именем и передачей массива участников переменной длины
    public Team(String teamName, Competitor...teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

     // метод для отражения результатов прохождения кросса
    void showResults() {
        int count = 0;
        System.out.println("Команда " + teamName + " участвовала в соревнованиях в следующем составе: " );
        for (Competitor t : teamMembers) {
            t.info();
            if (t.isOnDistance()) {
                System.out.println("он успешно прошел всю дистанцию");
                count++;
            } else System.out.println("он не смог пройти всю дистанцию");
        }

        System.out.println( "Таким образом, " + count + " из " + teamMembers.length + " членов команды " + teamName + " успешно преодолели дистанцию");


    }

}
