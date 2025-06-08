class AccountingTasks {
    public static void main(String[] args) {
        int[] monthlyExpenses = {15000, 23000, 18000, 21000, 19000};
        int totalExpenses = 0;
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        for (int expense : monthlyExpenses) {
            totalExpenses += expense;
        }

        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        int[] weeklyExpenses = {42000, 38000, 45000, 41000, 39000};
        int minExpense = weeklyExpenses[0];
        int maxExpense = weeklyExpenses[0];
        for (int i = 1; i < weeklyExpenses.length; i++) {
            if (weeklyExpenses[i] < minExpense) {
                minExpense = weeklyExpenses[i];
            }
            if (weeklyExpenses[i] > maxExpense) {
                maxExpense = weeklyExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense +
                " рублей. Максимальная сумма трат за неделю составила " +
                maxExpense + " рублей");

        int[] monthExpenses = {175000, 182000, 169000, 188000, 174000};
        double totalMonthExpenses = 0;

        for (int expense : monthExpenses) {
            totalMonthExpenses += expense;
        }
        double averageExpenses = totalMonthExpenses / monthExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.print("Исправленное имя: ");
        for (char c : reverseFullName) {
            System.out.print(c);
        }
        System.out.println();
    }
}