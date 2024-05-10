package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 1, 3, 5, 7, 9, 11:
                System.out.println(31);
                break;
            case 12, 4, 6, 8, 10:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
        }
    }
}
