import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество диапазонов:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите диапазон в формате ЧИСЛО-ЧИСЛО:");
            String diapazon = scanner.next();
            String[] number = diapazon.split("-");
            int a = Integer.parseInt(number[0]);
            int b = Integer.parseInt(number[1]);

            if (b > a) {
                //System.out.println(Arrays.toString(number));
                NumRandom numrandom = new NumRandom(a,b);
                System.out.print("Длина диапазона равна: ");
                System.out.println(numrandom.Len(a,b));
                System.out.print("Сгенерированное случайное число из диапазона: ");
                System.out.println(numrandom.Number(a,b));

            } else {
                System.out.println("Ошибка ввода диапазона, верхняя граница задана некорректно.Повторите ввод");
                n = n+1;
                 }

        }

    }
}
