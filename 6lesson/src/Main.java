public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик");
        cat.infoAnimal();
        cat.runAnimal(100);
        cat.swimAnimal(0);
        cat.jumpAnimal(0);
        Animal dog1 = new Dog("Барон");
        dog1.infoAnimal();
        dog1.jumpAnimal(0.25);
        dog1.swimAnimal(8);
        dog1.runAnimal(600);
        Animal dog2 = new otherDog("Чертик");
        dog2.infoAnimal();
        dog2.runAnimal(600);
        dog2.swimAnimal(15);
        dog2.jumpAnimal(0.38);
        Animal dog3 = new otherDog2("Лайка");
        dog3.infoAnimal();
        dog3.runAnimal(600);
        dog3.jumpAnimal(0.3);
        dog3.swimAnimal(4);
    }
}
