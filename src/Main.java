public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 5 ===");
        int value5 = 33;
        changeValue(value5);
        System.out.println("Значение после changeValue: " + value5); // 33

        System.out.println("\n=== Задание 6 ===");
        Integer value6 = 33;
        changeValue(value6);
        System.out.println("Значение после changeValue: " + value6); // 33

        System.out.println("\n=== Задание 7 ===");
        Integer[] value7 = {3, 4};
        changeValue(value7);
        System.out.print("Массив после changeValue: ");
        for (Integer num : value7) {
            System.out.print(num + " "); // 3 4
        }
        System.out.println();

        System.out.println("\n=== Задание 8 ===");
        Integer[] value8 = {3, 4};
        changeValueElement(value8);
        System.out.print("Массив после changeValueElement: ");
        for (Integer num : value8) {
            System.out.print(num + " "); // 99 4
        }
        System.out.println();

        System.out.println("\n=== Задание 9 ===");
        Person person9 = new Person("Lyapis", "Trubetskoy");
        changePerson(person9);
        System.out.println("Person после changePerson: " + person9); // Lyapis Trubetskoy

        System.out.println("\n=== Задание 10 ===");
        Person person10 = new Person("Lyapis", "Trubetskoy");
        changePersonFields(person10);
        System.out.println("Person после changePersonFields: " + person10); // Ilya Lagutenko
    }


    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValue(Integer value) {
        value = 22;
    }

    public static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    public static void changeValueElement(Integer[] value) {
        value[0] = 99;
    }

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePersonFields(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

    static class Person {
        String name;
        String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return name + " " + surname;
        }
    }
}