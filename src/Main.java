public class Main {
    public static void main(String[] args) {
        Griffindor Harry = new Griffindor("Гарри Поттер", 12, 17, 15, 11, 22);
        Griffindor Hermione = new Griffindor("Гермиона Грейнджер", 19, 25, 22, 11, 18);
        Griffindor Ron = new Griffindor("Рон Уизли", 11, 11, 17, 7, 16);
        Hufflepuff Zacharias = new Hufflepuff("Захария Смит", 22, 7, 10, 9, 10);
        Hufflepuff Cedric = new Hufflepuff("Седрик Диггори", 11, 12, 13, 14, 15);
        Hufflepuff Justin = new Hufflepuff("Джастин Финч-Флетчли", 3, 4, 5, 6, 7);
        Ravenclaw Cho = new Ravenclaw("Чжоу Чанг", 6, 8, 9, 11, 4, 2);
        Ravenclaw Padma = new Ravenclaw("Падма Патил", 7, 3, 5, 8, 1, 5);
        Ravenclaw Markus = new Ravenclaw("Маркус Белби", 11, 7, 12, 10, 2, 1);
        Slytherin Draco = new Slytherin ("Драко Малфой", 21, 8, 9, 11, 4, 2, 11);
        Slytherin Graham = new Slytherin("Грэхэм Монтегю", 10, 6, 3, 4, 2, 1, 1);
        Slytherin Gregory = new Slytherin("Грэгори Гойл", 12, 5, 2, 13, 11, 1, 1);
        Harry.print();
        Hermione.print();
        Ron.print();
        Zacharias.print();
        Cedric.print();
        Justin.print();
        Cho.print();
        Padma.print();
        Markus.print();
        Draco.print();
        Graham.print();
        Gregory.print();
        Harry.qualitiesHogwarts(Zacharias);
        Harry.qualitiesGryffindor(Hermione);
    }
}