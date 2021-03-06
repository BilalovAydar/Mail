public class otherDog extends Animal {
    public otherDog(String name) {
        super(name);
    }

    @Override
    public void infoAnimal() {
        System.out.println("Другая собака, " + name);
    }

    @Override
    public void swimAnimal(double swim) {
        if (swim <= 10) {
            super.swimAnimal(swim);
        }
        else {
            System.out.println("Эта собака, " + name + ", столько не плавает в этой программе!");
        }
    }

    @Override
    public void runAnimal(double run) {
        if (run <= 600) {
            super.runAnimal(run);
        }
        else{
            System.out.println("Эта собака, " + name + ", столько не бегает в этой программе");
        }
    }

    @Override
    public void jumpAnimal(double jump) {
        if (jump <= 0.5) {
            super.jumpAnimal(jump);
        }
        else {
            System.out.println("Эта собака, " + name + ", столько не прыгает в этой программе");
        }
    }
}
