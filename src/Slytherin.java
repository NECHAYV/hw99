public class Slytherin extends HogwartsStudent {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Факультет: Слизерин");
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + lustForPower);
    }

    public static void compare(Slytherin student1, Slytherin student2) {
        int total1 = student1.cunning + student1.determination + student1.ambition +
                student1.resourcefulness + student1.lustForPower;
        int total2 = student2.cunning + student2.determination + student2.ambition +
                student2.resourcefulness + student2.lustForPower;

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (total1 < total2) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по качествам Слизерина");
        }
    }
}