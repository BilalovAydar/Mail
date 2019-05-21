public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void runAnimal(double run){
        if (run != 0){
        System.out.println(name + " бегает " + run + " метров");}
        else {
            System.out.println(name + " не бегает");
        }
    }

    public void swimAnimal(double swim){
        if (swim != 0){
        System.out.println(name + " плавает " + swim + " метров");}
        else {
            System.out.println(name + " не плавает");
        } 
    }

    public void jumpAnimal(double jump){
        if (jump != 0){
            System.out.println(name + " прыгает " + jump + " метров");}
        else {
            System.out.println(name + " не прыгает");
        }
    }

    public void infoAnimal(){
        System.out.println("Животное " + name);
    }
}
