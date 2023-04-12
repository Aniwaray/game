package wanderingtraveler.wt_object.characters.monster;
import java.util.Scanner;
public class Monster {
    public static int m;
    public static int k;

    public void monster_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ты встречаешь на своём пути маленькое ушастое существо. Его зовут -- Чебурашка. Он немножко неуклюжий, но очень милый.");
        System.out.println("Твои действия?");
        System.out.println("1 - пройти мимо, 2 - погладить, 3 - ударить");
        int g = scanner.nextInt();
        switch (g) {
            case 1:
                System.out.println("Чебурашка был опечален твоим действием и убежал прочь.");
                break;
            case 2:
                System.out.println("Чебурашка очень рад, что ты уделил ему время. В твоей руке появился очищенный мандарин.");
                m = 0;
                System.out.println("Кол-во твоей кармы изменилось.");
                break;
            case 3:
                System.out.println("В твоё лицо прилетел мандарин. Чебурашка считает тебя жестоким человеком.");
                m = 1;
                System.out.println("Кол-во твоей кармы изменилось.");
                break;
        }
    }

    public void monster_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ты встречаешь на своём пути белоснежного пушистика. Он смотрит на тебя своими большими глазками прямо в душу. Кажется он очень голоден.");
        System.out.println("Твои действия?");
        System.out.println("1 - пройти мимо, 2 - покормить, 3 - ударить");
        int g = scanner.nextInt();
        switch (g) {
            case 1:
                System.out.println("Пушистик считает тебя бесчувственным человеком. Он очень расстроен.");
                break;
            case 2:
                System.out.println("Теперь Пушистик выглядит радостным. Он благодарен тебе.");
                m = 0;
                System.out.println("Кол-во твоей кармы изменилось.");
                break;
            case 3:
                System.out.println("Глаза пушистика преобретают хищный вид, а сам он намного увеличивается в размере. Кажется, тебе нужно уносить ноги..");
                System.out.println("Кол-во кармы и твоих жизней изменилось.");
                m = 1;
                break;
        }
    }

    public void monster_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ты встречаешь на своём пути красивый нежно-розовый цветочек. Может он ещё и чудесно пахнет?");
        System.out.println("Твои действия?");
        System.out.println("1 - пройти мимо, 2 - понюхать цветочек, 3 - сорвать цветок");
        int g = scanner.nextInt();
        switch (g) {
            case 1:
                System.out.println("Ты проходишь мимо цветка. Видимо он не настолько хорош, чтобы ты тратил на него своё время.");
                break;
            case 2:
                System.out.println("Ты вдыхаешь андромедотоксин. Он, провоцирует одну часть сердца биться быстрее, а другую медленнее одновременно.");
                System.out.println("Результат? Внезапная сердечная смерть.");
                System.out.println("Кол-во твоих жизней изменилось.");
                m = 0;
                break;
            case 3:
                System.out.println("Тебя видимо не учили бережному обращению к беззащитным цветочкам. Очень жаль.");
                m = 1;
                System.out.println("Кол-во твоей кармы изменилось.");
                break;
        }
    }

    public void final_boss() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Перед тобой Светик.");
        System.out.println("--Приветик, любимка! Как тебе твоё путешествие? Мне кажется, что мы очень сблизились за это время. Как ты считаешь?");
        System.out.println("Каков твой ответ? 1 - Думаю ты прав, но мне пора вернуться домой, прости.. , 2 - Мне нужно было лишь добраться до врат и не более");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Чтож, я тебя понял.");
                System.out.println("На тебя нападает Светик. Твои действия?");
                System.out.println("1 - убежать прочь, 2 - помиловать, 3 - убить");
                int gg = scanner.nextInt();
                switch (gg) {
                    case 1:
                        System.out.println("У тебя мало решимости..");
                        break;
                    case 2:
                        System.out.println("Светик очень удивлен. Он исчезает.");
                        k += 5;
                        break;
                    case 3:
                        System.out.println("Ты нападаешь на Светика.");
                        System.out.println("--Честно говоря, наше с тобой приключение было лучшее, что случилось в моей жизни. Прощай..");
                        System.out.println("На твоих руках смерть Светика.. Заслужил ли он это?");
                        k -= 5;
                        break;
                }
                break;
            case 2:
                System.out.println("Хм, я тебе не нравлюсь? Это нормально, не у всех же есть хороший вкус.");
                System.out.println("На тебя нападает Светик. Твои действия?");
                System.out.println("1 - убежать прочь, 2 - помиловать, 3 - убить");
                int g = scanner.nextInt();
                switch (g) {
                    case 1:
                        System.out.println("У тебя мало решимости..");
                        break;
                    case 2:
                        System.out.println("Светик очень удивлен. Он исчезает.");
                        k += 5;
                        break;
                    case 3:
                        System.out.println("Ты нападаешь на Светика.");
                        System.out.println("--Честно говоря, наше с тобой приключение было лучшее, что случилось в моей жизни. Прощай..");
                        System.out.println("На твоих руках смерть Светика.. Заслужил ли он это?");
                        k -= 5;
                }
                break;
        }
    }
}