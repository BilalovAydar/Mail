import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game();
        Game1();
    }
    public static void Game(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int k = rand.nextInt(10);
        while(true){
            System.out.println("Угадайте число от 0 до 9: ");
            int a = sc.nextByte();
            if (a == k){
                System.out.println("Вы угадали!");
                while(true) {
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    a = sc.nextByte();
                    if (a == 0) {
                        return;
                    } else if (a == 1) {
                        k = rand.nextInt(10);
                        break;
                    }
                }

            }
            else if (a < k){
                System.out.println("Ваше число меньше загаданного");
            }
            else if (a > k){
                System.out.println("Ваше число больше загаданного");
            }
        }
    }
    public static void Game1(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int k = rand.nextInt(25);
        String str = "";
        while(true) {
            System.out.println("Угадайте слово: ");
            str = sc.next();
            if (str.equals(words[k])) {
                System.out.println("Вы угадали!");
                return;
            }
            else{
                for (int i = 0; i < str.length(); i++) {
                    if ((words[k].length() > i)&&(str.charAt(i) == words[k].charAt(i))) {
                        System.out.print(str.charAt(i));
                    }
                    else {
                        System.out.print("#");
                    }
                }
                for (int i = 0; i < 15 - str.length(); i++){
                    System.out.print("#");
                }
                System.out.println("/n");
            }
        }

    }
}
