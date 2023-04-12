package wanderingtraveler.wt_object.characters.monster;
import java.util.Scanner;
public class Dragon_little extends Dragon {
    public Dragon_little(int damage_dragon, int damage_player) {
        super(damage_dragon, damage_player);
    }

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если ты сможешь одержать победу над маленьким драконом, то у тебя восстановится кол-во жизней на 1.");

        System.out.println("На данный момент твоя полоса жизни составляет: " + Dragon_little.damage_player + " единиц.");
        System.out.println("На данный момент полоса жизни маленького дракона составляет: " + Dragon_little.damage_dragon + " единиц.");

        System.out.println("--Ты хочешь сразиться со мной?");
        System.out.println("Выбери действие: 1 - убежать прочь, 2 - приготовится к бою");
        int z1 = scanner.nextInt();
        switch (z1) {
            case 1:
                System.out.println("Фух..");
                break;
            case 2:
                System.out.println("Ох, что же мне делать? Мне нельзя подвести отца.");

                while (Dragon_little.damage_player > 0 && Dragon_little.damage_dragon > 0) {
                    System.out.println("На тебя нападает маленький дракон.");
                    System.out.println("1 - увернуться, 2 - атаковать");
                    int z2 = scanner.nextInt();
                    switch (z2) {
                        case 1:
                            System.out.println("--Ого.. Маленький дракон ждёт твоего хода.");
                            System.out.println("1 - увернуться, 2 - атаковать");
                            int z3 = scanner.nextInt();
                            switch (z3) {
                                case 1:
                                    System.out.println("Хм..несуразное действие..");
                                    break;
                                case 2:
                                    Dragon_little.damage_dragon -= 50;
                                    System.out.println("Ты наносишь урон маленькому дракону. Кол-во его полосы жизни: " + damage_dragon);
                                    break;
                            }
                            break;
                        case 2:
                            Dragon_little.damage_player -= 50;
                            System.out.println("Ты получаешь урон. Кол-во твоей полосы жизни: " + Dragon_little.damage_player);
                            break;
                    }
                }
        }
        if (Dragon_little.damage_player == 0) {
            System.out.println("Ты проиграл битву.");
            Dragon_little.damage_player = 0;
        } else if (Dragon_little.damage_dragon == 0) {
            System.out.println("Ты одержал победу!");
        }
    }
}