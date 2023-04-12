package wanderingtraveler.wt_object;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, сынок! Я загадал число от 0 до 13, найдется ли силёнок угадать?");
        System.out.println("1 - да, 2 - нет");
        int n = scanner.nextInt();
        switch (n) {
            case 2:
                System.out.println("Чтож, тогда заходи в другой раз!");
                break;
            case 1:
                System.out.println("Да начнется игра, сынок! Какое число я загадал?: ");
                int num = scanner.nextInt();
                Random rand = new Random();
                int random_num = rand.nextInt(13);
                for (int i = 10; i > 0; i++) {
                    if (random_num > num) {
                        System.out.println("Не верно:)! Мое число больше твоего ");
                        System.out.println("Какое число я загадал?: ");
                        num = scanner.nextInt();

                    } else if (random_num < num) {
                        System.out.println("Не верно:)! Мое число меньше твоего ");
                        System.out.println("Какое число я загадал?: ");
                        num = scanner.nextInt();

                    } else {
                        System.out.println("Урааа, ты угадал, это число: " + random_num);
                        break;
                    }
                }
        }
    }
}