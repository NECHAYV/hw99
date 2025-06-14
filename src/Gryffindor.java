public class Gryffindor extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance,
                      int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Факультет: Гриффиндор");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public static void compare(Gryffindor student1, Gryffindor student2) {
        int total1 = student1.nobility + student1.honor + student1.bravery;
        int total2 = student2.nobility + student2.honor + student2.bravery;

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (total1 < total2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по качествам Гриффиндора");
        }
    }
}