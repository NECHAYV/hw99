public class Hufflepuff extends HogwartsStudent {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance,
                      int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Факультет: Пуффендуй");
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }

    public static void compare(Hufflepuff student1, Hufflepuff student2) {
        int total1 = student1.diligence + student1.loyalty + student1.honesty;
        int total2 = student2.diligence + student2.loyalty + student2.honesty;

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (total1 < total2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по качествам Пуффендуя");
        }
    }
}