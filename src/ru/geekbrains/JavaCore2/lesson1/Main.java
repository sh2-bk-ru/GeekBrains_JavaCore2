package ru.geekbrains.JavaCore2.lesson1;

public class Main {
    public static void main(String[] args) {
        /* комментим исходный код



        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};

        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
        */
        // вставляем кусок из текста ДЗ
        Course c = new Course("Чемпионат мира 2019"); // Создаем полосу препятствий
        Team team = new Team("dreamTeam"); // Создаем команду, передаем конструктору имя команды
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(team); // Показываем результаты



    }
}
