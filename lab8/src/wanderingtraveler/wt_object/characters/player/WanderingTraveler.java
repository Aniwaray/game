package wanderingtraveler.wt_object.characters.player;
import java.util.Scanner;
public class WanderingTraveler {
    public int energy;
    public int life;
    public int karma;
    public int posX;
    public int posY;
    private int v, vv, r;

    public WanderingTraveler(int energy, int life, int karma, int posX, int posY) {
        this.energy = energy;
        this.life = life;
        this.karma = karma;
        this.posX = posX;
        this.posY = posY;
    }

    public void moveX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи кол-во клеток по X: ");
        int xo = scanner.nextInt();

        if (xo == 0) {
            System.out.println("Кажется мы стоим на месте, но");
        } else {

            if (xo > 100 || xo < -100) {
                System.out.println("Ты перешёл границу мира. Кол-во твоих жизней изменилось. Попробуй думать перед тем, как выбрать действие.");
                this.life -= 1;
            } else {
                if ((this.posX + xo) > 100 || (this.posX + xo) < -100) {
                    System.out.println("Ты вышел за диапазон мира. Кол-во твоих жизней изменилось. Попробуй думать перед тем, как выбрать действие.");
                    this.life -= 1;
                } else {
                    if (this.energy > 10) {
                        this.posX += xo;
                        this.energy -= 10;
                        System.out.println("Твоя позиция по оси X: " + this.posX + " по оси Y: " + this.posY);
                    }
                }
            }
        }
    }

    public void moveY() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи кол-во клеток по Y: ");
        int yo = scanner.nextInt();
        if (yo == 0) {
            System.out.println("Кажется мы стоим на месте, но");
        } else {
            if (yo > 100 || yo < -100) {
                System.out.println("Ты перешёл границу мира. Кол-во твоих жизней изменилось. Попробуй думать перед тем, как выбрать действие.");
                this.life -= 1;
            } else {
                if ((this.posY + yo) > 100 || (this.posY + yo) < -100) {
                    System.out.println("Ты вышел за диапазон мира. Кол-во твоих жизней изменилось. Попробуй думать перед тем, как выбрать действие.");
                    this.life -= 1;
                } else {
                    if (this.energy > 0) {
                        this.posY += yo;
                        this.energy -= 10;
                        System.out.println("Твоя позиция по оси X: " + this.posX + " по оси Y: " + this.posY);
                    }
                }
            }
        }
    }

    public void sleep() {
        if (this.energy < 70) {
            this.energy = 100;
            System.out.println("Мне снился прекрасный сон. Пора в путь!");
        } else {
            System.out.println("Энергии ещё достаточно для приключений!");
        }
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getVV() {
        return vv;
    }

    public void setVV(int vv) {
        this.vv = vv;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}