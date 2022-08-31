package ai;

import java.awt.Color;
import kukac.Snake;


public class Main {

    public static void main(String[] args) {
        Snake snake = new Snake();
        snake.addAI(new MintaAi(), Color.red.darker());
        snake.addAI(new sajatAi(), Color.GREEN.darker());
	// Az itt talalhato ai helyettesitendo az elkeszitett aival
    //  snake.addAI(new MintaAi(), Color.blue.darker());
        snake.start();
    }

}
