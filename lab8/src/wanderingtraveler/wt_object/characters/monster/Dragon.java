package wanderingtraveler.wt_object.characters.monster;
import java.util.Scanner;
    public class Dragon {
    public static int damage_dragon;
    static int damage_player;

    public Dragon(int damage_dragon, int damage_player) {
        Dragon.damage_dragon = damage_dragon;
        Dragon.damage_player = damage_player;
    }

    public void action() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Если ты сможешь одержать победу над драконом, то у тебя восстановится кол-во жизней на 1.");

        System.out.println("На данный момент твоя полоса жизни составляет: " + Dragon.damage_player + " единиц.");
        System.out.println("На данный момент полоса жизни дракона составляет: " + Dragon.damage_dragon + " единиц.");

        System.out.println("--Кто-то слишком самонадеянный и решил потревожить мой сон?");
        System.out.println("Выбери действие: 1 - убежать прочь, 2 - приготовится к бою");

        int d1 = scanner.nextInt();
        switch (d1) {
            case 1:
                System.out.println("Вот и славно.");
                break;
            case 2:
                System.out.println("Храброго из себя строишь?");

                while (Dragon.damage_player > 0 && Dragon.damage_dragon > 0) {
                    System.out.println("На тебя нападает дракон.");
                    System.out.println("1 - увернуться, 2 - атаковать");
                    int d2 = scanner.nextInt();
                    switch (d2) {
                        case 1:
                            System.out.println("--А ты не плох.. Дракон ждёт твоего хода.");
                            System.out.println("1 - увернуться, 2 - атаковать");
                            int d3 = scanner.nextInt();
                            switch (d3) {
                                case 1:
                                    System.out.println("Хм..несуразное действие..");
                                    break;
                                case 2:
                                    Dragon.damage_dragon -= 50;
                                    System.out.println("Ты наносишь урон дракону. Кол-во его полосы жизни: " + Dragon.damage_dragon);
                                    break;
                            }
                            break;
                        case 2:
                            Dragon.damage_player -= 50;
                            System.out.println("Ты получаешь урон. Кол-во твоей полосы жизни: " + Dragon.damage_player);
                            break;
                    }
                }
        }
        if (Dragon.damage_player == 0) {
            System.out.println("Ты проиграл битву.");
            Dragon.damage_player = 0;
        } else if (Dragon.damage_dragon == 0) {
            System.out.println("Ты одержал победу!");
        }
    }
}