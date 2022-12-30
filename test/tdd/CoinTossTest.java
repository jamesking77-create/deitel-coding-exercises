package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossTest {
    private  CoinTossGame coinTossGame;

    @BeforeEach
    public void setUp(){
        coinTossGame = new  CoinTossGame();
    }

    @Test

    public void testThatGameExist(){
        assertNotNull(coinTossGame);
    }
    @Test

    public void testMenuOption(){
        String menu = CoinTossGame.getGameMenu();
        assertTrue(menu.equals("""
                1. Toss coin 
                2. Exit game
                """));

    }
    @Test
    public void testCoinFlip(){


    }

}
