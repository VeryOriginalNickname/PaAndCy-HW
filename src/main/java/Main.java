import ru.netology.services.PaAndCy.services.daysCounter;

public class Main {

    public static void main(String[] args) {
        daysCounter service = new daysCounter();
        int income = 10_000, expenses = 3_000, threshold = 20_000;

        int freeMonths = service.count(income, expenses, threshold);

        System.out.println("Не рабочих месяцев: " + freeMonths);
    }
}
