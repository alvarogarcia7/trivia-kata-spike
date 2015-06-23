package com.adaptionsoft.games.trivia;

import static org.junit.Assert.*;

import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.Test;

import java.util.stream.Stream;

public class SomeTest {

	@Test
	public void test_max_players_reached() throws Exception {
		Game game = new Game();
        for (int i = 0; i < 7; i++) {
            game.add("player" + i);
        }
	}
}
