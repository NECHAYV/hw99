public class Ravenclaw extends HogwartsStudent {
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Факультет: Когтевран");
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    public static void compare(Ravenclaw student1, Ravenclaw student2) {
        int total1 = student1.intelligence + student1.wisdom + student1.wit + student1.creativity;
        int total2 = student2.intelligence + student2.wisdom + student2.wit + student2.creativity;

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (total1 < total2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по качествам Когтеврана");
        }
    }
}