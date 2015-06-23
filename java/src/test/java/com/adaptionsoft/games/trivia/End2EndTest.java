
package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class End2EndTest {


    @Test
	public void test_with_seed1(){
        playGameWithSeed(1L);
        playGameWithSeed(2L);
        playGameWithSeed(3L);
        playGameWithSeed(4L);
        playGameWithSeed(5L);
        playGameWithSeed(6L);
	}

    @Test
    public void playGameWith7Players() {
        boolean notAWinner;
        Game aGame = new Game();

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue1");
        aGame.add("Sue2");
        aGame.add("Sue3");
        aGame.add("Sue4");
        aGame.add("Sue5");

        assertTrue(aGame.isPlayable());

        Random rand = new Random(1L);

        do {

            aGame.roll(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                notAWinner = aGame.wrongAnswer();
            } else {
                notAWinner = aGame.wasCorrectlyAnswered();
            }



        } while (notAWinner);
    }

    private void playGameWithSeed(long seed) {
        boolean notAWinner;
        Game aGame = new Game();

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        assertTrue(aGame.isPlayable());

         Random rand = new Random(seed);

        do {

            aGame.roll(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                notAWinner = aGame.wrongAnswer();
            } else {
                notAWinner = aGame.wasCorrectlyAnswered();
            }



        } while (notAWinner);
    }
}
