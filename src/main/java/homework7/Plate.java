package homework7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" + "foodCount=" + foodCount + '}';
    }

    public void decreaseFood(int catEatFoodCount) {
        if (foodCount > catEatFoodCount) {
            foodCount -= catEatFoodCount;
        } else {
            foodCount = 0;
        }
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFoodCount(int foodCount) {
        this.foodCount += foodCount;
        System.out.printf("Plate has been refilled to %d, now it has %d%n", foodCount, getFoodCount());
    }
}
