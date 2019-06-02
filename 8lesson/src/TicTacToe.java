import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
   public static void main(String[] args) {
        GameWindow gmW = new GameWindow();
        int SIZE = gmW.fieldGet().length;

        System.out.println("Конец игры \n");
    }


    public static boolean isValid(int x, int y, int[][] map){
       int SIZE = map.length;
       if (x < 0 || y < 0 || x >= SIZE || y >= SIZE){
            System.out.println("Неверные координаты \n"); return false;}
        return map[x][y] != 1 || map[x][y] != 2;
    }


}
