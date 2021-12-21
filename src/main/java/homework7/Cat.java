package homework7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    private boolean full = false;
    private int hungryFor;
    private int toFull;

    public Cat(String name, int toFull) {
        this.name = name;
        this.toFull = toFull;
        hungryFor = ThreadLocalRandom.current().nextInt(toFull) + 1;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return full;
    }

    public int getHungryFor() {
        return hungryFor;
    }

    public void setHungryFor(int hungryFor) {
        this.hungryFor = hungryFor;
    }

    public int getToFull() {
        return toFull;
    }

    public void setToFull(int toFull) {
        this.toFull = toFull;
    }

    public void eat(Plate plate) {
        if (hungryFor <= plate.getFoodCount()) {
            System.out.printf("%s is hungry for %d%n", name, hungryFor);
            plate.decreaseFood(hungryFor);
            full = true;
        } else {
            System.out.printf("%s is hungry for %d%n", name, hungryFor);
            hungryFor -= plate.getFoodCount();
            plate.decreaseFood(plate.getFoodCount());
        }
    }
}
