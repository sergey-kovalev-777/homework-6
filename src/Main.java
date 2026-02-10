//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\nHomework 6");

        System.out.println("\nЗадача 1");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 3");

        for (int i = 0; i < 17; i = i+2) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("\nЗадача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 7");

        for (int i = 1; i <= 512; i = i + i) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 8");

        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + salary;
        }
        System.out.println(total);

        System.out.println("\nЗадача 9");

        salary = 29000;
        total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }

        System.out.println("\nЗадача 10");

        int num = 2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + "*" + i + "=" + result);
        }
        }
    }