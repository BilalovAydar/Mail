package cats;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        boolean check = false;

        Random rand = new Random();
        Plate plate = new Plate(33);
        Cat[] cats = new Cat[7];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("MurMew" + i,rand.nextInt(20));
        }
        while (!check) {
            int sum = 0;
            for (int i = 0; i < cats.length; i++) {
                System.out.println(plate);
                if (!cats[i].enough()){
                    sum++;
                    cats[i].eat(plate);
                }
            }

            if (sum == 0){check = true;}
            else{
                System.out.println("Добавим еды...");
                plate.increaseFood(rand.nextInt(10));}

        }


        Cat cat = new Cat("Murzik", 10);



        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);

        Dog dog = new Dog("Tuzik");
        dog.voice(cat);

        Dog dog1 = new Dog("Vulkan");
        dog1.voice(cat);
    }
}
