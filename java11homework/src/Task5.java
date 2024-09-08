import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        int start = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println("Таблица умножения для " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

        scanner.close();
    }
}