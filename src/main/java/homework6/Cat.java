package homework6;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat(){

    }

    @Override
    public void run(int distance) {
        if(distance < 0){
            distance = -distance;
        }
        if (distance <= getMaxRun(new Cat())) {
            System.out.printf("%s пробежал(а) %d%n", getName(), distance);
        } else {
            System.out.printf("%s только пробежал(а) %d, а потом устал(а)%n", getName(), getMaxRun(new Cat()));
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }

}
