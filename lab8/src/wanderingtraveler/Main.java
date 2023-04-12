package wanderingtraveler;
import wanderingtraveler.wt_object.*;
import wanderingtraveler.wt_object.characters.monster.*;
import wanderingtraveler.wt_object.characters.player.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WanderingTraveler wanderingTraveler = new WanderingTraveler(100, 3, 0, 0, 0);
        Monster monster = new Monster();
        Dragon dragon = new Dragon(100, 100);
        Dragon_little dragon_l = new Dragon_little(100, 100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Приветствую, Странствующий герой! " + "Введи своё имя: ");
        String name = scanner.nextLine();
        System.out.println("Удачной игры, " + name + "!");

        System.out.println("Ты попадаешь в мир темноты. Здесь ты встретишь как друзей, так и врагов..");
        System.out.println("Неожиданно к тебе подлетает существо, что-то в нём тебя насторажило, но ты не придал этому значение.");
        System.out.println("--Приветик! Я светлячок по имени Светик, твой комапньон, хехе. Ты наверняка в растерянности, но не волнуйся, у тебя есть я!");
        System.out.println("Я буду помогать тебе и освещать твой путь, любимка :) Сейчас я объясню тебе, что тут к чему.");

        System.out.println("Твоя задача добраться до волшебного портала, так ты вернешься домой, но для этого тебе придется сначала выжить, хехе.");
        System.out.println("На твоём пути будут встречаться монстры, ты можешь начать с ними бой или помиловать их. Решение за тобой.");
        System.out.println("У тебя есть карма, которая в зависимости от твоих действий будет уходить в плюс или в минус.");
        System.out.println("От твоей кармы будет зависеть твой путь, а от него -- концовка игры. Текущее кол-во кармы: " + wanderingTraveler.karma);
        System.out.println("Должен предупредить, размер мира 100х100, если выйдешь за пределы - умрёшь.");
        System.out.println("У тебя есть энергия, она тратится и пополняется в зависимости от твоего выбора. Выборы, которые НЕ тратят твою энергию помечены символом '*'");
        System.out.println("Текущее кол-во энергии: " + wanderingTraveler.energy + " единиц." + " Не забывай вовремя отдыхать.");
        System.out.println("Самое главное, что у тебя есть - это жизнь, тебе надо сохранить её. Я добрый, поэтому даю тебе несколько жизней. Советую тратить их с умом:)");
        System.out.println("Текущее кол-во жизней: " + wanderingTraveler.life);

        while (wanderingTraveler.life > 0) {

            wanderingTraveler.setR(1 + (int) (Math.random() * 3));

            System.out.println("Что ты хочешь сделать?");
            System.out.println("Выбери цифру: 1(*) - Проверить энергию, 2 - Пройти по оси X, 3 - Пройти по оси Y, 4(*) - Пойти спать, 5 - Попробовать победить дракона");
            System.out.println("6(*) - Проверить карму, 7(*) - Проверить кол-во жизней, 8(*) - Выход из игры,  9 - Финальный босс, 10(*) - мини-игра");

            wanderingTraveler.setV(scanner.nextInt());

            switch (wanderingTraveler.getV()) {
                case 1:
                    System.out.println("Текущее кол-во твоей энергии: " + wanderingTraveler.energy + " единиц.");
                    break;
                case 4:
                    wanderingTraveler.sleep();
                    break;
                case 6:
                    System.out.println("Текущее кол-во твоей кармы: " + wanderingTraveler.karma);
                    break;
                case 7:
                    System.out.println("Текущее кол-во твоих жизней: " + wanderingTraveler.life);
                    break;
                case 8:
                    System.out.println("Твоё приключение ещё не закончилось, но я забираю самое ценное, что есть у тебя.");
                    wanderingTraveler.life = 0;
                    break;
                case 10:
                    Game.game();
                    break;
            }
            if (wanderingTraveler.energy > 10) {
                switch (wanderingTraveler.getV()) {
                    case 2:
                        wanderingTraveler.moveX();
                        if (wanderingTraveler.getR() == 1) {
                            monster.monster_1();
                            if (Monster.m == 0) {
                                wanderingTraveler.karma += 5;
                            }
                            if (Monster.m == 1) {
                                wanderingTraveler.karma -= 5;
                            }
                        } else if (wanderingTraveler.getR() == 2) {
                            monster.monster_2();
                            if (Monster.m == 0) {
                                wanderingTraveler.karma += 5;
                            }
                            if (Monster.m == 1) {
                                wanderingTraveler.karma -= 5;
                                wanderingTraveler.life -= 1;
                            }
                        } else if (wanderingTraveler.getR() == 3) {
                            monster.monster_3();
                            if (Monster.m == 0) {
                                wanderingTraveler.life -= 1;
                            }
                            if (Monster.m == 1) {
                                wanderingTraveler.karma -= 5;
                            }
                        }
                        break;
                    case 3:
                        wanderingTraveler.moveY();
                        if (wanderingTraveler.getR() == 1) {
                            monster.monster_1();
                            if (Monster.m == 0) {
                                wanderingTraveler.karma += 5;
                            }
                            if (Monster.m == 1) {
                                wanderingTraveler.karma -= 5;
                            }
                        } else if (wanderingTraveler.getR() == 2) {
                            monster.monster_2();
                            if (Monster.m == 0) {
                                wanderingTraveler.karma += 5;
                            }
                            if (Monster.m == 1) {
                                wanderingTraveler.karma -= 5;
                                wanderingTraveler.life -= 1;
                            }
                        } else if (wanderingTraveler.getR() == 3) {
                            monster.monster_3();
                            if (Monster.m == 0) {
                                wanderingTraveler.life -= 1;
                            }
                            if (Monster.m == 1) {
                                wanderingTraveler.karma -= 5;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Перед тобой две пещеры, в какую пойдешь?");
                        System.out.println("1 - в правую, 2 - в левую");
                        wanderingTraveler.setVV(scanner.nextInt());
                        switch (wanderingTraveler.getVV()) {
                            case 1:
                                dragon.action();
                                if (wanderingTraveler.life == 3 && Dragon.damage_dragon == 0) {
                                    System.out.println("У тебя максимальное кол-во жизней. Хочешь изменить кол-во твоей кармы?");
                                    System.out.println("1 - да, 2 - нет");
                                    int a1 = scanner.nextInt();
                                    switch (a1) {
                                        case 1:
                                            System.out.println("1 - (+5 к карме), 2 - (-5 к карме)");
                                            int a2 = scanner.nextInt();
                                            switch (a2) {
                                                case 1:
                                                    wanderingTraveler.karma += 5;
                                                    System.out.println("Кол-во твоей кармы изменилось: " + wanderingTraveler.karma + " единиц.");
                                                    break;
                                                case 2:
                                                    wanderingTraveler.karma -= 5;
                                                    System.out.println("Кол-во твоей кармы изменилось: " + wanderingTraveler.karma + " единиц.");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Как знаешь..");
                                            break;
                                    }
                                    break;
                                }
                            case 2:
                                dragon_l.action();
                                if (wanderingTraveler.life == 3 && Dragon.damage_dragon == 0) {
                                    System.out.println("У тебя максимальное кол-во жизней. Хочешь изменить кол-во твоей кармы?");
                                    System.out.println("1 - да, 2 - нет");
                                    int a1 = scanner.nextInt();
                                    switch (a1) {
                                        case 1:
                                            System.out.println("1 - (+5 к карме), 2 - (-5 к карме)");
                                            int a2 = scanner.nextInt();
                                            switch (a2) {
                                                case 1:
                                                    wanderingTraveler.karma += 5;
                                                    System.out.println("Кол-во твоей кармы изменилось: " + wanderingTraveler.karma + " единиц.");
                                                    break;
                                                case 2:
                                                    wanderingTraveler.karma -= 5;
                                                    System.out.println("Кол-во твоей кармы изменилось: " + wanderingTraveler.karma + " единиц.");
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Как знаешь..");
                                            break;
                                    }
                                    break;
                                }
                        }
                        break;
                    case 9:
                        monster.final_boss();
                        wanderingTraveler.karma = wanderingTraveler.karma + Monster.k;
                        if (wanderingTraveler.karma == 0) {
                            System.out.println("Ты выбрал путь нейтралитета.");
                            System.out.println("Твоему путешествию пришел конец. Ты отыскал волшебный портал и вернулся домой в полном одиночестве.");
                        } else if (wanderingTraveler.karma > 0) {
                            System.out.println("Ты выбрал путь милосердия.");
                            System.out.println("Твоему путешествию пришел конец. Ты отыскал волшебный портал и вернулся домой с новыми друзьями.");
                        } else {
                            System.out.println("Ты выбрал путь жестокости.");
                            System.out.println("Твоему путешествию пришел конец. Вся твоя жизнь отныне - это бесконечные скитания по миру покрытому мглой.");
                        }
                        wanderingTraveler.life -= 13;
                        break;
                }
            } else System.out.println("У тебя низкий уровень энергии, может отдохнём?");
            if (wanderingTraveler.life == 0) {
                System.out.println("Жизни, дарованные тебе закончились.. Игре пришёл конец.");
                break;
            }
        }
    }
}