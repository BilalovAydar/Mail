import cats.Plate;

public class Human {
    public void someFoodToCats(Plate plate, int amount){
        plate.setFood(plate.getFood() + amount);
    }
}
