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

        // вставляем кусок из текста ДЗ  и модифицируем его

        Course c = new Course("Чемпионат мира 2019", new Cross(80), new Wall(2), new Water(30), new Cross(120)); // передаём конструктору имя соревнования и создаём полосу препятствий
        Team team = new Team("dreamTeam", new Human("Вася"), new Human("Коля"), new Cat("Мурзик"), new Dog("Пират")); //передаем конструктору имя команды и создаем членов команды
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты



    }
}
