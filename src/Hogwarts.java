public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 50, 80, 85, 95);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 95, 40, 85, 90, 90);
        Gryffindor ron = new Gryffindor("Рон Уизли", 80, 45, 70, 75, 85);

        Slytherin draco = new Slytherin("Драко Малфой", 85, 55, 90, 85, 95, 80, 90);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 75, 50, 80, 75, 85, 70, 80);
        Slytherin gregory = new Slytherin("Грегори Гойл", 70, 45, 75, 70, 80, 65, 75);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 75, 60, 80, 75, 85);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 85, 65, 90, 85, 95);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 70, 55, 75, 70, 80);

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 80, 50, 85, 80, 90, 85);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 85, 45, 90, 85, 95, 90);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 75, 40, 80, 75, 85, 80);

        harry.printDescription();
        System.out.println();
        draco.printDescription();
        System.out.println();
        cedric.printDescription();
        System.out.println();
        cho.printDescription();
        System.out.println();

        Gryffindor.compare(harry, hermione);
        Slytherin.compare(draco, graham);
        Hufflepuff.compare(cedric, zacharias);
        Ravenclaw.compare(cho, padma);

        HogwartsStudent.compare(harry, draco);
        HogwartsStudent.compare(hermione, cedric);
        HogwartsStudent.compare(ron, justin);
    }
}