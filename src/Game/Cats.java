package Game;

import java.util.Random;

public class Cats {
    private String name;
    private int speed;
    private double weight;
    private int count;

    public Cats(String name, int speed, double weight, int count) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static Cats Barsik = new Cats("Barsik", 45, 15,0);
    public static void test(){

        int min = 20;
        int max = 60;

        Random r = new Random();
        int MouseSpeed = r.nextInt(max - min + 1) + min;
        if(Barsik.getCount() < 10) {
            if (Barsik.getSpeed() > MouseSpeed) {
                System.out.println("Вы поймали мышь!");
                Barsik.setWeight(Barsik.getWeight() + 0.5);
                System.out.println("Ваш вес равен: " + Barsik.getWeight());
                Barsik.setCount(Barsik.getCount() + 1);
                System.out.println("Вы поймали " + Barsik.getCount() + " мышей!");
            } else {
                System.out.println("Вы потерпели неудачу, мышка сбежала =(");
            }
        }else{
            System.out.println("Вы переели, советую отдохнуть");
            System.out.println("Ваши мыши: " + Barsik.getCount());
        }
    }
}
