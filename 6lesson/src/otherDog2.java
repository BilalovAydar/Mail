public class otherDog2 extends otherDog{

    public otherDog2(String name) {
        super(name);
    }

    @Override
    public void runAnimal(double run) {
        if (run <= 400) {
            super.runAnimal(run);
        }
        else{
            System.out.println("Эта собака, " + name + ", столько не бегает в этой программе");
        }
    }
}
