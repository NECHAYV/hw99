public class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printDescription() {
        System.out.println("Студент: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }

    public static void compare(HogwartsStudent student1, HogwartsStudent student2) {
        int total1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int total2 = student2.getMagicPower() + student2.getTransgressionDistance();

        if (total1 > total2) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (total1 < total2) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по силе магии");
        }
    }
}
