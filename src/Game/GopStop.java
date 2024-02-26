package Game;

import java.util.Random;

public class GopStop {


    public static void thief(){
        Cats[] catsArray = new Cats[4];
        catsArray[0] = new Cats("Petya", 30,17, 7);
        catsArray[1] = new Cats("Ananas", 20,25, 50);
        catsArray[2] = new Cats("Berch", 40, 16, 4);
        catsArray[3] = new Cats("Martin", 35, 19, 9);
        Random r = new Random();
        int maxK = 3;
        int minK = 0;
        int CatR = r.nextInt(maxK - minK + 1) + minK;

        System.out.println("Вы встретили " + catsArray[CatR].getName() + " его вес: " + catsArray[CatR].getWeight());
        if(Cats.Barsik.getWeight() > catsArray[CatR].getWeight()){
            System.out.println("Вы победили в битве пухляшей, мыши " + catsArray[CatR].getName() + " теперь ваши");
            System.out.println("+" + catsArray[CatR].getCount() + " мышей");
            Cats.Barsik.setCount(Cats.Barsik.getCount() + catsArray[CatR].getCount());
        }else{
            System.out.println("Вы проиграли в битве пухляшей, ваши мыши теперь у " + catsArray[CatR].getName());
            Cats.Barsik.setCount(0);
        }


    }
}
