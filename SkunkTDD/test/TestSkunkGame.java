import static org.junit.Assert.*;

import org.junit.Test;

public class TestSkunkGame {

	@Test
	public void canCreateSkunkGame() {
		String[] playerNames = new String[]{"Player1", "Player2"};
		new SkunkGame(playerNames);
	}

}
