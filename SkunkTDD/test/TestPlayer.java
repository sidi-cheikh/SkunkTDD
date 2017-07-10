import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPlayer {

	Player testPlayer;
	String testPlayerName = "Player1";
	
	@Before
	public void setUp(){
		testPlayer = new Player(testPlayerName);
	}
	
	@Test
	public void canGetThePlayerName(){
		testPlayer.getName();
	}
	
	@Test
	public void playerNameIsSetCorrectly(){
		assertEquals(testPlayerName, testPlayer.getName());
	}

}
