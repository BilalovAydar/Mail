package cats;
public class Cat {
    private String name;
    private boolean enough = false;
    private int amount;

    public Cat(String name, int amount) {
        this.name = name;
        this.amount = amount;}

    public String getName() {
        return name;
    }

    public void eat(Plate plate){
        if (amount > plate.getFood()){
            System.out.println("В тарелке нет столько еды...Пфф");
        }
        else if (amount <= plate.getFood()){
            plate.decreaseFood(amount);
            System.out.println(name + " eat...");
            this.enough = true;
        }

    }

    public boolean enough(){
        if (enough){
            System.out.println(name + " сыт!");
            return true;
        }
        else {
            System.out.println(name + " голодный...");
            return false;
        }
    }

    public void fear(Dog dog){
        System.out.println(name + " fear..." + dog.getName());
    }
}
