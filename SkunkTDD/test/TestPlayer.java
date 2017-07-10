import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayer {

	@Test
	public void canCreateAPlayer() {
		new Player("Player1");
	}
	
	@Test
	public void canGetThePlayerName(){
		Player p = new Player("Player1");
		p.getName();
	}

}
