package homework6;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik");
        Cat tyler = new Cat("Tyler");

        bobik.run(150);
        bobik.swim(5);
        tyler.run(100);
        tyler.swim(1);
        bobik.run(700);
        bobik.swim(11);
        tyler.run(300);
        tyler.swim(50);
        tyler.swim(0);
        tyler.swim(-50);
        bobik.swim(-50);
        System.out.println(Animal.getAnimalCount());
        Cat trevor = new Cat("Trevor");
        System.out.println(Animal.getAnimalCount());
    }
}
