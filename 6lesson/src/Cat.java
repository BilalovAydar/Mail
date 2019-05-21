public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void infoAnimal() {
        System.out.println("Кот " + name);
    }

    @Override
    public void swimAnimal(double swim) {
        System.out.println("Этот кот, " + name + ", не плавает в этой программе!");
    }

    @Override
    public void runAnimal(double run) {
        if (run <= 200) {
            super.runAnimal(run);
        }
        else{
            System.out.println("Этот кот, " + name + ", столько не бегает в этой программе");
        }
    }

    @Override
    public void jumpAnimal(double jump) {
        if (jump <= 2) {
            super.jumpAnimal(jump);
        }
        else {
            System.out.println("Этот кот, " + name + ", столько не прыгает в этой программе");
        }
    }
}
