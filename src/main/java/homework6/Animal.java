package homework6;

public abstract class Animal {

    private String name;
    private static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public Animal() {

    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getMaxRun(Object o) {
        if (o.getClass() == Cat.class){
            return 200;
        } else if(o.getClass() == Dog.class){
            return 500;
        }
        return 0;
    }

    public int getMaxSwim(Object o) {
        if (o.getClass() == Cat.class){
            return 0;
        } else if(o.getClass() == Dog.class){
            return 10;
        }
        return 0;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
