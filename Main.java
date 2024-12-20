public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] expenses = new int[] { 3, 5, 15, 27 };

        System.out.println("Total expense: " + totalExpenseForEach(expenses));
    }

    public static int totalExpenseForEach(int[] expenses) {
        int sum = 0;

        for (int currentExpense : expenses) {
            System.out.println("Current expense: " + currentExpense);
            sum += currentExpense;
        }

        return sum;
    }

    public static int totalExpenseFor(int[] expenses) {
        int sum = 0;

        for (int i = 0; i < expenses.length; i++) {
        // for (int i = expenses.length - 1; i >= 0; i--) {
            System.out.println("Current index: " + i);
            int currentExpense = expenses[i];
            System.out.println("Current expense: " + currentExpense);

            sum += currentExpense;
        }

        return sum;
    }

    public static int totalExpenseWhile(int[] expenses) {
        int sum = 0;

        int currentExpenseIndex = 0;
        int expensesCount = expenses.length;

        while (currentExpenseIndex < expensesCount) {
            System.out.println("Current index: " + currentExpenseIndex);
            int currentExpense = expenses[currentExpenseIndex];
            System.out.println("Current expense: " + currentExpense);

            sum += currentExpense;

            currentExpenseIndex++;
        }

        System.out.println(currentExpenseIndex);

        return sum;
    }
}