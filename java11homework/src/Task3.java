import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int length = scanner.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == width - 1 || j == 0 || j == length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}