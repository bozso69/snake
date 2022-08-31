package ai;

import java.awt.Color;

import ai.Sajat.sajatAi;
import ai.Sajat.snakeSajat;


public class Main {

    public static void main(String[] args) {
        snakeSajat snake = new snakeSajat();
        //SnakeSajat snake = new Snake();
        snake.addAI(new MintaAi(), Color.red.darker());
        snake.addAI(new sajatAi(), Color.GREEN.darker());
	// Az itt talalhato ai helyettesitendo az elkeszitett aival
    //  snake.addAI(new MintaAi(), Color.blue.darker());
        snake.start();
    }

}
