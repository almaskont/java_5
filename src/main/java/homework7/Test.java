package homework7;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Cat[] myCats = new Cat[3];

        myCats[0] = new Cat("Tyler", 8);
        myCats[1] = new Cat("Steven", 10);
        myCats[2] = new Cat("Conor", 15);

        Plate plate = new Plate(10);

        plate.printInfo();

        int fill = feedCats(myCats, plate);

        for (Cat myCat : myCats) {
            if (!myCat.isFull()) {
                plate.addFoodCount(fill);
                plate.printInfo();
                feedCats(myCats, plate);
                break;
            }
        }
    }

    private static int feedCats(Cat[] myCats, Plate plate) throws InterruptedException {
        int fill = 0;
        for (Cat myCat : myCats) {
            if (!myCat.isFull()) {
                myCat.eat(plate);
                plate.printInfo();
                System.out.printf("%s is %s%n", myCat.getName(), (myCat.isFull() ? "full" : "hungry for " + myCat.getHungryFor()));
                Thread.sleep(1000);
            }
            if(plate.getFoodCount() == 0){
                fill += myCat.getHungryFor();
            }
        }
        return fill;
    }
}
