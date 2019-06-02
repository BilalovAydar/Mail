import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartNewGameWindow extends JFrame {
    private final GameWindow gameWindow;
    private static final int WIN_HEIGHT = 230;
    private static final int WIN_WIDTH = 350;
    private static final int MIN_WIN_LINE = 3;
    private static final int MAX_WIN_LINE = 10;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final String STR_WIN_LEN = "winning length: ";
    private static final String STR_FIELD_SIZE = "field size: ";
    private JRadioButton jrbHumVsAi = new JRadioButton("Human VS Ai",true);
    private JRadioButton jrbHumVsHum = new JRadioButton("Human VS Human");
    private ButtonGroup gameMode = new ButtonGroup();
    private JSlider slFieldSize;
    private JSlider slWinLength;


    public StartNewGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setSize(WIN_WIDTH,WIN_HEIGHT);
        setTitle("Parameters");
        Rectangle gameWindowBounds = gameWindow.getBounds();
        int posX = (int)(gameWindowBounds.getCenterX() - WIN_WIDTH / 2);
        int posY = (int)(gameWindowBounds.getCenterY() - WIN_HEIGHT / 2);
        setLocation(posX, posY);

        setLayout(new GridLayout(10, 1));
        addGameControlMode();
        addGameControlFieldWinLin();

        JButton btnStartGame = new JButton("Start a game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartGameClick();
            }
        });
        add(btnStartGame);
       //this.firstInit();
        setVisible(false);

    }

    public void firstInit() {
        gameWindow.startNewGame(Map.MODE_HUMAN_VS_AI, MIN_FIELD_SIZE, MIN_WIN_LINE, MIN_WIN_LINE);
    }


    private void btnStartGameClick() {
        int gameMode;
        if (jrbHumVsAi.isSelected()){
            gameMode = Map.MODE_HUMAN_VS_AI;
        }else{
            gameMode = Map.MODE_HUMAN_VS_HUMAN;
        }
        int fieldSize = slFieldSize.getValue();
        int winLength = slWinLength.getValue();
        gameWindow.startNewGame(gameMode, fieldSize, fieldSize, winLength);

        setVisible(false);

    }

    private void addGameControlFieldWinLin() {
        add(new JLabel("Choose field size"));
        JLabel lblFieldSize = new JLabel(STR_FIELD_SIZE + MIN_FIELD_SIZE);
        add(lblFieldSize);

        slFieldSize = new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE,MIN_FIELD_SIZE);
        slFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int newCurrentFieldSize = slFieldSize.getValue();
                lblFieldSize.setText(STR_FIELD_SIZE + newCurrentFieldSize);
                slWinLength.setMaximum(newCurrentFieldSize);
            }
        });

        add(slFieldSize);

        add(new JLabel("Choose win length"));
        JLabel lblWinLength = new JLabel(STR_WIN_LEN + MIN_WIN_LINE);
        add(lblWinLength);
        slWinLength = new JSlider(MIN_WIN_LINE,MAX_WIN_LINE,MIN_WIN_LINE);
        slWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int newCurrentWinLength = slWinLength.getValue();
                lblWinLength.setText(STR_WIN_LEN + newCurrentWinLength);
            }
        });
        add(slWinLength);
    }

    private void addGameControlMode() {
        add(new JLabel("Choose game mode"));
        gameMode.add(jrbHumVsAi);
        gameMode.add(jrbHumVsHum);
        add(jrbHumVsAi);
        add(jrbHumVsHum);
    }
}
