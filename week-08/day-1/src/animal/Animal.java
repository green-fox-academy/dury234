package animal;

public class Animal {
    int hunger = 50;
    int thirst = 50;

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();

        System.out.println("hunger: " + animal.hunger + ", thirst: " + animal.thirst);

        for (int i = 0; i < 5; i++) {
            animal.eat();
            animal.play();
        }

        System.out.println("hunger: " + animal.hunger + ", thirst: " + animal.thirst);
    }

}
