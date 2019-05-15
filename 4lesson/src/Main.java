import jdk.nashorn.internal.ir.WhileNode;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static int n = SIZE * SIZE;
    public static void main(String[] args) {
        initMap();
        printMap();
        while(n != 0){
            humanTurn();
            compTurn();
            System.out.println(n);
            if ((n <= SIZE + 1) && Check()){
                break;
            }

        }
        System.out.println("Конец игры \n");
    }
    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap(){
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void humanTurn(){
        int x, y;
        do{
            System.out.println("Введите координаты хода: \n");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while(!isValid(x, y));
        map[x][y] = DOT_X;
        if (n == 0){printMap();}
    }
    public static boolean isValid(int x, int y){
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE){
            System.out.println("Неверные координаты \n"); return false;}
        if (map[x][y] == DOT_EMPTY){n = n - 1; return true;}
        else {return false;}
    }
    public static void compTurn(){
        int x, y;
        do{
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }while(!isValid(x, y));
        map[x][y] = DOT_0;
        if (n != 0){printMap();}
    }
    public static boolean Check(){

        int[] sumX = new int[SIZE + 1];
        int[] sumX1 = new int[SIZE + 1];
        int[] sum0 = new int[SIZE + 1];
        int[] sum01 = new int[SIZE + 1];
        for(int i = 0; i < SIZE; i++){
            sumX[i] = 0;
            sum0[i] = 0;
            sumX1[i] = 0;
            sum01[i] = 0;
        }
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (i == j && map[i][j] == DOT_X){sumX[SIZE]++; if (sumX[SIZE] == DOTS_TO_WIN){
                    System.out.println("Выиграл человек \n");return true;}}
                if (i == SIZE - 1 - j  && map[i][j] == DOT_X){sumX1[SIZE]++; if (sumX1[SIZE] == DOTS_TO_WIN){
                    System.out.println("Выиграл человек \n");return true;}}
                if (map[i][j] == DOT_X){sumX[j]++;if (sumX[j] == DOTS_TO_WIN){
                    System.out.println("Выиграл человек \n");return true;}}
                if (map[i][j] == DOT_X){sumX1[i]++;if (sumX1[i] == DOTS_TO_WIN){
                    System.out.println("Выиграл человек \n");return true;}}
                if (i == j && map[i][j] == DOT_0){sum0[SIZE]++; if (sum0[SIZE] == DOTS_TO_WIN){
                    System.out.println("Выиграл компьютер \n");return true;}}
                if (i == SIZE - 1 - j  && map[i][j] == DOT_0){sum01[SIZE]++; if (sum01[SIZE] == DOTS_TO_WIN){
                    System.out.println("Выиграл компьютер \n");return true;}}
                if (map[i][j] == DOT_0){sum0[j]++;if (sum0[j] == DOTS_TO_WIN){
                    System.out.println("Выиграл человек \n");return true;}}
                if (map[i][j] == DOT_0){sum01[i]++;if (sum01[i] == DOTS_TO_WIN){
                    System.out.println("Выиграл человек \n");return true;}}
            }

        }
        if (n == 0){
            System.out.println("Ничья \n");}
        return false;
    }

}
