package homework6;

public class Dog extends Animal{

    private String name;

    public Dog(String name) {
        super(name);
    }

    public Dog(){

    }


    @Override
    public void run(int distance) {
        if(distance < 0){
            distance = -distance;
        }
        if (distance <= getMaxRun(new Dog())) {
            System.out.printf("%s пробежал(а) %d%n", getName(), distance);
        } else {
            System.out.printf("%s только пробежал %d, а потом устал(а)%n", getName(), getMaxRun(new Dog()));
        }
    }

    @Override
    public void swim(int distance) {
        if(distance < 0){
            distance = -distance;
        }
        if (distance <= getMaxSwim(new Dog())) {
            System.out.printf("%s проплыл(а) %d%n", getName(), distance);
        } else {
            System.out.printf("%s только проплыл(а) %d, а потом устал(а) и утонул(а) =(%n", getName(), getMaxSwim(new Dog()));
        }
    }
}
