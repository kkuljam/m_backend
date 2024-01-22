package day15;

import day13.step4.package2.D;

public class Step3 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sound();

        Cat cat=new Cat();
        cat.sound();

        Animal dog1=new Dog();
        animalSound(dog1);
        animalSound(new Cat());

    }
    //
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
