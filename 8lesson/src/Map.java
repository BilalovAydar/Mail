import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Map extends JPanel {
    public static final  int MODE_HUMAN_VS_AI = 0;
    public static final  int MODE_HUMAN_VS_HUMAN = 1;
    char[][] field;
    int fieldSizeX;
    int fieldSizeY;
    int winLength;
    int cellHeight;
    int cellWidth;

    boolean isInit = false;


    public Map(){

        setBackground(Color.ORANGE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);

            }
        });
    }


    private void update(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;
        System.out.println(cellX + " " + cellY);
        boolean check = false;

         if(TicTacToe.n != 0 && TicTacToe.isValid(cellX,cellY)){ //TicTacToe.isValid(cellX,cellY) && TicTacToe.n != -1
            TicTacToe.map[cellX][cellY] = TicTacToe.DOT_X;
            check = true;}


         if(check && TicTacToe.n > 0){
            Random rand = new Random();
            int x, y;
            do {
                x = rand.nextInt(TicTacToe.SIZE);
                y = rand.nextInt(TicTacToe.SIZE);
            } while (!TicTacToe.isValid(x, y) && TicTacToe.n != 0);
            TicTacToe.map[x][y] = TicTacToe.DOT_0;
         }
            if (TicTacToe.Check()){TicTacToe.n = 0;}
        repaint();
        System.out.println("N = " + TicTacToe.n);
    }


    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength){
        System.out.println(mode + " " + fieldSizeX + " " + fieldSizeY + " " + winLength);
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLength = winLength;

        field = new char[fieldSizeY][fieldSizeX];
        TicTacToe.map = field;
        TicTacToe.DOTS_TO_WIN = winLength;
        TicTacToe.SIZE = fieldSizeX;
        TicTacToe.n = fieldSizeX * fieldSizeY;
        TicTacToe.initMap();
        TicTacToe.printMap();

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);

    }

    private void render(Graphics g) {

        if (!isInit){
            return;
        }
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;
        for(int i = 0; i < fieldSizeY; i++){
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);

        }
        for(int i = 0; i < fieldSizeX; i++){
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }
        for(int i = 0; i < fieldSizeY; i++){
            int y = i * cellHeight;
            for(int j = 0; j < fieldSizeX; j++){
                int x = j * cellWidth;
                if (TicTacToe.map[j][i] == TicTacToe.DOT_0){
                    g.drawOval(x + 4, y + 4, cellWidth - 8, cellHeight - 8);}
                else if (TicTacToe.map[j][i] == TicTacToe.DOT_X){
                    g.drawLine(x, y,x + cellWidth,y + cellHeight);
                    g.drawLine(x + cellWidth,y, x, y + cellHeight);
                }

            }

        }



    }
}
