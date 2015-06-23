package com.adaptionsoft.games.trivia;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.Test;

import java.util.Random;

public class SomeTest {

	@Test
	public void a_single_player_counts_as_one_player() throws Exception {
        Game agame = new Game();

        agame.add("1");

        assertThat(agame.howManyPlayers(), is(1));

	}

    @Test
    public void seven_players_is_playable() throws Exception {
        Game agame = new Game();

        agame.add("1");
        agame.add("2");
        agame.add("3");
        agame.add("4");
        agame.add("5");
        agame.add("6");
        agame.add("7");

        assertThat(agame.howManyPlayers(), is(7));

    }

    @Test
    public void a_player_that_always_guesses_correct_should_win() throws Exception {



        boolean notAWinner=true;
        Game aGame = new Game();

        boolean[] answers = new boolean[]{true, false};

        aGame.add("Chet");
        aGame.add("Pat");

        assertTrue(aGame.isPlayable());

        for(int i=0;i<6;i++) {
            notAWinner = aGame.wasCorrectlyAnswered();
        }
        assertFalse(notAWinner);

    }
}
